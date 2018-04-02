/**
 * 
 */
package com.devbanck.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.devbanck.converter.BancoConverter;
import com.devbanck.entity.Banco;
import com.devbanck.model.BancoModel;
import com.devbanck.repository.BancoRepository;
import com.devbanck.service.BancoService;

/**
 * @author JorgeLuna
 *
 */

@Service("BancoServiceImpl")
public class BancoServiceImpl implements BancoService{

	private static final Log LOG =LogFactory.getLog(BancoServiceImpl.class);

	
	@Autowired
	@Qualifier("BancoRepository")
	private BancoRepository bancoRepo;
	
	@Autowired
	@Qualifier("bancoconverter")
	private BancoConverter Converban;
	
	@Override
	public Banco agregaBanco(BancoModel ban) {
		LOG.info("Call: ---> agregaBanco()");	
		
		Banco banc = bancoRepo.save(Converban.bancoModelToBanco(ban));
		return banc;
	}


	@Override
	public List<BancoModel> listBanco() {
		LOG.info("Call: ---> listBanco()");
		List<Banco> todosbancos = bancoRepo.findAll();
		LOG.info("Fue exitoso la consulta "+ todosbancos);
		List<BancoModel> banmod= new ArrayList<BancoModel>();
		for(Banco banc: todosbancos) {
			banmod.add(Converban.bancoToBancoModel(banc));
			LOG.info("Se agrego correctamente "+ banmod);
		}
		LOG.info("Lista ---> "+ banmod);
		return banmod;
	}


	@Override
	public Banco findBancoById(int id) {
		return bancoRepo.findById(id);
		
	}


	@Override
	public void deleteBanco(int id) {
		Banco banc = findBancoById(id);
		if (null != banc) {
			bancoRepo.delete(banc);
		}
	}

}

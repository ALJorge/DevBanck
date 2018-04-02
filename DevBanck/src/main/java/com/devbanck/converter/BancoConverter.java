/**
 * 
 */
package com.devbanck.converter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.devbanck.entity.Banco;
import com.devbanck.model.BancoModel;
import com.devbanck.service.serviceImpl.BancoServiceImpl;

/**
 * @author JorgeLuna
 *
 */
@Component("bancoconverter")
public class BancoConverter {

	private static final Log LOG =LogFactory.getLog(BancoServiceImpl.class);
	
	//Entity -->to --> Model
	public BancoModel bancoToBancoModel(Banco ban) {
		BancoModel banMod =new BancoModel();
		banMod.setIdMod(ban.getId());
		banMod.setBnombreMod(ban.getBnombre());
		banMod.setBdireccionMod(ban.getBdireccion());
		banMod.setBstatusMod(ban.getBestatus());
		banMod.setBsucursalMod(ban.getBsucursal());
		banMod.setBtelefonoMod(ban.getBtelefono());
		LOG.info("Se convirtio de Entity a Model " + banMod);
		return banMod;
	}
	
	//Model --> to -->Entity
	public Banco bancoModelToBanco(BancoModel banmod) {
		Banco ban=new Banco();
		ban.setId(banmod.getIdMod());
		ban.setBdireccion(banmod.getBdireccionMod());
		ban.setBestatus(banmod.getBstatusMod());
		ban.setBnombre(banmod.getBnombreMod());
		ban.setBsucursal(banmod.getBsucursalMod());
		ban.setBtelefono(banmod.getBtelefonoMod());
		return ban;
	}
	
}

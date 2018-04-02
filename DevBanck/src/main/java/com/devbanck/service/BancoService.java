/**
 * 
 */
package com.devbanck.service;

import java.util.List;

import com.devbanck.entity.Banco;
import com.devbanck.model.BancoModel;


/**
 * @author JorgeLuna
 *
 */
public interface BancoService {

	public abstract Banco agregaBanco(BancoModel ban);
	public abstract List<BancoModel> listBanco();
	public abstract Banco findBancoById(int id);
	public abstract void deleteBanco(int id);
}

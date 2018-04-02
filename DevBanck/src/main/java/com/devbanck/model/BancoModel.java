/**
 * 
 */
package com.devbanck.model;

/**
 * @author JorgeLuna
 *
 */
public class BancoModel {

	private int idMod;
	private String BnombreMod;
	private String BsucursalMod;
	private String BdireccionMod;
	private int BstatusMod;
	private int btelefonoMod;
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BancoModel [idMod=" + idMod + ", BnombreMod=" + BnombreMod + ", BsucursalMod=" + BsucursalMod
				+ ", BdireccionMod=" + BdireccionMod + ", BstatusMod=" + BstatusMod + ", btelefonoMod=" + btelefonoMod
				+ "]";
	}
	public BancoModel(int idMod, String bnombreMod, String bsucursalMod, String bdireccionMod, int bstatusMod,
			int btelefonoMod) {
		super();
		this.idMod = idMod;
		BnombreMod = bnombreMod;
		BsucursalMod = bsucursalMod;
		BdireccionMod = bdireccionMod;
		BstatusMod = bstatusMod;
		this.btelefonoMod = btelefonoMod;
	}
	public BancoModel() {
	}
	
	
	/**
	 * @return the idMod
	 */
	public int getIdMod() {
		return idMod;
	}
	/**
	 * @param idMod the idMod to set
	 */
	public void setIdMod(int idMod) {
		this.idMod = idMod;
	}
	public String getBnombreMod() {
		return BnombreMod;
	}
	public void setBnombreMod(String bnombreMod) {
		BnombreMod = bnombreMod;
	}
	public String getBsucursalMod() {
		return BsucursalMod;
	}
	public void setBsucursalMod(String bsucursalMod) {
		BsucursalMod = bsucursalMod;
	}
	public String getBdireccionMod() {
		return BdireccionMod;
	}
	public void setBdireccionMod(String bdireccionMod) {
		BdireccionMod = bdireccionMod;
	}
	public int getBstatusMod() {
		return BstatusMod;
	}
	public void setBstatusMod(int bstatusMod) {
		BstatusMod = bstatusMod;
	}
	public int getBtelefonoMod() {
		return btelefonoMod;
	}
	public void setBtelefonoMod(int btelefonoMod) {
		this.btelefonoMod = btelefonoMod;
	}
	
	
	
	
}

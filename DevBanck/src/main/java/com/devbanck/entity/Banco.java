/**
 * 
 */
package com.devbanck.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author JorgeLuna
 *
 */

@Entity
@Table(name="banco")
public class Banco {

	@Id
	@GeneratedValue
	@Column(name="Id")
	private int id;
	@Column(name="Bnombre")
	private String Bnombre;
	@Column(name="Bsucursal")
	private String Bsucursal;
	@Column(name="Bdireccion")
	private String Bdireccion;
	@Column(name="Bestatus")
	private int Bestatus;
	@Column(name="Btelefono")
	private int Btelefono;
	
	
	
	public Banco() {
		
	}



	


	public Banco(int id, String bnombre, String bsucursal, String bdireccion, int bestatus, int btelefono) {
		super();
		this.id = id;
		Bnombre = bnombre;
		Bsucursal = bsucursal;
		Bdireccion = bdireccion;
		Bestatus = bestatus;
		Btelefono = btelefono;
	}






	public int getBtelefono() {
		return Btelefono;
	}






	public void setBtelefono(int btelefono) {
		Btelefono = btelefono;
	}






	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getBnombre() {
		return Bnombre;
	}



	public void setBnombre(String bnombre) {
		Bnombre = bnombre;
	}



	public String getBsucursal() {
		return Bsucursal;
	}



	public void setBsucursal(String bsucursal) {
		Bsucursal = bsucursal;
	}



	public String getBdireccion() {
		return Bdireccion;
	}



	public void setBdireccion(String bdireccion) {
		Bdireccion = bdireccion;
	}



	public int getBestatus() {
		return Bestatus;
	}



	public void setBestatus(int bestatus) {
		Bestatus = bestatus;
	}



	@Override
	public String toString() {
		return "Banco [id=" + id + ", Bnombre=" + Bnombre + ", Bsucursal=" + Bsucursal + ", Bdireccion=" + Bdireccion
				+ ", Bestatus=" + Bestatus + "]";
	}
	
		
	
	
	
}

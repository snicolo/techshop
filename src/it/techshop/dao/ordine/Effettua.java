package it.techshop.dao.ordine;

import java.util.Date;


public class Effettua {
	Date dataordine;
	int idcliente;
	int idordine;
	
	public Effettua(){
		super();
		this.dataordine=dataordine;
		this.idcliente=idcliente;
		this.idordine=idordine;
	}
	
	public Date getDataordine(){
		return dataordine;
	}
	
	public void setDataordine(Date dataordine){
		this.dataordine=dataordine;
	}
	
	public int getIdcliente(){
		return idcliente;
	}
	
	public void setIdcliente(int idcliente){
		this.idcliente=idcliente;
	}
	
	public int getIdordine(){
		return idordine;
	}
	public void setIdordine(int idordine){
		this.idordine=idordine;
	}
}

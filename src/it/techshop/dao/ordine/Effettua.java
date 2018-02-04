package it.techshop.dao.ordine;

import java.util.Date;


public class Effettua {
	private Date dataordine;
	private int idcliente;
	private int idordine;
	
	public Effettua(){
		super();
	}
	public Effettua(Date dataordine, int idcliente, int idordine){
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idordine;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Effettua other = (Effettua) obj;
		if (idordine != other.idordine)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cliente [idOrdine=" + idordine + ", idcliente=" + idcliente +", dataordine=" + dataordine +"]";
	}
	
}


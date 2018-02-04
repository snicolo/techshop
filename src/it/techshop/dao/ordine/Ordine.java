package it.techshop.dao.ordine;

import it.techshop.dao.beans.Cliente;

public class Ordine { 
	private int idOrdine;
	private Float importoOrd;
	
	public Ordine(){
		super();
	}
	
	public Ordine(int Ordine, Float importoOrd){
		super();
		this.idOrdine = idOrdine;
		this.importoOrd = importoOrd;
	}
	
	public int getIdOrdine(){
		return idOrdine;
	}
	
	public void setIdOrdine(int idOrdine){
		this.idOrdine = idOrdine;
	}
	
	public Float getImportoOrdine(){
		return importoOrd;
	}
	
	public void setImportoOrdine(Float importoOrd){
		this.importoOrd = importoOrd;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idOrdine;
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
		Ordine other = (Ordine) obj;
		if (idOrdine != other.idOrdine)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Cliente [idOrdine=" + idOrdine + ", importoOrd=" + importoOrd +"]";
	}
	
}


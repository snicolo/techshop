package it.techshop.dao.ordine;

public class Ordine { 
	private int idOrdine;
	private Float importoOrd;
	
	public Ordine(){
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
}

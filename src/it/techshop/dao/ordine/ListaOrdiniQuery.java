package it.techshop.dao.ordine;

import java.util.Date;

public class ListaOrdiniQuery {
	private int idcliente;
	private int idordine;
	private Date dataordine;
	private Float importoord;
	private String idprodotto;
	
	public ListaOrdiniQuery(){
		super();
	}
	
	public ListaOrdiniQuery(int idcliente, int idordine, Date dataordine, Float importoord, String idprodotto){
		super();
		this.idcliente=idcliente;
		this.idordine=idordine;
		this.dataordine=dataordine;
		this.importoord=importoord;
		this.idprodotto=idprodotto;
	}
	
	public int getIdcliente(){
		return idcliente;
	}
	
	public void setIdcliente(int idcliente){
		this.idcliente = idcliente;
	}
	
	public int getIdordine(){
		return idordine;
	}
	
	public void setIdordine(int idordine){
		this.idordine = idordine;
	}
	
	public Date getDataordine(){
		return dataordine;
	}
	
	public void setDataordine(Date dataordine){
		this.dataordine = dataordine;
	}
	
	public Float getImportoordine(){
		return importoord;
	}
	
	public void setImportoordine(Float importoord){
		this.importoord = importoord;
	}
	public String getIdprodotto(){
		return idprodotto;
	}
	public void setIdprodotto(String idprodotto){
		this.idprodotto = idprodotto;
	}

}

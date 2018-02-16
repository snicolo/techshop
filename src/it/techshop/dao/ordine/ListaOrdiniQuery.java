package it.techshop.dao.ordine;

import java.util.Date;

public class ListaOrdiniQuery {
	private int idcliente;
	private int idordine;
	private Date dataordine;
	private Float importoord;
	private String idprodotto;
	private String nome;
	private String cognome;
	private String username;
	private String nomeprodotto;
	private Float prezzoprodotto;
	
	
	public ListaOrdiniQuery(){
		super();
	}
	
	public ListaOrdiniQuery(int idcliente, int idordine, Date dataordine, Float importoord, String idprodotto, String nome, String cognome, String username, String nomeprodotto, Float prezzoprodotto){
		super();
		this.idcliente=idcliente;
		this.idordine=idordine;
		this.dataordine=dataordine;
		this.importoord=importoord;
		this.idprodotto=idprodotto;
		this.nomeprodotto=nomeprodotto;
		this.prezzoprodotto=prezzoprodotto;
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
	
	public String getNome (){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome=nome;
	}
	
	public String getCognome(){
		return cognome;
	}
	
	public void setCognome(String cognome){
	   this.cognome=cognome;
	}
	public String getUsername(){
		return username;
	}
	
	public void setUsername(String username){
		this.username=username;
	}
	
	public String getNomeProdotto(){
		return nomeprodotto;
	}
	
	public void setNomeProdotto(String nomeprodotto){
		this.nomeprodotto=nomeprodotto;
	}
	
	public Float getPrezzoProdotto(){
		return prezzoprodotto;
	}
	
	public void setPrezzoProdotto(Float prezzoprodotto){
		this.prezzoprodotto=prezzoprodotto;
	}
}

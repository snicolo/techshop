package it.techshop.dao.news;

import java.util.Date;

public class News {
	private String idnews;
	private Date data;
	private String descrizione;
	private String titolo;
	public News(){
		super();
	}
  public News(String idnews, Date data, String descrizione, String titolo){
	  super();
	  this.idnews = idnews;
	  this.data = data;
	  this.descrizione = descrizione;
	  this.titolo = titolo;
  }
  
  public String getIdnews(){
	  return idnews;
  }
  
  public void setIdnews(String idnews){
	  this.idnews = idnews;
  }
  
  public Date getData(){
	  return data;
  }
  
  public void setData(Date data){
	  this.data = data;
  }
  
  public String getDescrizione(){
	  return descrizione;
  }
  
  public void setDescrizione(String descrizione){
	  this.descrizione = descrizione;
  }
  
  public String getTitolo(){
	  return titolo;
  }
  public void setTitolo(String titolo){
	  this.titolo = titolo;
  }
}


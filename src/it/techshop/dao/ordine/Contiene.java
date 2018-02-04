package it.techshop.dao.ordine;

public class Contiene {
      private int idordine;
      private String idprodotto;
      
      public Contiene(){
    	  super();
      }
      
      public Contiene(int idordine, String idprodotto){
    	  super();
    	  this.idordine=idordine;
    	  this.idprodotto=idprodotto;
      }
      
      public int getIdordine(){
    	  return idordine;
      }
      
      public void setIdordine(int idordine){
    	  this.idordine=idordine;
      }
      
      public String getIdprodotto(){
    	  return idprodotto;
      }
      public void setIdprodotto(String idprodotto){
    	  this.idprodotto=idprodotto;
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
  		Contiene other = (Contiene) obj;
  		if (idordine != other.idordine)
  			return false;
  		return true;
  	}
  	@Override
  	public String toString() {
  		return "Cliente [idordine=" + idordine + ", idprodotto=" + idprodotto +"]";
  	}
  	
  }
      


package it.techshop.dao.beans;

public class Client {

	    private int idcliente;
		private String username;
		private String password;
		private String nome;
		private String cognome;
		private String indirizzo;
		private String cf_piva;
		private String telefono;
		private String email;
		
		public Client(){
			super();
			
		}
		
		public Client(int idcliente, String username, String password, String nome, String cognome, String indirizzo, String cf_piva, String telefono, String email){
			super();
			this.idcliente = idcliente;
			this.username = username;
			this.password = password;
			this.nome = nome;
			this.cognome = cognome;
			this.indirizzo = indirizzo;
			this.telefono = telefono;
			this.email = email;
			
		}
		
		public int getIdCliente(){
			return idcliente;
		}
		
		public void setIdcliente(int idcliente){
			this.idcliente = idcliente;
		}
		
		public String getUsername(){
			return username;
		}
		
		public void setUsername(String username){
			this.username = username;
		}
		
		public String getPassword(){
			return password;
		}
		
		public void setPassword(String password){
			this.password = password;
		}
		
		public String getNome(){
			return nome;
		}
		
		public void setNome(String nome){
			this.nome = nome;
		}
		
		public String getCognome(){
			return cognome;
		}
		
		public void setCognome(String cognome){
			this.cognome = cognome;
		}
		
		public String getIndirizzo(){
			return indirizzo;
		}
		
		public void setIndirizzo(String indirizzo){
			this.indirizzo = indirizzo;
		}
		
		public String getTelefono(){
			return telefono;
		}
		
		public void setTelefono(String telefono){
			this.telefono = telefono;
		}
		
		public String getEmail(){
			return email;
		}
		
		public void setEmail(String email){
			this.email = email;
		}
	}


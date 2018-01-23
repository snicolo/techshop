package it.techshop.dao.beans;



public class Cliente {

	    private int idcliente;
		private String username;
		private String password;
		private String nome;
		private String cognome;
		private String indirizzo;
		private String cf_piva;
		private int telefono;
		private String email;
		
		public Cliente(){
			super();
			
		}
		
		public Cliente(int idcliente, String username, String password, String nome, String cognome, String indirizzo, String cf_piva, int telefono, String email){
			super();
			this.idcliente = idcliente;
			this.username = username;
			this.password = password;
			this.nome = nome;
			this.cognome = cognome;
			this.indirizzo = indirizzo;
			this.cf_piva = cf_piva;
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
		
		public String getCFPIVA(){
			return cf_piva;
		}
		
		public void setCFPIVA(String cf_piva){
			this.cf_piva = cf_piva;
		}
		
		public int getTelefono(){
			return telefono;
		}
		
		public void setTelefono(int telefono){
			this.telefono = telefono;
		}
		
		public String getEmail(){
			return email;
		}
		
		public void setEmail(String email){
			this.email = email;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + idcliente;
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
			Cliente other = (Cliente) obj;
			if (idcliente != other.idcliente)
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "Cliente [idCliente=" + idcliente + ", username=" + username +", password=" + password +", nome=" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo +", cf_piva=" + cf_piva +", email=" + email +", telefono=" + telefono + "]";
		}
		
	}



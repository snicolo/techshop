package it.techshop.dao.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import it.techshop.dao.utils.DBManager;


public class ClientDAO {
	
	private Connection conn;
	
	public Client loginCliente(Client cliente){
		String user=cliente.getUsername();
		String pw=cliente.getPassword();
		
		String query = "SELECT * FROM CLIENTE WHERE username =? AND password=?";
		System.out.println(query);
		
		Client res = null;
		
		PreparedStatement ps;
		
		conn=DBManager.startConnection();
		try {
			ps = conn.prepareStatement(query);
			ps.setString(1, cliente.getUsername());
			ps.setString(2,  cliente.getPassword());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				res=new Client();
				res.setIdcliente(rs.getInt("idliente"));
				res.setUsername(rs.getString("username"));
				res.setNome(rs.getString("nome"));
				res.setCognome(rs.getString("cognome"));
				res.setIndirizzo(rs.getString("indirizzo"));
				res.setCFPIVA(rs.getString("cf_piva"));
				res.setTelefono(rs.getString("telefono"));
				res.setEmail(rs.getString("email"));
				res.setPassword(rs.getString("password"));
			}
		} catch (SQLException e){
			e.printStackTrace();
		}
		
		DBManager.closeConnection();
		return res;
		
	}
	
	public Vector<Client> getClienti(){
		String query = "SELECT * FROM CLIENTE";
		Vector<Client> res = new Vector<Client>();
		
		PreparedStatement ps;
		conn=DBManager.startConnection();
		try{
			ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				Client cliente = new Client();
				cliente.setIdcliente(rs.getInt("idliente"));
				cliente.setUsername(rs.getString("username"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCognome(rs.getString("cognome"));
				cliente.setIndirizzo(rs.getString("indirizzo"));
				cliente.setCFPIVA(rs.getString("cf_piva"));
				cliente.setTelefono(rs.getString("telefono"));
				cliente.setEmail(rs.getString("email"));
				cliente.setPassword(rs.getString("password"));
				
				res.add(cliente);
				
			}} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			DBManager.closeConnection();
			
			return res;
		}
		
	public boolean salvaCliente(Client cliente){
		
		String query = "INSERT INTO CLIENTE VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)";
		
		boolean esito = false;
		
		PreparedStatement ps;
		
		conn=DBManager.startConnection();
		try {
			
			ps=conn.prepareStatement(query);
			ps.setString(1, cliente.getUsername());
			ps.setString(2, cliente.getNome());
			ps.setString(3,  cliente.getCognome());
			ps.setString(4, cliente.getIndirizzo());
			ps.setString(5, cliente.getCFPIVA());
			ps.setString(6, cliente.getTelefono());
			ps.setString(7, cliente.getTelefono());
			ps.setString(8, cliente.getPassword());
			
			int tmp = ps.executeUpdate();
			if(tmp == 1)
				esito = true;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		DBManager.closeConnection();
		return esito;
		
	}
	
	public Client getCliente(Client cliente){
		String usr= cliente.getUsername();
		String cfpiva = cliente.getCFPIVA();
		
		String query = "SELECT * FROM CLIENTE WHERE username=? OR cf_piva=?";
		System.out.println(query);
		
		Client res = null;
		
		PreparedStatement ps;
		
		conn=DBManager.startConnection();
		try{
			ps = conn.prepareStatement(query);
			ps.setString(1, cliente.getUsername());
			ps.setString(2,  cliente.getCFPIVA());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				res = new Client();
				res.setUsername( rs.getString("username"));
				res.setNome(rs.getString("nome"));
				res.setCognome(rs.getString("cognome"));
				res.setIndirizzo(rs.getString("indirizzo"));
				res.setCFPIVA(rs.getString("cf_piva"));
				res.setEmail(rs.getString("email"));
				res.setTelefono(rs.getString("telefono"));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		DBManager.closeConnection();
		return res;
		
	}
		
	}



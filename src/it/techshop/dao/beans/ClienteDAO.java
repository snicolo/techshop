package it.techshop.dao.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.sql.CallableStatement;

import it.techshop.dao.utils.DBManager;


public class ClienteDAO {
	
	private Connection conn;
	
	public Cliente loginCliente(Cliente cliente){
		String user=cliente.getUsername();
		String pw=cliente.getPassword();
		
		String query = "SELECT * FROM CLIENTE WHERE username =? AND password=?";
		System.out.println(query);
		
		Cliente res = null;
		
		PreparedStatement ps;
		
		conn=DBManager.startConnection();
		try {
			ps = conn.prepareStatement(query);
			ps.setString(1, cliente.getUsername());
			ps.setString(2,  cliente.getPassword());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				res=new Cliente();
				res.setIdcliente(rs.getInt("idcliente"));
				res.setUsername(rs.getString("username"));
				res.setPassword(rs.getString("password"));
				res.setNome(rs.getString("nome"));
				res.setCognome(rs.getString("cognome"));
				res.setIndirizzo(rs.getString("indirizzo"));
				res.setCFPIVA(rs.getString("cf_piva"));
				res.setTelefono(rs.getInt("telefono"));
				res.setEmail(rs.getString("email"));
				
			}
		} catch (SQLException e){
			e.printStackTrace();
		}
		
		DBManager.closeConnection();
		return res;
		
	}
	
	public Vector<Cliente> getClienti(){
		String query = "SELECT * FROM CLIENTE";
		Vector<Cliente> res = new Vector<Cliente>();
		
		System.out.println("Entrato" + res.size());
		
		PreparedStatement ps;
		conn=DBManager.startConnection();
		try{
			ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				Cliente cliente = new Cliente();
				cliente.setIdcliente(rs.getInt("idcliente"));
				cliente.setUsername(rs.getString("username"));
				cliente.setPassword(rs.getString("password"));
				cliente.setNome(rs.getString("nome"));
				cliente.setCognome(rs.getString("cognome"));
				cliente.setIndirizzo(rs.getString("indirizzo"));
				cliente.setCFPIVA(rs.getString("cf_piva"));
				cliente.setTelefono(rs.getInt("telefono"));
				cliente.setEmail(rs.getString("email"));
				
				
				res.add(cliente);
				
			}} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			
			}
			DBManager.closeConnection();
			
			return res;
		}
		
	public boolean salvaCliente(Cliente cliente){
		
		String query = "INSERT INTO CLIENTE VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		boolean esito = false;
		
		PreparedStatement ps;
		
		conn=DBManager.startConnection();
		try {
			
			ps=conn.prepareStatement(query);
			ps.setInt(1,  cliente.getIdCliente());
			ps.setString(2, cliente.getUsername());
			ps.setString(3, cliente.getPassword());
			ps.setString(4, cliente.getNome());
			ps.setString(5,  cliente.getCognome());
			ps.setString(6, cliente.getIndirizzo());
			ps.setString(7, cliente.getCFPIVA());
			ps.setInt(8, cliente.getTelefono());
		    ps.setString(9, cliente.getPassword());
			
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
	
	public Cliente getCliente(Cliente cliente){
		String usr= cliente.getUsername();
		String cfpiva = cliente.getCFPIVA();
		
		String query = "SELECT * FROM CLIENTE WHERE username=? OR cf_piva=?";
		System.out.println(query);
		
		Cliente res = null;
		
		PreparedStatement ps;
		
		conn=DBManager.startConnection();
		try{
			ps = conn.prepareStatement(query);
			ps.setString(1, cliente.getUsername());
			ps.setString(2,  cliente.getCFPIVA());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				res = new Cliente();
				res.setIdcliente(rs.getInt("idcliente"));
				res.setUsername( rs.getString("username"));
				res.setPassword(rs.getString("password"));
				res.setNome(rs.getString("nome"));
				res.setCognome(rs.getString("cognome"));
				res.setIndirizzo(rs.getString("indirizzo"));
				res.setCFPIVA(rs.getString("cf_piva"));
				res.setEmail(rs.getString("email"));
				res.setTelefono(rs.getInt("telefono"));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		DBManager.closeConnection();
		return res;
		
	}
		
	}



package it.techshop.dao.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.sql.CallableStatement;

import it.techshop.dao.news.News;
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
				res.setTelefono(rs.getString("telefono"));
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
				cliente.setTelefono(rs.getString("telefono"));
				cliente.setEmail(rs.getString("email"));
				
				
				res.add(cliente);
				
			}} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			
			}
			DBManager.closeConnection();
			
			return res;
		}
		
	public Cliente salvaCliente(Cliente cliente){
		
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
			ps.setString(8, cliente.getTelefono());
		    ps.setString(9, cliente.getPassword());
			
			int tmp = ps.executeUpdate();
			if(tmp == 1)
				esito = true;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		DBManager.closeConnection();
		return cliente;
		
	}
	
	public Cliente getCliente(Cliente cliente){
		String usr= cliente.getUsername();
		String cfpiva = cliente.getCFPIVA();
		int id = cliente.getIdCliente();
		
		String query = "SELECT * FROM CLIENTE WHERE idcliente=? OR username=? OR cf_piva=?";
		System.out.println(query);
		
		Cliente res = null;
		
		PreparedStatement ps;
		
		conn=DBManager.startConnection();
		try{
			ps = conn.prepareStatement(query);
			ps.setInt(1, cliente.getIdCliente());
			ps.setString(2, cliente.getUsername());
			ps.setString(3,  cliente.getCFPIVA());
			
			
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
				res.setTelefono(rs.getString("telefono"));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		DBManager.closeConnection();
		return res;
		
	}
	
	
	public Cliente UpdateCliente(Cliente cliente){
		int id = cliente.getIdCliente();
		
		String query = "UPDATE cliente SET username=?, password=?, nome=?, cognome=?, indirizzo=?, cf_piva=?, telefono=?, email=? WHERE idcliente=?";
		System.out.println(query);
		
		Cliente res = null;
		
		PreparedStatement ps;
		
		conn=DBManager.startConnection();
		try{
			ps = conn.prepareStatement(query);
			//
			ps.setString(1, cliente.getUsername() );
			ps.setString(2,  cliente.getPassword());
			ps.setString(3, cliente.getNome());
			ps.setString(4, cliente.getCognome());
			ps.setString(5, cliente.getIndirizzo());
			ps.setString(6,  cliente.getCFPIVA());
			ps.setString(7,  cliente.getTelefono());
			ps.setString(8, cliente.getEmail());
			ps.setInt(9, cliente.getIdCliente());
			
			
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
				res.setTelefono(rs.getString("telefono"));
				res.setEmail(rs.getString("email"));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		DBManager.closeConnection();
		return res;
		
	}
	
	public Cliente rimuoviCliente(Cliente cliente){
		int idc=cliente.getIdCliente();
		
		String query="DELETE FROM CLIENTE WHERE idcliente=?";
		System.out.println(query);
		
		Cliente res = null;
		PreparedStatement ps;
		conn=DBManager.startConnection();
		try{
			ps = conn.prepareStatement(query);
			ps.setInt(1,  cliente.getIdCliente());
			
			ResultSet rs = ps.executeQuery();
			
			//if(rs.next()){
				//res = new Cliente();
				//res.setIdnews(rs.getString("idnews"));
				//res.setData(rs.getDate("data"));
				//res.setDescrizione(rs.getString("descrizione"));
				//res.setTitolo(rs.getString("titolo"));
			//}
		} catch(SQLException e){
			e.printStackTrace();
		
			}
			DBManager.closeConnection();
			return res;
		
	}
	
	public Cliente RicercaCliente(Cliente cliente){
		String usr= cliente.getUsername();
		
		String query = "SELECT * FROM CLIENTE WHERE username=?";
		System.out.println(query);
		
		Cliente res = null;
		
		PreparedStatement ps;
		
		conn=DBManager.startConnection();
		try{
			ps = conn.prepareStatement(query);
			
			ps.setString(1, cliente.getUsername());
			
			
			
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



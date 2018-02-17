package it.techshop.dao.ordine;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import it.techshop.dao.beans.Cliente;
import it.techshop.dao.utils.DBManager;

public class OrdineDAO {
	
	private Connection conn;
	 
	public Ordine getOrdine(Ordine ordine){
		int idord= ordine.getIdOrdine();
		
		String query = "SELECT * FROM ORDINE WHERE idordine=?";
		System.out.println(query);
		
		Ordine res = null;
		
		PreparedStatement ps;
		
		conn=DBManager.startConnection();
		try {
			ps = conn.prepareStatement(query);
			ps.setInt(1, ordine.getIdOrdine());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				res= new Ordine();
				res.setIdOrdine(rs.getInt("idordine"));
				res.setImportoOrdine(rs.getFloat("importoOrdine"));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		   e.printStackTrace();  
		} 
		DBManager.closeConnection();
		return res;
	}
	
	public boolean salvaOrdine(Ordine ordine){
		String query = "INSERT INTO ORDINE VALUES (?,?)";
		
		boolean esito=false;
		
		PreparedStatement ps;
		conn=DBManager.startConnection();
		try{
			ps=conn.prepareStatement(query);
			ps.setInt(1, ordine.getIdOrdine());
			ps.setFloat(2, ordine.getImportoOrdine());
			
			int tmp=ps.executeUpdate();
			if(tmp==1)
				esito=true;
			
		} catch (SQLException e) {
			e.printStackTrace();
			
			// TODO: handle exception
		}
			DBManager.closeConnection();	
		return esito;
		
	}
	
    public Vector<Ordine> getOrdini(){
    	String query = "SELECT * FROM ORDINE";
    	Vector<Ordine> res = new Vector<Ordine>();
    	
    	PreparedStatement ps;
    	conn=DBManager.startConnection();
    	try {
    		ps = conn.prepareStatement(query);
    		ResultSet rs = ps.executeQuery();
    		
    		while(rs.next()){
    			Ordine ordine = new Ordine();
    			ordine.setIdOrdine(rs.getInt("idordine"));
    			ordine.setImportoOrdine(rs.getFloat("importoOrdine"));
    			
    			res.add(ordine);
    		}} catch (SQLException e) {
    			e.printStackTrace();
				// TODO: handle exception
			} DBManager.closeConnection();
			   return res;
    	
    	
    }
    
    public Ordine rimuoviOrdine(Ordine ordine){
		int ido=ordine.getIdOrdine();
		
		String query="DELETE FROM ORDINE WHERE idordine=?";
		System.out.println(query);
		
		Ordine res = null;
		PreparedStatement ps;
		conn=DBManager.startConnection();
		try{
			ps = conn.prepareStatement(query);
			ps.setInt(1,  ordine.getIdOrdine());
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				res = new Ordine();
				res.setIdOrdine(rs.getInt("idordine"));
				res.setImportoOrdine(rs.getFloat("importoord"));
				
			}
			
			
		} catch(SQLException e){
			e.printStackTrace();
		
			}
			DBManager.closeConnection();
			return res;
		
	}
}

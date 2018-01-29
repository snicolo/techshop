package it.techshop.dao.ordine;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Vector;

import it.techshop.dao.utils.DBManager;


public class EffettuaDAO {

	private Connection conn;
	
	public Effettua getOrdineEff(Effettua effettua){
		Date dataord=effettua.getDataordine();
		int idcl=effettua.getIdcliente();
		
		String query = "SELECT idordine FROM EFFETTUA WHERE dataordine=? OR idcliente=?";
		System.out.println(query);
		Effettua res = null;
		
		PreparedStatement ps;
		conn=DBManager.startConnection();
		try{
			ps=conn.prepareStatement(query);
			ps.setDate(1, (java.sql.Date) effettua.getDataordine());
			ps.setInt(2, effettua.getIdcliente());
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				res = new Effettua();
				res.setDataordine(rs.getDate("dataordine"));
				res.setIdcliente(rs.getInt("idcliente"));
				res.setIdordine(rs.getInt("idordine"));
			
			} 
		} catch (SQLException e) {
			// TODO: handle exception
		   e.printStackTrace();
		}
		DBManager.closeConnection();
		return res;
		
	}
	
	public Vector<Effettua> getClientiOrdine(){
		String query = "SELECT idcliente FROM EFFETTUA";
		Vector<Effettua> res = new Vector<Effettua>();
		
		PreparedStatement ps;
		conn=DBManager.startConnection();
		try{
			ps=conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				Effettua effettua=new Effettua();
				effettua.setDataordine(rs.getDate("dataordine"));
				effettua.setIdcliente(rs.getInt("idcliente"));
				effettua.setIdordine(rs.getInt("idordine"));
				
				res.add(effettua); }
			} catch (SQLException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			DBManager.closeConnection();
			return res;
			
		
		
	}
}

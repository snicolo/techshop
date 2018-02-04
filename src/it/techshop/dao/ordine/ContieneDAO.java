package it.techshop.dao.ordine;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import it.techshop.dao.utils.DBManager;

public class ContieneDAO {

	private Connection conn;
	//restituisce la lista prodotti contenuti in un ordine
	public Contiene getProdottiInOrdine(Contiene contiene){
		int idord=contiene.getIdordine();
		
		String query = "SELECT idprodotto FROM CONTIENE WHERE idordine=? GROUP BY idordine";
		System.out.println(query);
		
		Contiene res=null;
		
		PreparedStatement ps;
		conn=DBManager.startConnection();
		try{
			ps=conn.prepareStatement(query);
			ps.setInt(1, contiene.getIdordine());
			ps.setString(2, contiene.getIdprodotto());
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				res = new Contiene();
				res.setIdordine(rs.getInt("idordine"));
				res.setIdprodotto(rs.getString("idprodotto"));
				
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
		DBManager.closeConnection();
		return res;
		
	}
}

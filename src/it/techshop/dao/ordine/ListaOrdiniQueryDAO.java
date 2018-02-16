package it.techshop.dao.ordine;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import it.techshop.dao.utils.DBManager;

public class ListaOrdiniQueryDAO {
	
	private Connection conn;
	
	public ListaOrdiniQuery getOrdineDetail(ListaOrdiniQuery ordine){
		int idord=ordine.getIdordine();		
		String query="SELECT PRODOTTO.idprodotto, PRODOTTO.nome, PRODOTTO.prezzo FROM PRODOTTO INNER JOIN CONTIENE ON CONTIENE.idprodotto = PRODOTTO.idprodotto INNER JOIN ORDINE ON ORDINE.idordine = CONTIENE.idordine WHERE ORDINE.idordine=?";
		System.out.println(query);
		
		ListaOrdiniQuery res = null;
		
		PreparedStatement ps;
		conn=DBManager.startConnection();
		try{
			ps=conn.prepareStatement(query);
			ps.setInt(1, ordine.getIdordine());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				res = new ListaOrdiniQuery();
				res.setIdordine(rs.getInt("idordine"));
				res.setDataordine(rs.getDate("dataordine"));
				res.setImportoordine(rs.getFloat("importoord"));
				res.setIdcliente(rs.getInt("idcliente"));
				res.setIdprodotto(rs.getString("idprodotto"));
				res.setNomeProdotto(rs.getString("nomeprodotto"));
				res.setPrezzoProdotto(rs.getFloat("prezzoprodotto"));
				
				
				
				
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		DBManager.closeConnection();
		return res;
	}
	
	//JOIN per ottenere un elenco dettagliato degli ordini
	public Vector<ListaOrdiniQuery> getListaOrdiniDetail(){
		String query="SELECT DISTINCT ordine.idordine, effettua.dataordine, effettua.idcliente, effettua.idcliente, cliente.nome, cliente.cognome, cliente.username, ordine.importoord FROM ORDINE INNER JOIN EFFETTUA ON ORDINE.idordine = EFFETTUA.idordine INNER JOIN CLIENTE ON CLIENTE.idcliente = EFFETTUA.idcliente";
	   Vector<ListaOrdiniQuery> res = new Vector<ListaOrdiniQuery>();
	   
	   PreparedStatement ps;
	   conn=DBManager.startConnection();
	   try{
		   
		   ps=conn.prepareStatement(query);
		   ResultSet rs = ps.executeQuery();
		   while(rs.next()){
			   ListaOrdiniQuery listaordini = new ListaOrdiniQuery();
			   listaordini.setIdordine(rs.getInt("idordine"));
			  listaordini.setDataordine(rs.getDate("dataordine"));
			   listaordini.setIdcliente(rs.getInt("idcliente"));
			   listaordini.setNome(rs.getString("nome"));
			   listaordini.setCognome(rs.getString("cognome"));
			   listaordini.setUsername(rs.getString("username"));;
			 //  listaordini.setIdprodotto(rs.getString("idprodotto"));
			  listaordini.setImportoordine(rs.getFloat("importoord"));
			   
			   res.add(listaordini);
		   }
		    
	   }catch (SQLException e) {
		// TODO: handle exception
		   e.printStackTrace();
	}
	   DBManager.closeConnection();
	   return res;
	}

}

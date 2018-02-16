package it.techshop.dao.news;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import it.techshop.dao.utils.DBManager;

public class NewsDAO {
	private Connection conn;
	
	public Vector<News> getListaNews(){
		String query = "SELECT * FROM NEWS";
		Vector<News> res = new Vector<News>();
		
		PreparedStatement ps;
		conn=DBManager.startConnection();
		try{
			ps = conn.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()){
			News news = new News();
			news.setIdnews(rs.getString("idnews"));
			news.setData(rs.getDate("data"));
			news.setDescrizione(rs.getString("descrizione"));
			news.setTitolo(rs.getString("titolo"));
			
			res.add(news);
			
	
		
		}}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		DBManager.closeConnection();
		return res;
		
	}
	
	public News inserisciNews(News news){
		
		String query = "INSERT INTO NEWS VALUES(?, CURRENT_TIMESTAMP, ?, ?)";
		boolean esito= false;
		
		PreparedStatement ps;
		conn=DBManager.startConnection();
		try{
			ps = conn.prepareStatement(query);
			ps.setString(1,  news.getIdnews());
			ps.setString(2, news.getDescrizione());
			ps.setString(3, news.getTitolo());
			
			int tmp=ps.executeUpdate();
			if(tmp==1)
				esito=true;
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		DBManager.closeConnection();
		return news;
	}
     
	public News getNews(News news){
		String idn = news.getIdnews();
		String title = news.getTitolo();
		String query ="SELECT * FROM NEWS WHERE idnews=? OR titolo=?";
		
		System.out.println(query);
		
		News res = null;
		
		PreparedStatement ps;
		conn=DBManager.startConnection();
		try{
			ps = conn.prepareStatement(query);
			ps.setString(1,  news.getIdnews());
			ps.setString(2, news.getTitolo());
			
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				res = new News();
				res.setIdnews(rs.getString("idnews"));
				res.setData(rs.getDate("data"));
				res.setDescrizione(rs.getString("descrizione"));
				res.setTitolo(rs.getString("titolo"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		DBManager.closeConnection();
		return res;
		}
	
	public News eliminaNews(News news){
		String idn=news.getIdnews();
		
		String query="DELETE FROM NEWS WHERE idnews=?";
		System.out.println(query);
		
		News res = null;
		PreparedStatement ps;
		conn=DBManager.startConnection();
		try{
			ps = conn.prepareStatement(query);
			ps.setString(1,  news.getIdnews());
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				res = new News();
				res.setIdnews(rs.getString("idnews"));
				res.setData(rs.getDate("data"));
				res.setDescrizione(rs.getString("descrizione"));
				res.setTitolo(rs.getString("titolo"));
			}
		} catch(SQLException e){
			e.printStackTrace();
		
			}
			DBManager.closeConnection();
			return res;
		
	}
	
	}


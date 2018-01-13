package it.techshop.dao.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import it.techshop.dao.utils.*;

public class AdminDAO {
	private Connection conn;

	public Admin loginAdmin(Admin admin) {
		String user = admin.getUsername();
		String pw = admin.getPassword();

		String query = "SELECT * FROM AMMINISTRATORE WHERE username=? AND password=?";
		System.out.print(query);

		Admin res = null;

		PreparedStatement ps;
		conn = DBManager.startConnection();
		try {
			ps = conn.prepareStatement(query);
			ps.setString(1, admin.getUsername());
			ps.setString(2, admin.getPassword());

			ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				res = new Admin();
				res.setUsername(rs.getString("usernare"));
				res.setNome(rs.getString("nome"));
				res.setEmail(rs.getString("email"));
				res.setPassword(rs.getString("password"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBManager.closeConnection();
		return res;

	}

	public Vector<Admin> getAmministratori() {
		String query = "SELECT * FROM AMMINISTRATORE";
		Vector<Admin> res = new Vector<Admin>();

		PreparedStatement ps;
		conn = DBManager.startConnection();
		try {
			ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				Admin amministratore = new Admin();
				amministratore.setUsername(rs.getString("username"));
				amministratore.setNome(rs.getString("nome"));
				amministratore.setCognome(rs.getString("cognome"));
				amministratore.setPassword(rs.getString("password"));
				amministratore.setEmail(rs.getString("email"));

				res.add(amministratore);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBManager.closeConnection();
		return res;
	}
}

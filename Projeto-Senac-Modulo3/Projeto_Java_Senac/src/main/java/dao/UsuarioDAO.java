package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Usuario;

public class UsuarioDAO {
	Usuario usuario = null;
	Connection cnx = null;
	
	public Usuario resposta6(String resposta6) {
		Usuario usuario = null;
		ResultSet rs = null;
		cnx = DAO.createConnection();

		String sql = "SELECT * FROM tb_respostas WHERE resposta =? AND id=6 ";

		try {
			PreparedStatement ps = cnx.prepareStatement(sql);

			ps.setString(1, resposta6);

			rs = ps.executeQuery();

			while (rs.next()) {
				usuario = new Usuario();

				usuario.setResposta(rs.getString("resposta6"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return usuario;
	}
	
	public Usuario resposta5(String resposta5) {
		Usuario usuario = null;
		ResultSet rs = null;
		cnx = DAO.createConnection();

		String sql = "SELECT * FROM tb_respostas WHERE resposta =? AND id=5 ";

		try {
			PreparedStatement ps = cnx.prepareStatement(sql);

			ps.setString(1, resposta5);

			rs = ps.executeQuery();

			while (rs.next()) {
				usuario = new Usuario();

				usuario.setResposta(rs.getString("resposta5"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return usuario;
	}
	
	public Usuario resposta4(String resposta4) {
		Usuario usuario = null;
		ResultSet rs = null;
		cnx = DAO.createConnection();

		String sql = "SELECT * FROM tb_respostas WHERE resposta =? AND id=4 ";

		try {
			PreparedStatement ps = cnx.prepareStatement(sql);

			ps.setString(1, resposta4);

			rs = ps.executeQuery();

			while (rs.next()) {
				usuario = new Usuario();

				usuario.setResposta(rs.getString("resposta4"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return usuario;
	}

public Usuario resposta3(String resposta3) {
		Usuario usuario = null;
		ResultSet rs = null;
		cnx = DAO.createConnection();

		String sql = "SELECT * FROM tb_respostas WHERE resposta =? AND id=3 ";

		try {
			PreparedStatement ps = cnx.prepareStatement(sql);

			ps.setString(1, resposta3);

			rs = ps.executeQuery();

			while (rs.next()) {
				usuario = new Usuario();

				usuario.setResposta(rs.getString("resposta3"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return usuario;
	}

public Usuario resposta2(String resposta2) {
		Usuario usuario = null;
		ResultSet rs = null;
		cnx = DAO.createConnection();

		String sql = "SELECT * FROM tb_respostas WHERE resposta =? AND id=2";

		try {
			PreparedStatement ps = cnx.prepareStatement(sql);

			ps.setString(1, resposta2);

			rs = ps.executeQuery();

			while (rs.next()) {
				usuario = new Usuario();

				usuario.setResposta(rs.getString("resposta2"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return usuario;
	}

public Usuario resposta(String resposta) {
		Usuario usuario = null;
		ResultSet rs = null;
		cnx = DAO.createConnection();

		String sql = "SELECT * FROM tb_respostas WHERE resposta = ? AND id=1 ";

		try {
			PreparedStatement ps = cnx.prepareStatement(sql);

			ps.setString(1, resposta);

			rs = ps.executeQuery();

			while (rs.next()) {
				usuario = new Usuario();

				usuario.setResposta(rs.getString("resposta"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return usuario;
	}

}

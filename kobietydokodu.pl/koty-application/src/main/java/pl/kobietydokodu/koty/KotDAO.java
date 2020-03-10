package pl.kobietydokodu.koty;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pl.kobietydokodu.koty.domain.Kot;

@Repository
public class KotDAO {
	@Autowired
	private DataSource dataSource;

	public void dodajKota(Kot kot) {
		String sql = "INSERT INTO koty"
				+ " (kot_imie, kot_waga, kot_dataUrodzin, kot_imieOpiekuna) VALUES (?, ?, ? , ?)";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, kot.getImie());
			ps.setFloat(2, kot.getWaga());
			ps.setDate(3, (Date) kot.getDataUrodzenia());
			ps.setString(4, kot.getImieOpiekuna());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}

	}

	public List<Kot> getKoty() {
		 List<Kot> kotyList = new ArrayList<Kot>();
		String sql = "SELECT * FROM koty";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			Kot kot = null;
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				kot = new Kot();
				kot.setId(rs.getInt("kot_id"));
				kot.setImie(rs.getString("kot_imie"));
				kot.setWaga(rs.getFloat("kot_waga"));
				kot.setDataUrodzenia(rs.getDate("kot_dataUrodzin"));
				kot.setImieOpiekuna(rs.getString("kot_imieOpiekuna"));
				kotyList.add(kot);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
		return kotyList;

	}

	public Kot getKotById(Integer kotId) {
		String sql = "SELECT * FROM koty WHERE kot_id = ?";
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, kotId);
			Kot kot = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				kot = new Kot();
				kot.setId(rs.getInt("kot_id"));
				kot.setImie(rs.getString("kot_imie"));
				kot.setWaga(rs.getFloat("kot_waga"));
				kot.setDataUrodzenia(rs.getDate("kot_dataUrodzin"));
				kot.setImieOpiekuna(rs.getString("kot_imieOpiekuna"));
				rs.close();
				ps.close();
				return kot;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
				}
			}
		}
		return null;
	}
}

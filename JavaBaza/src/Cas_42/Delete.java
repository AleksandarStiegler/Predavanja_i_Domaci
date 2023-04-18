package Cas_42;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static void main(String[] args) {
		
		
		String url = "jdbc:mysql://localhost:3306/tb";
		String username = "root";
		String password = "";
		
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			String sqlDelete = "DELETE FROM korisnici WHERE korisnickoIme = ?";
			PreparedStatement psdel =conn.prepareStatement(sqlDelete);
			psdel.setString(1, "korisnik1");
			
			int obrisanPodatak = psdel.executeUpdate();
			if(obrisanPodatak > 0) {
				System.out.println("Obrisasmo ga!");
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}

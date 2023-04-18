package Cas_42;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/tb";
		String username = "root";
		String password = "";
		
		try(Connection conn = DriverManager.getConnection(url, username, password)){
			
			System.out.println("Zakacismo se ljudi!");
			String sqlupdate = "UPDATE korisnici SET lozinka = ?, ime = ?, email = ? where korisnickoIme = ?";
			
			PreparedStatement prepst = conn.prepareStatement(sqlupdate);
			prepst.setString(1, "123korisnik");
			prepst.setString(2, "Neko");
			prepst.setString(3, "neko@gmail.com");
			
			prepst.setString(4, "korisnik1"); // ovo je uslov
			
			int promenjenPodatak = prepst.executeUpdate();
			
			if (promenjenPodatak > 0) {
				System.out.println("Uspesno izvrsena izmena!");
			}
			
			
			
		}catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

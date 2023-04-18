package Cas_42;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/tb";
		String username = "root";
		String password = "";
		
		try (Connection conn = DriverManager.getConnection(url, username, password)){
			
			System.out.println("Konektovano!");
			
			String sqlinsert = "INSERT INTO korisnici(korisnickoIme, lozinka, ime, email) values(?, ?, ?, ?)";
			
			PreparedStatement ps = conn.prepareStatement(sqlinsert);
			
			ps.setString(1, "ABC");
			ps.setString(2, "pass123");
			ps.setString(3,	"Abc");
			ps.setString(4, "abc@gmail.com");
			
			int unetPodatak = ps.executeUpdate();
			
			if(unetPodatak > 0) {
				System.out.println("Podatak je upisan");
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}

package Baza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DELETE {

	public static void main(String[] args) {
		

		String url = "jdbc:mysql://localhost:3306/biblioteke";
		String user = "root";
		String pass = "";
		
		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("Konektovan");
			
			String sqlDEL = "DELETE FROM biblioteke WHERE imeBiblioteke = ?";
			PreparedStatement psDEL = con.prepareStatement(sqlDEL);
			psDEL.setString(1, "Aleksa Santic");
			int del = psDEL.executeUpdate();
			if(del > 0) {
				System.out.println("Uspesno obrisan");
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}

package Baza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UPDATE {

	public static void main(String[] args) {


		String url = "jdbc:mysql://localhost:3306/biblioteke";
		String user = "root";
		String pass = "";
		
		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("Uspesno izvrsena konekcija ka bazi");
			
			String sqlUP = "UPDATE biblioteke SET ulica = ?, broj = ? WHERE imeBiblioteke = ?";
			PreparedStatement psUP = con.prepareStatement(sqlUP);
			
			psUP.setString(1, "NekaUlica");
			psUP.setString(2, "4b");
			psUP.setString(3, "Narodna biblioteka");
			int up = psUP.executeUpdate();
			if (up > 0) {
				System.out.println("Uspesno promenjen podatak");
			}
			
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}

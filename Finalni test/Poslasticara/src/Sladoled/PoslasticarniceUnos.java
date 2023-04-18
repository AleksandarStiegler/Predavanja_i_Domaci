package Sladoled;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PoslasticarniceUnos {

	public static void main(String[] args) throws Exception{
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		String url = "jdbc:mysql://localhost:3306/poslasticara";
		String user = "root";
		String pass = "";
		
		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("Konektovani smo!");
			System.out.println("\n\n");
			
			String unos = "INSERT INTO poslasticarnice(naziv, ulica, broj) "
					+ "VALUES (?, ?, ?)";
			
			PreparedStatement prst = con.prepareStatement(unos);
			System.out.println("Unesite naziv poslasticarnice.");
			String n = bfr.readLine();
			System.out.println("Unesite ulicu.");
			String u = bfr.readLine();
			System.out.println("Unesite broj.");
			String b = bfr.readLine();
			
			
			prst.setString(1, n);
			prst.setString(2, u);
			prst.setString(3, b);
			
			int unetPodatak = prst.executeUpdate();
			if (unetPodatak > 0) {
				System.out.println("Uspesno unesen podatak!");
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		// Uneo sam i 3 podatka odavde pa cu dodati jos koj podatak u tabelama
		// da ima
	}

}

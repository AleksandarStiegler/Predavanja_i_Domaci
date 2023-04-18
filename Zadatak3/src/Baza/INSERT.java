package Baza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class INSERT {

	public static void main(String[] args) throws Exception{
		
		String url = "jdbc:mysql://localhost:3306/biblioteke";
		String user = "root";
		String pass = "";
		
		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("Uspostavljena konekcija");
			String sqlIns = "INSERT INTO biblioteke(imeBiblioteke, ulica, broj) VALUES(?,?,?)";
			PreparedStatement psIns = con.prepareStatement(sqlIns);
			
			psIns.setString(1, "Aleksa Santic");
			
			
			psIns.setString(2, "Kralja Petra I");
			
			psIns.setString(3, "43");
			
		int insert = psIns.executeUpdate();
		if (insert > 0) {
			System.out.println("Uspesno unesen podatak");
		}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}

package Sladoled;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrikaziPoslasticarnice {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/poslasticara";
		String user = "root";
		String pass = "";
		
		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("Uspostavljena konekcija!");
			System.out.println("\n\n");
			String prikazi = "SELECT * FROM poslasticarnice";
			
			Statement st = con.createStatement();
			ResultSet rez = st.executeQuery(prikazi);
			
			while (rez.next()) {
				
				String naziv = rez.getString(2);
				String ulica = rez.getString(3);
				String broj = rez.getString(4);
				
				StringBuilder build = new StringBuilder();
				build.append("Naziv poslasticarnice : ");
				build.append(naziv);
				build.append("\nSediste : ");
				build.append(ulica);
				
				build.append(" "+broj);
				build.append("\n");
				System.out.println(build.toString());
				
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}

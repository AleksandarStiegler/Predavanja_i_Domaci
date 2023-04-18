package Baza;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SELECT {

	public static void main(String[] args) {
		

		String url = "jdbc:mysql://localhost:3306/biblioteke";
		String user = "root";
		String pass = "";
		
		try {
			Connection con = DriverManager.getConnection(url, user, pass);
			System.out.println("Uspesna konekcija ka bazi");
			
			String sqlSel = "SELECT * FROM biblioteke";
			Statement st = con.createStatement();
			ResultSet rez = st.executeQuery(sqlSel);
			while ( rez.next() ) {
				String naziv = rez.getString(2);
				String ulica = rez.getString(3);
				String broj = rez.getString(4);
				
				StringBuilder strb = new StringBuilder();
				strb.append("Naziv : ");
				strb.append(naziv);
				strb.append("\nUlica : ");
				strb.append(ulica);
				strb.append("\nBroj : ");
				strb.append(broj);
				System.out.println();
				System.out.println(strb.toString());
			}
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

}

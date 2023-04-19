package RazgranateStrukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primer06 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// Primer 6 slajd 21 predavanje 6
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		double a, b, z;
		
		System.out.println("Unesite vrednost za a = ");
		a = Double.parseDouble(input.readLine());
		System.out.println("Unesite vrednost za b = ");
		b = Double.parseDouble(input.readLine());
		
		if (a>b)
			z = 2*a+b;
		else 
			z = a-2*b;
		
		System.out.println("Vrednost izraza za zadate vrednosti je z = "+z);
		// E sad trebalo bi da ubacujem i malo komentara ali iskreno sada samo vezbam logiku i pisanje
		// za koj zadatak (primer) cemo da pocnemo da ubacujemo i komentare koji nisu samo moja opazanja i tekuce misli
	}

}

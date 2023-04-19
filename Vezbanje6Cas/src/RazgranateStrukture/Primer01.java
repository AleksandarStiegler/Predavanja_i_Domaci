package RazgranateStrukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primer01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// E sada posto sam se ustalio sa Scanner metodom dovoljno pocecu polako da koristim BufferedReader
		// Generalno obe metode mogu da se koriste za unos podataka ali je BufferedReader bolji pogotovo
		// pri unosu datoteka. Doduse treba dodati throws Exception
		
		// Unos podataka
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite vrednost za x ");
		double x = Double.parseDouble(input.readLine());
		double y;
		
		if (x<0)
			y = -x;
		else
			y = x;
		
		System.out.println("Vrednost y je "+y);
		
		
	}

}

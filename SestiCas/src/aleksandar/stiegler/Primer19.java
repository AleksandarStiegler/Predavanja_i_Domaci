package aleksandar.stiegler;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class Primer19 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));  
		// Unos podataka 
		System.out.print("Unesite vrednost za q: "); 
		int q = Integer.parseInt(ulaz.readLine()); 
		System.out.print("Unesite vrednost za r: ");
		int r = Integer.parseInt(ulaz.readLine());
		System.out.print("Unesite vrednost za s: ");
		int s = Integer.parseInt(ulaz.readLine()); 
		// Izračunavanje vrednosti funkcije 
		int y = (r > s) ? r : s; 
		if (q < y) 
			y = q; 
		// Štampanje rezultata 
		System.out.println("Vrednost funkcije y je " + y);
		
		
	}

}

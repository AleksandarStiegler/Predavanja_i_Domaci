package Zadatak14;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		
		// Napravicu vise lambda izraza jednostavnih u istom zadatku za vezbanje
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite broj");
		double broj = Double.parseDouble(bfr.readLine());
		
		Pozitivan pozbr = (k) -> (k >= 0);
		
		if (pozbr.poz(broj)) {
			System.out.println("Broj je pozitivan");
		}else {
			System.out.println("Broj je negativan");
		}
		int suma = 0;
		SumaDeljivSaTriParan ds3p = (n) -> (n % 3 == 0 && n % 2 ==0);
		System.out.println("Unesite 4 broja");
		for (int i = 1; i <= 4; i++) {
			int b = Integer.parseInt(bfr.readLine());
			if(ds3p.deljiv(b)) {
				suma += b;
			}
			
		}
		System.out.println("Zbir parnih brojeva deljivih sa 3 : " + suma);
		// Ujutru da vidim sa 2 parametra i onda genericke metode ako stignem

	}

}

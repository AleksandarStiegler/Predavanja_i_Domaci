package Zadatak2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zadatak2 {

	public static void main(String[] args) throws IOException {

		// Ispitati da li je uneti broj prost

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite broj za koji zelite da proverite da li je prost.");
		try {
			int n = Integer.parseInt(bfr.readLine());
			int k = 0;
			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					k++;
				}

			}
			if (k == 2) {
				System.out.println("Broj " + n + " je prost broj.");
			} else {
				System.out.println("Broj " + n + " nije prost broj.");
			}
		} catch (Exception e) {
			System.out.println("Greska. Uneta vrednost mora biti celobrojnog tipa.");
		}

	}

}

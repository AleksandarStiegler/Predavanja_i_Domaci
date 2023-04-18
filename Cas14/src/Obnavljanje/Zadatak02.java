package Obnavljanje;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak02 {

	public static void main(String[] args) throws Exception {
		
		
		// Napisati program za izdvajanje i ispisivanje cifre jednu ispod druge pocevsi
		// od cifre jedinice
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int n ;
		System.out.println("Unesite n : ");
		n = Integer.parseInt(bfr.readLine());
		
		int   cifra;
	/*	do
		{
			int cifra = n % 10;
			n = n / 10;
			System.out.println(cifra);
		} while ( n > 0);  */
	
		while ( n > 0)
		{
			 cifra = n % 10;
			        n /= 10;
			
			System.out.println(cifra);
		}

	}

}

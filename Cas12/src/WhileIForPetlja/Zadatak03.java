package WhileIForPetlja;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak03 {

	public static void main(String[] args) throws Exception {
		
		// Deklarisanje odsecaka i unos podataka
		
		double a, b, c;
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Unesite vrednost za n : ");
		int n = Integer.parseInt(bfr.readLine());
		
		for (int i = 1 ; i <= n ; i ++)
			System.out.print("Unesite duzinu odsecka a : ");
			a = Double.parseDouble(bfr.readLine());
			System.out.print("Unesite duzinu odsecka b : ");
			b = Double.parseDouble(bfr.readLine());
			System.out.print("Unesite duzinu odsecka c : ");
			c = Double.parseDouble(bfr.readLine());
			
			if (a > 0 && b > 0 && c > 0)
			{
			// Razgranata struktura
			if ((a + b > c) && (a + c > b) && (b + c > a)) 
			{
				double p = 0.25 * Math.sqrt((a + b + c) * (b + c - a) * (a + c - b) * (a + b - c));
				
				// Štampanje rezultata 
				System.out.println("Površina trougla je " + p);
			} 
			
			else System.out.println("Unete stranice ne čine trougao."); 
			
			}
		

	else
	{
		System.out.println("odseci moraju biti veci od nule .");

		}

	}
}


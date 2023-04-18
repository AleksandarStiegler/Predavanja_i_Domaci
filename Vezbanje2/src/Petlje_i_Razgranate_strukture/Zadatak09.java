package Petlje_i_Razgranate_strukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak09 {

	public static void main(String[] args) throws Exception {
		
		
		// Za unetu vrednost n izracunati izraz 
		// Drugi zadatak sa 12 predavanja slajd 82
		// while i do while petlja
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("##0.00000");
		
		double n , suma = 0.0;
		
		System.out.print("Unesite broj n : ");
		n = Integer.parseInt(bfr.readLine());
		
	//	double i = 1.0;
	/*	
		while (i <= n)
		{
			double k = 3*i;
			suma +=  1 / (k*k);
			
			i++;
		}  */
		
		double i = 1;
		do 
		{
			 suma +=  1 / (Math.pow(3*i, 2));
			i++;
		} while ( i <= n );
		
		
		System.out.println(df.format(suma));
	}

}

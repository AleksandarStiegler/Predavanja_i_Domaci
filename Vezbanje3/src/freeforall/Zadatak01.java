package freeforall;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak01 {

	public static void main(String[] args) throws Exception {
	
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#0.000");
		
		double a, b, c, x1, x2;
		System.out.println("Unesite koeficient a uz x na kvadrat.");
		a = Double.parseDouble(bfr.readLine());
		System.out.println("Unesite koeficient b uz x.");
		b = Double.parseDouble(bfr.readLine());
		System.out.println("Unesite slobodan clan c.");
		c = Double.parseDouble(bfr.readLine());
		
		
		if ( a != 0 && (b*b-4*c*a) > 0)
		{
			x1 = (- b + Math.sqrt(b*b - 4*a*c)) / (2 * a);
			x2 = (- b - Math.sqrt(b*b - 4*a*c)) / (2 * a);
			System.out.println("Resenja kvadratne jednacine su x1 = "+df.format(x1)+" i x2 = "+df.format(x2));
			
		}
		else if ( a != 0 && (b*b - 4*a*c) == 0)
		{
			x1 = - b / (2 * a);
			System.out.println("Jednacina ima samo jedno resenje x1 = "+df.format(x1));
		}
		else 
		{
			System.out.println("Pogresan unos jedan ili oba uslova nisu zadovoljeni a != 0 ; (b*b - 4*a*c) >= 0 ");
		}
				
		
		

	}

}

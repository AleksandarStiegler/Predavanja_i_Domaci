package IfElseFor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak03 {

	public static void main(String[] args) throws Exception {
		
		
		// Zadatak za vezbu 3 , 11 predavanje slajd 79
		
		// Unos podataka
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("###,##0.0000");
		int n, i;
		double j , p = 1.0 , suma = 0.0;
		
		
		System.out.print("Unesite prirodan broj n za koji racunamo sumu : ");
		n = Integer.parseInt(bfr.readLine());
		
		for (i = 1 ; i <= n ; i++)
		{
			for (j = 1.0 ; j <= i ; j++)
			
				if ( j != 3)
					
				p *= (j+2) / (j - 3);
			
				suma += p ;
				
		}
		
		System.out.println("Za n = "+n+", suma iznosi "+df.format(suma));

	}

}

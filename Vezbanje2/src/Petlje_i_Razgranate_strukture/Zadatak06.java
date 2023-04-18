package Petlje_i_Razgranate_strukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak06 {

	public static void main(String[] args) throws Exception{
		
		
		// Na posmatranom intervalu ispisati sve Armstrongove brojeve
		
		BufferedReader bfr = new BufferedReader ( new InputStreamReader(System.in));
		
		int n, d = 0, j = 0, s = 0, h = 0;
		System.out.print(" Unesite broj do kog ce se posmatrati interval Armstrongovih brojeva od 10 do : ");
		n = Integer.parseInt(bfr.readLine());
		
		if ( n >= 10 && n <=99)
		{
			// x = d * 10 + j
			for ( int i = 10; i <= n ; i++)
			{
				
				d = i / 10;
				j = i % 10;
		
				if ( (Math.pow(d,3) + Math.pow(j,3)) == i)
				
					System.out.print(i+" je Armstrongov broj");
			
				
			}
			
		}
		if ( n >= 100 && n <= 999)
		{
			for (int i = 100; i <= n ; i++)
			{
				s = i / 100;
				d = (i / 10) % 10;
				j = i % 10;
				if ( (Math.pow(s,3) + Math.pow(d,3) + Math.pow(j,3)) == i)
					System.out.print(i+" je Armstrongov broj\n");
			}
		}
	if ( n >= 100 && n <= 9999)
		{
			for (int i = 100 ; i <= n ; i++)
			{
				h = i / 1000;
				s = ( i % 1000) / 100;
				d = ( i / 10 ) % 10;
				j = i % 10 ;
				if ((h*h*h + s*s*s + d*d*d + j*j*j) == i)
					System.out.print(i+" je Armstrongov broj");
			}
		}
		
	}

}  // Ok nesto ne stima princip mislim da je ok ali je nesto lose tako da ostavljam ovaj sa greskom mozda podseti na nesto neki drugi dan

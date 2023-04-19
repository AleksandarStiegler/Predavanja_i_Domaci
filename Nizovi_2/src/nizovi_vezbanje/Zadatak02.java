package nizovi_vezbanje;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak02 {

	public static void main(String[] args) throws Exception {
		
		// Napisati program za sortiranje niza u rastuci poredak
		
		BufferedReader bfr = new BufferedReader( new InputStreamReader(System.in));
		
		System.out.print("Unesite broj clanova niza n : ");
		int n = Integer.parseInt(bfr.readLine());
		
		int x[] = new int [100];
		
		System.out.println("Unesite clanove niza.");
		
		for (int i = 0; i < n; i++)
		{
			System.out.print("x["+i+"] = ");
			x[i] = Integer.parseInt(bfr.readLine());
		}
		
		System.out.println("Unesen niz .");
		for (int i = 0 ; i < n ; i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println("Sortiran niz");
		int temp = 0 ;
		for (int i = 0 ; i < n ; i++)
		{
			if (x[i] > x[i+1])
			{
				temp = x[i+1];
				x[i+1] = x[i];
				x[i] = temp;
						
			}
			
				
		}
		for (int i = 0 ; i < n ; n--)
		{
			System.out.print(x[n]+" ");
		}
	}

}

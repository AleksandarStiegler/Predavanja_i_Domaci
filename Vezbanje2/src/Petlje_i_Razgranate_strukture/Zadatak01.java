package Petlje_i_Razgranate_strukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak01 {

	public static void main(String[] args) throws Exception {
		
		
		// Napisati program koji racuna faktorijel broja n pomocu :  a) for petlje  ;  b) while petlje ;  c) do while petlje
		// Trenutni problem znam kako da uradim for i while petlju ali cu morati da pogledam do while petlju pre nego sto je uradim
		
		// Unos podataka ce biti isti za sve podtipove necu pisati vise puta
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Unesite broj za koji trazite faktorijel : ");
		int n = Integer.parseInt(bfr.readLine());
		int i, fak = 1;
		// Resavanje zadatka a) za sve slucajeve ispitivanja koristicu  n = 3 i n = 10:
	/*	
		for ( i = 1 ; i <= n; i++)
		{
			fak *= i;
		} */
		
		// Resavanje zadatka b)
	/*	
		i = 1 ;
		while ( i <= n )
		{
			fak *= i;
			i++;
		}  */
		
		//  c)   Dakle kod do while petlje prvo so radi blok naredbi pa se onda spusta do provere uslova , i radi se ciklicno sve dok je uslov ispunjen
		
		i = 1;
		do 
			{
				fak *= i;
				i++ ;							// Dakle moze i ovako mada malo mi je konfuznije ali ce biti jasnije kasnije 
			}
			while (i <= n);
					
		
		System.out.println("Faktorijel broja "+n+" , iznosi "+fak);
		

	}

}

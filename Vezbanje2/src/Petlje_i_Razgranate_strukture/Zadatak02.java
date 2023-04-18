package Petlje_i_Razgranate_strukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak02 {

	public static void main(String[] args) throws Exception {


		// Napisati program kojim se za date prirodne brojeve m i n izracunava S = n(n+m)(n+2m)....(n+mm)
		// Uraditi preko for , while i do while petlje
		
		int s, n, m;
		
		BufferedReader bfr = new BufferedReader( new InputStreamReader(System.in));
		System.out.print(" Unesite broj n : ");
		n = Integer.parseInt(bfr.readLine());
		System.out.print(" Unesite broj m : ");
		m = Integer.parseInt(bfr.readLine());
		
		s = n ;
		
		// For 
	/*	for (int i = 1; i <= m ; i++)
		{
			s *= (n + i*m);
		} */
		
		// While
		
	/*	int i = 1;
		while ( i <= m)
		{
			s *= (n + i*m );
			i++;
		}  */
		
		// Do while
		
		int i = 1;
		do 
		{
			s *= (n + i * m );
			i ++;
			
		}while (i <= m );
		
		System.out.print("Za n = "+n+" i m = "+m+" , dobijeni rezultat je "+s);
	}

}

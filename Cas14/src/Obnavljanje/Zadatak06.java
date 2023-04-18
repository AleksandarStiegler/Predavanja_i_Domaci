package Obnavljanje;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak06 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int s , p ;
		
		p = 1 ; s =0;
		
		System.out.println("Unesite broj n ");
		int n = Integer.parseInt(bfr.readLine());
		
		int i = 1;
		while ( i <= n)
		{
			p *= i;
			s += p;
			i++;
		}
		System.out.println("Suma s = "+ s);
		
	}

}

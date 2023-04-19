package nizovi_vezbanje;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak09 {

	public static void main(String[] args) throws Exception {
	
		// Napisati algoritam kojim se odredjuju maksimalni i minimalni element 
		// u celobrojnom nizu x od n elemenata
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Unesite broj clanova niza n : ");
		int n = Integer.parseInt(bfr.readLine());
		int x[] = new int[100];
		
		System.out.println("Unesite prvi clan niza x.");
		x[1] = Integer.parseInt(bfr.readLine());
		int max, min;
		max = x[1]; min = x[1];
		
		System.out.println("Unesite ostale clanove niza x.");
		for (int i = 2; i <= n ; i++)
		{
			System.out.print("x["+i+"] = ");
			x[i] = Integer.parseInt(bfr.readLine());
			if ( x[i] > max)
				max = x[i];
			else if (x[i] < min)
				min = x[i];
		}
		System.out.println("Najveci element niza je "+max+" , a najmanji "+min+".");
		
		

	}

}

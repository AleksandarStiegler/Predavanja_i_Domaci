package nizovi_vezbanje;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.000");
		
		System.out.print("Unesite broj clanova niza n : ");
		int n = sc.nextInt();
		
		
		int x [] = new int [n];
		double []y = new double [100];
		
		System.out.println("Unesite clanove niza .");
		
		for (int i = 0; i < x.length ; i++)
		{
			System.out.print("x["+i+"] = ");
			x[i] = sc.nextInt();
			if (x[i] != 0)
			{
			if ( x[i] % 2 == 0 )
				y[i] = (double) 1 / x[i];
			else if ( x[i] %2 !=0 )
				y[i] = x[i] * x[i];
			
			}
			System.out.println("Uneli ste nulu. Program ce prijaviti i 0 na izlazu.");
		 
		}
				
		for (int i = 0; i < x.length ; i++)
		{
			System.out.println("Za clan niza "+x[i]+" , vrednost clana niza (funkcije) je "+df.format(y[i]));
		}
		sc.close();	
	}

}

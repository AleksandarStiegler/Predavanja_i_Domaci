package Petlje_i_Razgranate_strukture;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak12 {

	public static void main(String[] args) {
		
		
		// Napisati program za izracunavanje sume
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.000");
		System.out.println("Unesite vrednost n za racunanje sume");
		double suma = 0, n;
		
		n = sc.nextDouble();
		sc.close();
		
	/*	
		for (double i = 1 ; i <= n ; i++)
		{
			suma += i / ( i + 1);
			System.out.println(suma);
		}  */
		
		double i = 1 ;
		/*
		while ( i <= n)
		{
			suma += i / (i+1);
			i++;
		}  */
		
		do
		{
			suma += i / (i + 1);
			i++;
		} while (i <= n
				);
		
		System.out.println("Za unetu vrednost n = "+n+" , suma je "+df.format(suma));

	}

}

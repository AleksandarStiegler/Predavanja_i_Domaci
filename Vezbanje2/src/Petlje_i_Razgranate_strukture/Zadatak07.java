package Petlje_i_Razgranate_strukture;

import java.util.Scanner;

public class Zadatak07 {

	public static void main(String[] args) {
		
		// Napisati program koji ce naci aritmeticku sredinu unetih brojeva , aritmeticku sredinu parnih brojeva kao i ar. sredinu neparnih brojeva
		
		Scanner sc = new Scanner(System.in);
		int n, par = 0, nep = 0;
		int suma = 0, sumapar =0, sumanep = 0;
		System.out.print("Unesite koliko imamo brojeva : ");
		n = sc.nextInt();
		
		for ( int i = 1 ; i <= n ; i++)
		{
			System.out.print("Unesite "+i+". broj : ");
			int broj = sc.nextInt();
			suma += broj;
			if ( broj % 2 == 0 && broj != 0)
			{
				par ++;
				sumapar += broj;
			}
			else if ( broj % 2 != 0 && broj != 0)
			{
				nep ++;
				sumanep += broj;
			}
		}
		
		System.out.print("Aritmeticka suma "+(double)suma/n+"\nAritmeticka suma parnih brojeva "+(double)sumapar/par+"\nAritmeticka suma neparnih brojeva "+(double)sumanep/nep);
		
		sc.close();
	}

}

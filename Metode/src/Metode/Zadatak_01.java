package Metode;

import java.util.Scanner;

public class Zadatak_01 {
	
	public static void stampanje(int n, double x[] ){
		
		for (int i = 0; i < n ; i++)
		{
			System.out.print(x[i]+" , ");
		}
	}
	
	public static double arsredina(int n, double x[]) {
		double sr = 0;
		for (int i = 0; i < n; i++)
		{
			sr += x[i];
		}
		return sr / n;
	}

	public static void main(String[] args) {
		
		// Napisati metodu za izracunavanje srednje vrednosti niza od n elemenata i stampanje.
		// U glavnom programu odstampati vrednost niza i izracunati srednju vrednost
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj elemenata niza : ");
		int n = sc.nextInt();
		
		double x[] = new double [30];
		
		System.out.println("Unesite elemente niza .");
		for (int i = 0; i < n; i++)
		{
			System.out.print("x["+i+"] = ");
			x[i] = sc.nextDouble();
		}
		stampanje(n,x);
		
		
		System.out.println("\nSrednja vrednost niza = "+arsredina(n,x));
		sc.close();
	}

}

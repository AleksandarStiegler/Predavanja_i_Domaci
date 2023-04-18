package Obnavljanje;

import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {
		
		
		// Napisati program  kojim se izracunava vrednost sume
		
		Scanner sc = new Scanner(System.in);
		
		double n, k, suma =0.0;
		System.out.println("Unesite broj n do kojeg ce se racunati suma");
		n = sc.nextDouble();
		System.out.println("Unesite k ");
		k = sc.nextDouble();
		
		double i = 1.0;
		while (i <= n)      					  //  do 
		{										  // {
			suma += i*k / Math.pow((2*i - 1),2);  //  suma += i*k / Math.pow((2*i - 1),2);
			i++;								  //  i++;
		}										  // while ( i <= n ) ;
		System.out.println(suma);
		sc.close();
	}

}

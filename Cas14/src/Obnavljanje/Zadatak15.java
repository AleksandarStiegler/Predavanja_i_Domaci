package Obnavljanje;

import java.util.Scanner;

public class Zadatak15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Unesite neki broj > 5 i < 20");
		int a = sc.nextInt();

		int suma = 0, i = 0;
		while (a % 3 == 0) {
			if ( a > 5 && a < 20)
			
			suma += a;
			i++;
			System.out.println(" Unesite neki broj ");
			a = sc.nextInt();
			
		}
		if (i != 0) {
			double ars = (double) suma / i;
			System.out.println("Aritmeticka sredina unesenih brojeva je " + ars);
		} 
		sc.close();

	}

}

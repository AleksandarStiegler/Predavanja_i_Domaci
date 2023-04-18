package Obnavljanje;

import java.util.Scanner;

public class Zadatak17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int broj, cifra, suma = 0;

		System.out.println("Unesite neki broj ");
		broj = sc.nextInt();
		if (broj < 0)
			System.out.println("Uneli ste pogresan broj");
		else {

			while (broj > 0) {
				cifra = broj % 10;
				suma += cifra;
				broj /= 10;

			}
			System.out.println("Zbir cifara unetog broja je " + suma);
			sc.close();

		}
	}

}

package Test2;

import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {

		// Unos podataka
		Scanner sc = new Scanner(System.in);
		int broj, cifra, temp;

		System.out.print("Unesite neki broj : ");
		broj = sc.nextInt();
		sc.close();
		
		// Resavanje zadatka
		temp = broj;
		int i = 0;
		int novibroj = 0;
		while (broj > 0) {
			i++;
			broj = broj / 10;

		}
		int k = i;
		broj = temp;
		
		while (broj > 0) {
			cifra = broj % 10;
			novibroj += cifra * Math.pow(10, k);
			k = k - 1;
			broj = broj / 10;

		}
		novibroj /= 10;
		// Stampanje rezultata
		if (novibroj == temp)
			System.out.println(" Uneti broj "+temp+" je palindrom .");
		else
			System.out.println("Uneti broj "+temp+" nije palindrom .");
		
	}
}

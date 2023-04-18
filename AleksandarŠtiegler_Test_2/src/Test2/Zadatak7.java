package Test2;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		
		// Unos podataka
		Scanner sc = new Scanner(System.in);
		int broj, cifra;

		System.out.print("Unesite neki broj : ");
		broj = sc.nextInt();
		sc.close();
		
		// Resavanje i stampanje 
		System.out.print("Obrnuti poredak : ");
		do {
			cifra = broj % 10;
			System.out.print(cifra);
			broj = broj / 10;
		} while (broj != 0);

	}

}

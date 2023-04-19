package Zadatak_02;

import java.util.Scanner;

public class Osoba_Glavni {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		
		
		
		System.out.println("Unesite ime i prezime : ");
		String ime = sc.nextLine();
		System.out.println("Unesite datum rodjenja : ");
		String datum = sc.nextLine();
		System.out.println("Unesite adresu stanovanja : ");
		String adresa = sc.nextLine();
		 
		 
		
		sc.close();
		
		Osoba O = new Osoba(ime, datum, adresa);
		
		System.out.println(O.opis());
		
		
	}

}

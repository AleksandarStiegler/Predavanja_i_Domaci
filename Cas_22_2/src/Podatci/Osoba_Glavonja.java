package Podatci;

import java.util.Scanner;

public class Osoba_Glavonja {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		Osoba o1 = new Osoba();
		
		System.out.println("Unesite ime : ");
		o1.ime = sc.nextLine();
		System.out.println("Unesite datum : " );
		o1.datum = sc.nextLine();
		System.out.println("Unesite adresu : ");
		o1.adresa = sc.nextLine();
		
		System.out.println(o1.info());
		sc.close();
	}

}

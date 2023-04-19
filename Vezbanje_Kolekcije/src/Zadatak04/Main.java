package Zadatak04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	


	
		Scanner sc = new Scanner(System.in);
		// Kreiranje liste celih brojeva
		// unos se prekida kada se unese -1
	
		
		List<Integer> brojevi = new ArrayList<Integer>();
		
		public void unos() {
			System.out.println("Za prekid unosenja unesite -1");
		while (true) {
			System.out.println("Unesite element kolekcije : ");
			int a = sc.nextInt();
			if (a == -1) {
				return;
			}else {
			this.brojevi.add(a);}
		}

	}
		void ispis() {
			System.out.println(this.brojevi);
		}

}

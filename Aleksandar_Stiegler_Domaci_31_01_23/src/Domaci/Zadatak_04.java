package Domaci;

import java.util.Scanner;

public class Zadatak_04 {

	public static void main(String[] args) {
		
		// Napisati program koji računa broj parnih i neparnih brojeva u nizu.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj clanova niza : ");
		int n = sc.nextInt();
		System.out.println();
		 
		int niz [] = new int[n];
		System.out.println("Unesite brojeve : ");
		int par =0; int nep =0; // parni i neparni brojac
		// Nisu nam bitni koji su brojevi samo da li su parni ili neparni i koliko ih ima
		// tako da cu direktno u unosu da postavim uslov i da koristim brojace
		for(int i = 0; i < n; i++) {
			System.out.print("niz["+ i +"]");
			niz [i] = sc.nextInt();
			if (niz[i] % 2 == 0) {
				par ++;
			}else {
				nep ++;
			}
			
		}
		System.out.println("U nizu ima "+par+" parnih brojeva, a "+nep+" neparnih brojeva.");
		sc.close();

	}

}

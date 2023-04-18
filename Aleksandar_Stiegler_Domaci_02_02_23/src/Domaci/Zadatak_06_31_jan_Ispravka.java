package Domaci;

import java.util.Scanner;

public class Zadatak_06_31_jan_Ispravka {

	public static void main(String[] args) {

		// Napisati program koji pretvara dekadni broj {0,1,2,3,4,5,6,7,8,9} u
		// binarni{0,1}.

		// Ispravka zadatka prethodnog domaceg, nisam hteo da ispravljam sta sam vec
		// poslao
		// pa cu ovde postaviti ovaj zadatak i jos jedan koji nisam postavio prosli put

		// S obzirom da imamo skup brojeva koje treba da pretvorimo napravicu niz i
		// odraditi
		// pomocu for petlje i napravicu posebno mogucnost za pretvaranje unetog broja
		int k = 0;
		int ost = 0;
		
		for (int i = 0; i <= 9; i++) {

			if (i == 0) {
				System.out.println("Broj " + i + " u binarnom obliku izgleda 0");
			} else if (i == 1) {
				System.out.println("Broj " + i + " u binarnom obliku izgleda 1");
			} else {
				k = i;
				String bins = "";
				while (k != 0) {
					/*
					 * uvedemo string u kojem cemo smestati izgled posto realno bilo kako drugacije
					 * * ce dovesti do sabiranja. Kako nam se broj povecava ulevo moramo prvo da
					 * stavimo ostatak pri deljenju a onda dodamo prethodni string inace nece biti
					 * ispravno posto ce string biti ispisan pogresno binarni broj koji ima osnovu 2
					 * ( 0 i 1) i racuna se tako sto se 0 ili 1 mnozi sa 2 na stepen pozicije - 1
					 * posto pozicije krecu od 0. npr 111 = 2^2 + 2^1 + 2^0 = 4 + 2 + 1 = 7
					 */

					ost = k % 2;
					bins = ost + bins;
					k = k / 2;

				}
				System.out.println("Broj " + i + " u binarnom obliku izgleda : " + bins);
			}

		}
 /* isti princip vazi za bilo koji drugi broj pa cu uvesti i mogucnost unosa preko konzole
  * i ajmo da koristimo do while petlju
  */
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Unesite zeljeni broj koji zelite videti u binarnom obliku ");
		int broj = sc.nextInt();
		sc.close();
		int ostatak = 0;
		String binarnibroj = "";
		
		do {
			ostatak = broj % 2;
			binarnibroj = ostatak + binarnibroj;
			broj = broj / 2;
			
		}while (broj != 0);
		
		System.out.println("Uneti broj u binarnom obliku : "+binarnibroj);
		
		// Do while petlja izgleda zgodnije za ovaj slucaj 
	}

}

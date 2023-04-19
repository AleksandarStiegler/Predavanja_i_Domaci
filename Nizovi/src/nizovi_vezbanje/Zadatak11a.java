package nizovi_vezbanje;

import java.util.Scanner;

public class Zadatak11a {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	//	System.out.println("Unesite broj clanova n : ");
	//	int n = sc.nextInt();

		//int x[] = new int[100];
		int x2[] = new int[100];
		int x5[] = new int[100];
		int x[] = {25, 31, 12, -7, 14, 24, 121, -35, 42, 15 };
		int k2 = 0, k5 = 0;
		// Radicu sa scannerom ali cu napraviti u komentaru i bez scannera da ne
		// bih kucao isti zadatak 3 puta
    
		//System.out.println("Unesite clanove niza .");
		for (int i = 0; i <= 9; i++) {  // i < 9 zato sto imamo 10 skup od 10 brojeva i ne unosimo n
		//	System.out.print("x[" + i + "] = "); // tako da je ovo isti zadatak ali sa unapred
		//	x[i] = sc.nextInt();				// definisanim clanovima , meh
			
			if (x[i] % 2 == 0) {
				k2++;
				x2[k2] = x[i];
			}  if (x[i] % 5 == 0) {
				k5++;
				x5[k5] = x[i];
			}
		}
		System.out.println("Svi clanovi niza su : ");
		for (int i = 0; i <= 9; i++)
			System.out.print(x[i] + "  ");
		System.out.println("\nClanovi niza deljivi sa 2 : ");
		for (int i = 1; i <= k2; i++)
			System.out.print(x2[i] + " ");
		System.out.println("\nClanovi niza deljivi sa 5 : ");
		for (int i = 1; i <= k5; i++)
			System.out.print(x5[i] + "  ");
		
		/* Ostavicu ovako cisto da imam pregled kako sam odradio i moram da pazim prelaze
		 * doduse tek sam poceo da ulazim malo vise u zadatke pa je za sada zaista dobro
		 * barem po mom misljenju. Ne spoticem se na svakom koraku, mada treba jos mnogo vezbe*/
		

	}

}

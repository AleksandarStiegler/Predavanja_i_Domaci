package nizovi_vezbanje;

import java.util.Scanner;

public class Zadatak11 {

	public static void main(String[] args) {

		// Dati su celi brojevi : 25, 31, 12, -7, 14, 24, 121, -35, 42, 15.
		// Sastaviti algoritam i napisati program pomocu koga ce se od ovog niza
		// brojeva formirati 2 nova niza. U prbom nizu su clanovi datog niza koji
		// su deljivi sa 2 a u drugom sa 5. Odstampati sva tri niza.

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj elemenata niza n : ");
		int n = sc.nextInt();
		int x[] = new int[30];

		System.out.println("Unesite clanove niza .");
		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextInt();
		}

		System.out.println("Svi clanovi posmatranog niza");
		for (int i = 0; i < n; i++) {

			System.out.print(" " + x[i]);

		}
		System.out.println("\nClanovi niza deljivi sa 2.");
		for (int i = 0; i < n ; i++)
		{
			if (x[i] % 2 == 0)
				System.out.print(x[i]+"  ");
		}
		System.out.println("\nClanovi niza deljivi sa 5.");
		for (int i = 0; i < n ; i++)
		{
			if (x[i] % 5 == 0)
				System.out.print(x[i]+"  ");
		}
		sc.close(); // U medjuvremenu mi je palo napamet jos jedno resenje
	}

}

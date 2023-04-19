package nizovi_vezbanje;

import java.util.Scanner;

public class Zadatak14 {

	public static void main(String[] args) {

		// Napisati program kojim se ispisuje proizvod najvecih cifara
		// clanova niza x od n elemenata

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj clanova niza n : ");
		int n = sc.nextInt();
		int x[] = new int[n];

		int p = 1;
		System.out.println("Unesite clanove niza .");
		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextInt();
			int temp = x[i];
			int max = temp % 10;
			temp /= 10;
			while (temp != 0) {
				int cifra = temp % 10;
				if (max < cifra) {
					max = cifra;
				}
				temp /= 10;
				
			}
			System.out.println("Najveca cifra clana "+x[i]+" je "+max);
			p *= max;
		}
		System.out.println("Proizvod najvecih cifara clanova je " + p);
		sc.close();
	}

}

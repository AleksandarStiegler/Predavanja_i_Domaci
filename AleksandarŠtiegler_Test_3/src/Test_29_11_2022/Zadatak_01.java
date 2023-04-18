package Test_29_11_2022;

import java.util.Scanner;

public class Zadatak_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Unesite broj clanova niza : ");
		int n = sc.nextInt();

		int x[] = new int[100];

		System.out.println("Unesite clanove niza : ");
		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] = ");
			x[i] = sc.nextInt();
		}

		int suma = 0;
		for (int i = 0; i < n; i++) {
			int temp = x[i];
			if (temp % 10 == 8) {
				suma += x[i];
			}

		}
		System.out.println("Suma elemenata niza X = " + suma);
		sc.close();
	}

}

package Zadatak_07;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		// Niz b ima duplo manje clanova od niza a

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Unesite broj clanova niza n : ");
		int n = Integer.parseInt(bfr.readLine());

		double a[] = new double[100];
		double b[] = new double[50];

		System.out.println("Unesite clanove niza a.");
		for (int i = 1; i <= 2 * n; i++) {
			System.out.print("a[" + i + "]= ");
			a[i] = Double.parseDouble(bfr.readLine());
		}

		System.out.println("Niz a : ");
		for (int i = 1; i <= 2 * n; i++) {
			System.out.print(a[i] + " ");
		}

		for (int i = 1; i <= n; i++) {
			b[i] = (a[i] + a[2 * n + 1 - i]) / 2;
		}
		System.out.println("\nNiz b : ");
		for (int i = 1; i <= n; i++) {
			System.out.print(b[i] + " ");

		}

	}

}

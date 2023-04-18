package Zadatak_09;

import java.util.Scanner;

public class Main {

	 static double fja(int n, double f[], double g[]) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Unesite pocetne vrednosti funkcija f i g : ");
		 f[0] = sc.nextDouble();
		 g[0] = sc.nextDouble();
		 sc.close();

		for (int i = 0; i < n; i++) {
			f[i+1] = f[i ] * g[i] + 3 * n - 1;
			g[i+1] = i * i * f[i] + 2 * g[i];
		}
		return f[n];
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Unesite broj n : ");
		int n = sc.nextInt();

		double f[] = new double[100];
		double g[] = new double[100];

		
		System.out.println("Vrednost F[" + n + "] = " + fja(n, f, g));
		sc.close();
	}

}

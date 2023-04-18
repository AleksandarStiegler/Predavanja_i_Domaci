package Zadatak_08;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.0##");

		System.out.println("Unesite broj clanova nizova x i f : ");
		int n = sc.nextInt();

		double x[] = new double[100];
		double f[] = new double[100];

		System.out.println("Unesite clanove nizova x i f : ");
		for (int i = 0; i < n; i++) {
			System.out.println("x[" + i + "]= ");
			x[i] = sc.nextDouble();
			System.out.println("f[" + i + "]= ");
			f[i] = sc.nextDouble();

		}
		System.out.println("Niz x : ");
		for (int i = 0; i < n; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println("Niz f : ");
		for (int i = 0; i < n; i++) {
			System.out.println(f[i] + " ");
		}
		sc.close();
		// Sume
		double s1 = 0, s2 = 0, s3 = 0, s4 = 0;
		
		for(int i = 0; i < n; i++) {
			s1 = s1 + Math.log10(x[i]);
			s2 = s2 + Math.log10(f[i]);
			s3 = s3 + Math.log10(x[i]) * Math.log10(f[i]);
			s4 = s4 + Math.pow(Math.log10(x[i]), 2);
		}
		// Koeficijenti
		double b0, b1;
		
		b1 = (s1 * s2 - n * s3 )/ (Math.pow(s1,2) - s4 * n);
		b0 = 1 / Math.pow(10, s1 * b1 * s4 / n);
		
		System.out.println("X\tY(X)");
		for(double i = x[0]; i <= x[n - 1]; i += 0.1) {
			double y = b0 * Math.pow(i, b1);
			System.out.println(df.format(i)+" \t"+df.format(y));
		}

	}

}

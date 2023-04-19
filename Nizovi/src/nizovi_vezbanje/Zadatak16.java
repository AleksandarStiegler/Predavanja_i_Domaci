package nizovi_vezbanje;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak16 {

	public static void main(String[] args) throws Exception {

		/*
		 * Napisati program kojim se odredjuju k-ti elementi nizova na osnovu zadatih
		 * vrednosti a[0] i b[0] ako vazi a[i] = a[i-1] + b[i-1] ; b[i] = a[i-1] *
		 * b[i-1] za i = 1,2,3....n
		 */

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Unesite pocetnu vrednost a[0] : ");
		int a0 = Integer.parseInt(bfr.readLine());
		System.out.print("Unesite pocetnu vrednost b[0] : ");
		int b0 = Integer.parseInt(bfr.readLine());
		System.out.println("Unesite do kog clana niza zelite da racunate n : ");
		int n = Integer.parseInt(bfr.readLine());

		int a[] = new int[100];
		int b[] = new int[100];
		a[0] = a0;
		b[0] = b0;

		for (int i = 1; i <= n; i++) {
			a[i] = a[i - 1] + b[i - 1];
			b[i] = a[i - 1] * b[i - 1];
		}
		System.out.println("a[" + n + "] = " + a[n] + "\tb[" + n + "] = " + b[n]);

	}

}

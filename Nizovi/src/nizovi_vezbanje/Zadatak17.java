package nizovi_vezbanje;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak17 {

	public static void main(String[] args) throws Exception {

		/*
		 * Niz F je definisan sa F(1) = 0.5; F(n+1) = suma (i ide od 1 do n)
		 * F(i)*F(n+1-i) Napisati program kojim se ucitav prirodan broj n <= 1000 i
		 * ispisuje f(n) Ovo je zanimljivo da vidim kako da postavim zadatak
		 */

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite broj clanova niza n od 1 do 1000 : ");
		int n = Integer.parseInt(bfr.readLine());

		double f[] = new double[1001];
		
		double suma;
		f[1] = 0.5;
		if (n < 1 || n > 1000)
			System.out.println("Greska");
		else {
			f[1] = 0.5;
			for ( int k = 2; k <= n; k++) {
				suma = 0;
				for (int i = 1; i <= k-1; i++) {
				suma += f[i] * f[k - i];
				}
				f[k] = suma;
				
			}
			System.out.println("f[" + n + "] = " + f[n]);
		}
		

	}

}

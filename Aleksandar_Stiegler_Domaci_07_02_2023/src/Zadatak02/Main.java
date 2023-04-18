package Zadatak02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("##0.000");

		System.out.print("Unesite broj predmeta : ");
		int n = Integer.parseInt(bfr.readLine());

		System.out.println();

		// Posto se trazi broj predmeta moramo napraviti niz
		// i napravicu niz za cuvanje zapremina

		Predmet niz[] = new Predmet[n];
		double zapremina[] = new double[n];
		double tezina[] = new double[n];

		double ukupnaTezina = 0.0;
		double prosecnaTezina = 0.0;

		for (int i = 0; i < n; i++) {
			System.out.println("Unesite tip predmeta ( 's' za sferu i 'k' za kvadar ) ");
			char t = bfr.readLine().charAt(0);
			System.out.print("Unesite specificnu tezinu predmeta :");
			double spt = Double.parseDouble(bfr.readLine());

			System.out.println();
			if (t == 's') {
				System.out.print("Unesite poluprecnik :");
				double pol = Double.parseDouble(bfr.readLine());
				niz[i] = new Sfera(t, spt, pol);
				zapremina[i] = Sfera.zapreminaSfere(pol);
				tezina[i] = zapremina[i] * spt;
			} else if (t == 'k') {
				System.out.println("\nUnesite stranice kvadra : ");
				System.out.print("\na : ");
				double a = Double.parseDouble(bfr.readLine());
				System.out.print("\nb : ");
				double b = Double.parseDouble(bfr.readLine());
				System.out.print("\nc : ");
				double c = Double.parseDouble(bfr.readLine());
				niz[i] = new Kvadar(t, spt, a, b, c);
				zapremina[i] = Kvadar.zapreminaKvadra(a, b, c);
				tezina[i] = zapremina[i] * spt;
			}
		}

		// Sada imamo formirane sve potrebne podatke o predmetima
		// Potrebno nam je da nadjemo ukupnu pa prosecnu tezinu
		for (int j = 0; j < n; j++) {
			ukupnaTezina += tezina[j];
		}
		prosecnaTezina = ukupnaTezina / n;

		int k = 0;
		while (k < n) {
			if (tezina[k] > prosecnaTezina) {
				if (niz[k].getI() == 's') {
					System.out.println("Predmet je sfera , zapremine " + df.format(zapremina[k]) + " i tezine " + df.format(tezina[k]));
					System.out.println(niz[k].opisPredmeta());
				} else {
					System.out.println("Predmet je kvadar , zapremine " + df.format(zapremina[k]) + " i tezine " + df.format(tezina[k]));
					System.out.println(niz[k].opisPredmeta());
				}
			}
			k++;
		}

	}

}

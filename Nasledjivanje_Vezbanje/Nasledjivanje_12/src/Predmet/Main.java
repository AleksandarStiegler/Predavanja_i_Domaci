package Predmet;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite koliko predmeta zelite da kreirate");
		int n = Integer.parseInt(bfr.readLine());

		Predmet p[] = new Predmet[n];
		double prosecnaTezina = 0.0;
		double ukupnaTezina = 0.0;
		String opis[] = new String[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Unesite S za sferu ili K za kvadar");
			char c = bfr.readLine().charAt(0);

			if (c == 'S' || c == 's') {
				System.out.println("Unesite specificnu tezinu");
				double st = Double.parseDouble(bfr.readLine());
				System.out.println("Unesite poluprecnik");
				double pol = Double.parseDouble(bfr.readLine());
				p[i] = new Sfera(st, pol);
				ukupnaTezina += p[i].tezina();
				Sfera sf = new Sfera(st, pol);
				opis[i] = sf.opisSfere();
			} else if (c == 'K' || c == 'k') {
				System.out.println("Unesite specificnu tezinu");
				double st = Double.parseDouble(bfr.readLine());
				System.out.println("Unesite stranice kvadra ");
				System.out.print("a : ");
				double stra = Double.parseDouble(bfr.readLine());
				System.out.print("\nb : ");
				double strb = Double.parseDouble(bfr.readLine());
				System.out.print("\nc : ");
				double strc = Double.parseDouble(bfr.readLine());
				p[i] = new Kvadar(st, stra, strb, strc);
				ukupnaTezina += p[i].tezina();
				Kvadar kv = new Kvadar(st, stra, strb, strc);
				opis[i] = kv.opisKvadra();
			} else {
				System.out.println("Greska . Unesite samo S ili K");
			}

		}

		prosecnaTezina = ukupnaTezina / n;

		for (int i = 0; i < n; i++) {
			if (p[i].tezina() > prosecnaTezina) {
				System.out.println(opis[i]);
			}
		}

	}

}

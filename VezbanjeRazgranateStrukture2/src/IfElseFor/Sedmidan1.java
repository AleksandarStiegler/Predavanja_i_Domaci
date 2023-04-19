package IfElseFor;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sedmidan1 {

	public static void main(String[] args) throws Exception {

		// 7-mi dan konacna verzija

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int d, m, g, k = 0;

		System.out.print("Unesite redni broj dana u mesecu :");
		d = Integer.parseInt(bfr.readLine());
		System.out.print("Unesite mesec 1 - 12 :");
		m = Integer.parseInt(bfr.readLine());
		System.out.print("Unesite godinu :");
		g = Integer.parseInt(bfr.readLine());

		int nd = d + 7;

		if (d < 1 || m < 1 || m > 12 || g < 0)
			System.out.println("Pogresan unos , dan >= 1 ; mesec ide od 1 do 12 ; god > 0. Pokusajte ponovo");

		else if (g % 400 == 0 || (g % 4 == 0 && g % 100 != 0))
			k = 1;
		else
			k = 2;
		switch (m) {
		case 1, 3, 5, 7, 8, 10, 12: {
			if (d <= 31 && nd > 31) {
				nd = nd - 31;
				m++;
				if (m > 12)
					m = 1;
				g++;
				System.out.println("Novi datum je " + nd + "." + m + "." + g + ".");
			} else if (nd <= 31) {
				System.out.println("Novi datum je " + nd + "." + m + "." + g + ".");
			} else
				System.out.println("Pogresan unos, probajte ponovo.");
			break;
		}
		case 4, 6, 9, 11: {
			if (d <= 30 && nd > 30) {
				nd = nd - 30;
				m++;
				System.out.println("Novi datum je " + nd + "." + m + "." + g + ".");
			} else if (nd <= 30) {
				System.out.println("Novi datum je " + nd + "." + m + "." + g + ".");
			} else
				System.out.println(" Pogresan unos, probajte ponovo.");
			break;
		}
		case 2: {
			switch (k) {
			case 1: {
				if (d <= 29 && nd > 29) {
					nd = nd - 29;
					m++;
					System.out.println("Novi datum je " + nd + "." + m + "." + g + ".");
				} else if (nd <= 29) {
					System.out.println("Novi datum je " + nd + "." + m + "." + g + ".");
				} else
					System.out.println("Pogresan unos, unesite ponovo.");
				break;
			}
			case 2: {
				if (d <= 28 && nd > 28) {
					nd = nd - 28;
					m++;
					System.out.println("Novi datum je " + nd + "." + m + "." + g + ".");
				} else if (nd <= 28) {
					System.out.println("Novi datum je " + nd + "." + m + "." + g + ".");
				} else
					System.out.println("Pogresan unos, unesite ponovo.");
				break;
			}
			default:
				System.out.println("Pogresan unos.");
			}

		}
		}

	}

}

package Zadatak_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.000");

		double a, b, c;

		System.out.print("Unesite vrednost promenljive a : ");
		a = sc.nextDouble();
		System.out.print("Unesite vrednost promenljive b : ");
		b = sc.nextDouble();
		System.out.print("Unesite vrednost promenljive c : ");
		c = sc.nextDouble();

		if (c == b) {
			System.out.println("Deljenje nulom c mora biti razlicito od b!");
		} else {

			// Potrebno je naci zbir i razliku vrednosti funkcija f i g

			// F-ja f

			double f = (a - b) / (c + (a / (c + b / (c - b))));
			System.out.println("Vrednost f-je f + " + df.format(f));

			// F-ja g

			double x = Math.toRadians(a);
			double y = Math.toRadians(c);
			double g = (a + b + Math.sin(x)) * Math.cos(y);
			System.out.println("Vrednost f-je g : " + df.format(g));

			// Krajnje resenje i stampanje rezultata

			System.out.println("Zbir f-ja f i g iznosi " + df.format(f + g));
			System.out.println("Razlika f-ja f i g iznosi " + df.format(f - g));

			sc.close();

		}

	}

}

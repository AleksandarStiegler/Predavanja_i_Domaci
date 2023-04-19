package nizovi_vezbanje;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak12 {

	public static void main(String[] args) {

		/*
		 * Napisati program kojim se izracunavaju i stampaju vrednosti prvih 10
		 * Lagerovih polinoma koriscenjem rekurentnih formula L0(x) = 1 , L1(x) = 1 - x
		 * ; Ln+1(x) = (2n-1-x)Ln(x) -n^2Ln-1(x)
		 */

		DecimalFormat df = new DecimalFormat("#0.000");
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite vrednost promenljive x.");
		double x = sc.nextDouble();

		double l[] = new double[100];
		l[0] = 1;
		l[1] = 1 - x;
		for (int i = 2; i <= 9; i++) {
			
			l[i] = (2 * (i - 1) - 1 - x) * l[i - 1] - (i - 1) * (i - 1) * l[i - 2];

		}
		System.out.println("\tR.BR. \tVred.Pol.");

		for (int i = 0; i <= 9; i++) {
			System.out.println("\t" + i + "\t" + df.format(l[i]));
		
		}
		sc.close();
	}

}

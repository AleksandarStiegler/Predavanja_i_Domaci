package Obnavljanje;

import java.text.DecimalFormat;

public class Zadatak11 {

	public static void main(String[] args) {

		System.out.println("\tR.BR\tX\tY(X)");
		DecimalFormat df = new DecimalFormat("##.000");
		double y = 0;
		int k = 0;
		/*
		 * for (double x = 1; x <= 2; x += 0.2) { y = x + 2.5 * Math.pow(x, 3) / (x -
		 * 2.8); k++; System.out.println("\t" + k + "\t" + df.format(x) + "\t" +
		 * df.format(y)); }
		 */

		double x = 1.0;
		while (x < 2) {
			y = x + 2.5 * Math.pow(x, 3) / (x - 2.8);
			k++;
			System.out.println("\t" + k + "\t" + df.format(x) + "\t" + df.format(y));
			x += 0.2;
			
		}
	}

}

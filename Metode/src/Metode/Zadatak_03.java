package Metode;

import java.text.DecimalFormat;

public class Zadatak_03 {
	
	static double f (double x) {
		return  2*x - Math.log(x);
	}
	static double g(double x) {
		return Math.tan(x / 2) + Math.abs(x);
	}

	public static void main(String[] args) {
		// Primer 6 predavanje 18 slajd 30
		
		DecimalFormat df = new DecimalFormat("##0.000");
		double x = 0.1;
		double y;
		System.out.println("\tX\tY");
		for (x = 0.1 ; x <= 0.9 ; x += 0.1)
		{
			y = f(2*g(f(x)));
			System.out.println("\t"+df.format(x)+"\t"+df.format(y));
		}
		
		

	}

}

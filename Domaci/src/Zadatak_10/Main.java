package Zadatak_10;

import java.text.DecimalFormat;

public class Main {
	
	static double fja(double x, double y) {
		double f, rad;
		
		if ( x < y) {
			rad = Math.toRadians(y);
			f = Math.exp(x) * Math.cos(3 * rad);
		}
		else if (x == y) {
			rad = Math.toRadians(x);
			f = Math.sin(x);
		}
		else {
			f = 1 + Math.sqrt(Math.abs(x * y));
		}
		return f; 
	}
	
	public static void main(String[] args) {
		
		// Vrednosti su zadate pa cu preskociti konzolu u ovom zadatku
		
		DecimalFormat df = new DecimalFormat("##0.00#");
		
		System.out.println("X\tY\tF(X,Y)");
		for (double x = 0.1; x <= 0.5; x += 0.1) {
			for(double y = 0.01; y <= 0.03; y += 0.01) {
				System.out.println(df.format(x)+"\t"+df.format(y)+"\t"+df.format(fja(x,y)));
			}
		}
		// Ne znam da li je greska prilikom kucanja za ove vrednosti za y posto u ovom slucaju
		// ce se uvek samo obradjivati else grana jer je y uvek manje od x .
		// Zakomentarisao sam isti primer samo sa y koje ide od 0.1 do 0.3 sa korakom 0.1,
		// tako da tu imamo sve grane obradjene.
		
		/*	System.out.println("X\tY\tF(X,Y)");
		for (double x = 0.1; x <= 0.5; x += 0.1) {
			for(double y = 0.1; y <= 0.3; y += 0.1) {
				System.out.println(df.format(x)+"\t"+df.format(y)+"\t"+df.format(fja(x,y)));
			}
		} */

	}

}

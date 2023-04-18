package Zadatak_04;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		
		double x , y , z , a ;
		DecimalFormat df = new DecimalFormat("##0.00");
		// Posto su po zadatku sve vrednosti zadate necu koristiti unos preko konzole
		
		// x ide od 1 do 4 sa korakom 1
		// a ide od 0.1 do 0.5 sa korakom 0.5
		// y ide (vraca se) od 0.5 sa korakom 0.05 do 0.2
		
		
		int k = 0; // Brojac
		
		System.out.println("R.BR.\tx\ta\ty\tz");
		for (x = 1; x <= 4; x++) {
			for(a = 0.1; a <= 0.5; a += 0.1) {
				for(y = 0.5; y >= 0.2; y -= 0.05) {
					k++;
					z = Math.pow(((x + a + y) / (x - y)), 2) - x / ( x + a);
					System.out.println(k+"\t"+x+"\t"+df.format(a)+"\t"+df.format(y)+"\t"+df.format(z));
				}
			}
		}

	}

}

package Petlje_i_Razgranate_strukture;

import java.text.DecimalFormat;

public class Zadatak08 {

	public static void main(String[] args) {
		
		// Napisati program za izracunavanje vrednosti f-je
		//   y = x - 0.8x na kvadrat  ,  while i do while petlje
		
		double y, x;
		DecimalFormat df = new DecimalFormat("##.0000");
		x = 1.0;
		int i = 1;
		
		System.out.println("\tR.BR.\tX\tY(X)");
		
		/*
		while (x <= 5.0)
		{
			y = x - 0.8*x*x;
			System.out.println("\t"+i+"\t"+x+"\t"+df.format(y));
			x += 0.5;
			i++;
			
		}   */
		
		do 
		{
			y = x - 0.8 * x * x;
			System.out.println("\t"+i+"\t"+x+"\t"+df.format(y));
			i++;  x += 0.5;
		} while ( x <= 5.0 );
		
		

	}

}

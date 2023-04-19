package RazgranateStrukture;

import java.util.Scanner;

public class Primer16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Primer 17 predavanje 6
		
		Scanner ulaz = new Scanner(System.in);
		
		double x, y, z, f=0.0;
		
		System.out.print("Unesite vrednost za x : ");
		x = ulaz.nextDouble();
		System.out.print("Unesite vrednost za y : ");
		y = ulaz.nextDouble();
		System.out.print("Unesite vrednost za z : ");
		z = ulaz.nextDouble();
		ulaz.close();
		
		if (2*x != y)
		{	
			f = (x + y)*(x + z)/(2*x - y);
		System.out.println("Resenje funkcije f = "+f);
		}
		else 
			System.out.println("Deljenje nulom");

	}

}

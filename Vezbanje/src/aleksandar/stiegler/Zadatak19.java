package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Primer 8 slajd 23 predavanje 5
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		// Unos podataka
		System.out.print("Unesite vrednost x = ");
		double x = input.nextDouble();
		System.out.print("Unesite vrednost y = ");
		double y = input.nextDouble();
		System.out.print("Unesite vrednost z = ");
		double z = input.nextDouble();
		
		// Resenje problema
		
		double f = (x+y)*(x+z)*Math.sin(x)/(2*x-y);
		
		// Stampanje rezultata
		
		System.out.println("Iznos funkcije f = "+df.format(f));
		
		input.close();
	
	}
	

}

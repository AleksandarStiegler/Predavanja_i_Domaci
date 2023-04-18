
package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {
		
		// Unos podataka
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Unesite koordinate prve tacke Xa i Ya ");
		double Xa = input.nextDouble();
		double Ya = input.nextDouble();
		
		System.out.println("Unesite koordinate druge tacke Xb i Yb");
		double Xb = input.nextDouble();
		double Yb = input.nextDouble();
		
		// Resavanje problema
		
		double d = Math.sqrt(Math.pow((Xa - Xb),2) + Math.pow((Ya - Yb),2));
		
		// Stampanje rezultata
		
		System.out.println("Rastojanje izmedju zadatih tacaka A i B je d = "+df.format(d));
		input.close();
		
		
		
	
}
}
package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Primer 3 slajd 8 predavanje 5
		
		// naci y u zadatom izrazu ako su a i b...
		
		// Unos podataka
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		
		
		System.out.println("Unesite vrednosti za a i b ");
		double a = input.nextDouble();
		
		double b = input.nextDouble();
	
		// Resavanje problema (izraza) 
		
		double y = (1-Math.min(a,b))/(1+Math.max(a,b));
		
		// Stampanje rezultata
		
		System.out.println("Vrednost izraza y = "+df.format(y));
		input.close();
		
		
		
		
	}

}

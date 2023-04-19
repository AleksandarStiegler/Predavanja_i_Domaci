package RazgranateStrukture;

import java.util.Scanner;

public class Primer14 {

	public static void main(String[] args) {
		
		// Primer 15 sa 6tog predavanja
		
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Unesite x = ");
		double x = ulaz.nextDouble();
		System.out.print("Unesite y = ");
		double y = ulaz.nextDouble();
		ulaz.close();
	
		double f;
		if (x>y)
			f = Math.sqrt((x - 0.2) / (2 + y));
		else 
			f = Math.sqrt((y - 0.2) / (2 + x));
		
		System.out.println("Resenje funkcije je "+f);
			
				

	}

}

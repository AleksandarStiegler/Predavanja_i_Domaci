package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SedmiPrimer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Primer 5 slajd 32, kao sto se vidi kad se udje u predavanje
		// brojevi se ne slazu sa brojevima zadataka posto sam ja i objasnjenja pretvorio u programcice
		// izracunati dijagonalu pravougaonika za zadate stranice a i b
		
		// unos podataka
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Unesite vredost stranice a = ");
		double a = input.nextDouble();
		System.out.println("Unesite vrednost stranice b = ");
		double b = input.nextDouble();
		
		double d = Math.sqrt(a*a + b*b);
		
		// Stampanje rezultata
		
		System.out.println("Duzina dijagonale pravougaonika d = " + df.format(d));
		
		// koja glupost mislio sam za trenutak da je trik zadatak umor me je stigao

	}

}

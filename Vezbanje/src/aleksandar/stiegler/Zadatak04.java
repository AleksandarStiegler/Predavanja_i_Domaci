package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ovo je jedan od zadataka sa predavanja
		
		// napisati program za pretvaranje galona u litre. Napomena 1galon = 4.54 l
		
		// Unos podataka
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("#.##");
		
		System.out.println("Unesite vrednost u galonima gal. = ");
		double gal = input.nextDouble();
		
		System.out.println("Vrednost u litrima je "+df.format(gal*4.54)+"l");
		input.close();

	}

}

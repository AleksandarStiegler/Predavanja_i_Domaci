package aleksandar.stiegler;

import java.util.Scanner;

public class Zadatak21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Napisati program koji vreme ucitano u satima minutima i sekundama
		// izracunava i pretvara u sekunde
		
		Scanner input = new Scanner(System.in);

		System.out.print("Unesite broj sati h = ");
		int h = input.nextInt();
		System.out.print("Unesite broj minuta m = ");
		int m = input.nextInt();
		System.out.print("Unesite broj sekundi s = ");
		int s = input.nextInt();
		
		// resavanje i stampanje rezultata
		
		System.out.println("Uneseno vreme u sekundama je "+(h*3600+m*60+s));
		
	}

}

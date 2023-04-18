package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Unos podataka
		
		// a - stranica kvadrata
		// O - obim kvadrata
		// P - povrsina kvadrata
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		
		System.out.print("Unesite vrednost stranice kvadrata a =");
		double a = input.nextDouble();
		
		// Resenje zadatka
		
		double O = 4*a;
		double P = a*a;
		// Stampanje rezultata
		
		System.out.println("Za unetu vrednost a = "+a+"\nObim kvadrata O = "+df.format(O)+"\nPovrsina kvadrata P = "+df.format(P));
		
		input.close();
		
		
	}

}

package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Unos vrednosti
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Unesite vrednosti za promenljive x, y, z ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();
		
		// Resavanje problema
		
		double f = (x-2*y)*(x+z)/(2*x+y);
		
		// Stampanje rezultata
		
		System.out.println("Vrednost funkcije f za unete vrednost je f = "+df.format(f));
		input.close();
		

	}

}

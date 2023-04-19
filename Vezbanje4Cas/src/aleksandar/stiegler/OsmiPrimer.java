package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class OsmiPrimer {
	
	public static void main(String [] args ) {

		// Napisati program kojim se izacunava obim i povrsina trougla na osnovu zadatih stranica
		
		// a, b, c - stranice trougla
		// O - obim trougla   
		// s - poluobim tougla potrebno za Heronov obrazac kako bismo izracunali povrsinu trougla
		// P - povrsina trougla
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		
		// Unos podataka
		
		System.out.println("Unesite stranicu trougla a = ");
		double a = input.nextDouble();
		System.out.println("Unesite stranicu trougla b = ");
		double b = input.nextDouble();
		System.out.println("Unesite stranicu trougla c = ");
		double c = input.nextDouble();
		
		// Resenje problema
		double O = a + b + c;
		double s = O/2;
		double P = Math.sqrt((s*(s - a)*(s - b)* (s - c)));
		
		// Stampanje rezultata\\
		
		System.out.println("Obim trougla O = " + df.format(O) + "\nPovrsina trougla P = " + df.format(P));
		input.close();
			
	
}
}

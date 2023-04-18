package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Naci y prema formuli y = 5 + max(a na 2, b na 2)
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		
		System.out.println("Unesite vrednosti za promenljive a i b ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		
		// Resenje problema
		
		double y = 5 + Math.max(a*a,b*b);
		
		// Ispisivanje rezultata
		
		System.out.println("Resenje naseg izraza za vrednosti a = "+df.format(a)+" i b = "+df.format(b)+
				" je y = "+df.format(y));
		input.close();
		
	}

}

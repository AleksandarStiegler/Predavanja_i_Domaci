package RazgranateStrukture;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Primer05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Napisati program kojim se za unetu vrednost a ispisuje njegov koren ako je vrednost pozitivna
		// a njegov kvadrat ako je negativna
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		
		// Ovo cu resiti direktno ternarnim izrazom
		
		double a, y;
	    
		System.out.println("Unesite vrednost a = ");
		a = input.nextDouble();
		
		y = (a>0) ? Math.sqrt(a) : a*a;
		
		System.out.println("Vrednost izraza y = "+df.format(y));
		input.close();
		
	}

}

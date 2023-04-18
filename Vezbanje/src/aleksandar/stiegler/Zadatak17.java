package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// napisati izraz kojim se promenljivoj p dodeljuje vrednost true ako
		// se od odsecaka sa duzinama x, y, z moze konstruisati trougao
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		// Unos podataka
		
		System.out.print("Unesite vrednost duzine x : ");
		double x = input.nextDouble();
		System.out.print("Unesite vrednost duzine y : ");
		double y = input.nextDouble();
		System.out.print("Unesite vrednost duzine z : ");
		double z = input.nextDouble();
		
		// Resavanje problema
		
		boolean p = (x+y>z)&&(x+z>y)&&(y+z>x);
		
		// Stampanje rezultata
		
		System.out.print("p = "+p);
				

	}

}

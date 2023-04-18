package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Napisati program za izracunavanje zapremine i povrsine lopte na osnovu 
		// unetog poluprecnika
		
		
		// V - zapremina lopte
		// P - povrsina lopte
		// r - poluprecnik
		// PI                                //na3
		// Zapremina lopte se izracunava V = 4/3r PI
		// Povrsina lopte  P= 4rna2 PI
		
		// Unos podataka
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		
		System.out.println("Unesite vrednost poluprecnika r = ");
		double r = input.nextDouble();
		
		// Resavanje programa
		
		double V = 4*Math.pow(r,3)*Math.PI/3;
		double P = 4*r*r*Math.PI;
		
		// Stampanje rezultata
		
		System.out.print("Za unetu vrednost poluprecnika r = " +df.format(r) +"\nVrednost zapremine je V = " + df.format(V)+ "\nVrednost povrsine je P = "+ df.format(P));
		
		
		input.close();
		
		
		
	}

}

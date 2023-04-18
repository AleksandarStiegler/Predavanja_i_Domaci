package aleksandar.stiegler;

import java.util.Scanner;

public class SinCos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		 System.out.print("Unesite vrednost ugla u radijanima: "); 
		 double x=input.nextDouble();
		 System.out.println("Sinus zadatog ugla je: " + Math.sin(x));
		 System.out.print("Kosinus zadatog ugla je: " + Math.cos(x));
	}

}

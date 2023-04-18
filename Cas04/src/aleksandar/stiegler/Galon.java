package aleksandar.stiegler;

import java.util.Scanner;

public class Galon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in); 
		System.out.print("Unesite zapreminu u galonima: "); 
		double g = input.nextDouble();
		System.out.println("Zapremina u litrima je: " + (g * 4.54));
       input.close();
	}

}

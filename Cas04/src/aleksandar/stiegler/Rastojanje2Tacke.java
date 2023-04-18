package aleksandar.stiegler;

import java.util.Scanner;

public class Rastojanje2Tacke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// Unos koordinata tacaka
		System.out.println("Unesite koordinate tačke M: "); 
		double x1 = input.nextDouble();
		double y1 = input.nextDouble(); 
		
		System.out.println("Unesite koordinate tačke N: ");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		//Izracunavanje rastojanja izmedju 2 tacke
		double d = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)); 
		
		System.out.println("Rastojanje između tačaka M (" + x1 + "," + y1 + ") i N (" + x2 + "," + y2 + ") je " + d);
		

	}

}

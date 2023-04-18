package aleksandar.stiegler;

import java.util.Scanner;

public class Zadatak20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// primer 9 slajd 28 predavanje 5
		
		// sastaviti algoritam i napisati program kojim se izracunava
		// vrednost funkcije y(x) na osnovu unete vrednosti promenljive x
		// Stampati vrednost funkcije
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite vrednost za x ");
		double x = input.nextDouble();
		
		// Resavanje problema
		
		 boolean y = Math.sqrt((2+x+Math.pow(x,3))/(x+2))>0 | Math.exp(x)<(x-1) & Math.sqrt(x-1)<=0;   
		
		System.out.println("Za unetu vrednost x "+x+"\n vrednost izraza y = "+y);
	}

}

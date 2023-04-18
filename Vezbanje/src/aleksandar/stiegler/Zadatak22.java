package aleksandar.stiegler;

import java.util.Scanner;

public class Zadatak22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Primer 15 slajd 58 predavanje 5
		// Zamena vrednosti dva broja koriscenjem privremene promenljive
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite prvi broj = ");
		int x = input.nextInt();
		System.out.println("Unesite drugi broj = ");
		int y = input.nextInt();
		
		int temp = y;
		y=x;
		x=temp;
		
		// Stampanje rezultata
		System.out.println("Sada je prvi broj "+x+" , dok je drugi broj "+y);
		
		

	}

}

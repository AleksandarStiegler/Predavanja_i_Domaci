package SwitchIfElseStrukture;

import java.util.Scanner;

public class Zadatak06 {

	public static void main(String[] args) {
		
		// Napisati program kojim se utvrdjuje da li je godina prestupna ili nije
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite godinu");
		int g = sc.nextInt();
		sc.close();
	if ( g < 0)
	{
		System.out.println(" Pogresan unos, pokusajte ponovo .");
	}
	else if ( g % 400 == 0  ||  g % 4 == 0 && g % 100 != 0)
		{
			System.out.println(g+" je prestupna godina.");
		}
		else 
		{
			System.out.println(g+" nije prestupna godina.");
		}
	}

}

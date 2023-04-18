package aleksandar.stiegler;

import java.util.Scanner;

public class Zadatak18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// napisati program kojim se logickoj promenljivoj p dodeljuje vrednost true
		// ako se pravougaonik moze ceo smestiti u pravougaonik sa stranicama c i d
		
		// Unos podataka
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite vrednost stranica a i b ");
		double a = input.nextDouble();
		double b = input.nextDouble();
		System.out.println("Unesite vrednost stranica c i d ");
		double c = input.nextDouble();
		double d = input.nextDouble();
		
		// Resavanje problema
		
		boolean p = (a<c && b<d)||(a<d && b<c);
		
		System.out.println("Vrednost izraza za unesene vrednosti stranica a,b i c,d je p = "+p);
		input.close();

	}

}

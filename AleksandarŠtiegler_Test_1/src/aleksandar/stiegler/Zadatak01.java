package aleksandar.stiegler;

import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Unos podataka
		
	    Scanner input = new Scanner(System.in);
	    
		System.out.println("Unesite vrednost za logicku promenljivu x ");
	    boolean x = input.nextBoolean();
	    System.out.println("Unesite vrednost za logicku promenljivu y ");
	    boolean y = input.nextBoolean();
		
		// Resavanje problema
		
		boolean z = !( x | y ) & ! x | y;
  
		// Stampanje vrednosti
		
		System.out.println("Vrednost funkcije z = "+z);
		input.close();
		
		
	}

}

package aleksandar.stiegler;

import java.util.Scanner;

public class Zadatak16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Primer 4 slajd 12, 5 predavanje
		
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite vrednost za logicku promenljivu x= ");
		boolean x = input.nextBoolean();
		System.out.print("Unesite vrednost za logicku promenljivu y= ");
		boolean y = input.nextBoolean();
		
		boolean z = !(x&y)|(x&y);
		
		System.out.println("Vrednost izraza z = "+z);
		input.close();

	}

}

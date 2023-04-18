package aleksandar.stiegler;

import java.util.Scanner;

public class Deljivost {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input = new Scanner(System.in);
	
		System.out.print("Unesite vrednost za a: "); 
		int a = input.nextInt(); 
	
		System.out.print("Unesite vrednost za b: "); 
		int b = input.nextInt(); int z; 
	
		if (a % 2 == 0 && b % 3 == 0)  // - operator jednakosti (tacnosti) relacioni operator
			z = a + b;     // kojim proveramo da li je jedna strana jednaka drugoj
		                      //  != ovo je operator nejednakosti 
		else 
			z = a - b; 
	
		System.out.println("z = " + z);
		input.close();
		
		

	}

}

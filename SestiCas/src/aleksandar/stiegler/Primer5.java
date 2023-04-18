package aleksandar.stiegler;

import java.util.Scanner;

public class Primer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner input = new Scanner(System.in);
		
		 System.out.print("Unesite vrednost za a: ");
		 double a = input.nextDouble(); 
		 System.out.print("Unesite vrednost za b: "); 
		 double b = input.nextDouble(); 
		
		 
		 double z; 
		 if (a > b) 
			 z = 2 * a + b; 
		 else 
			 z = a - 2 * b; 
		 
		 System.out.println("z = " + z); input.close();

	}

}

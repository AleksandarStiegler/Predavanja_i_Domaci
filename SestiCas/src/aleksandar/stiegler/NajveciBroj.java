package aleksandar.stiegler;

import java.util.Scanner;

public class NajveciBroj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner input = new Scanner(System.in); 
		 System.out.print("Unesite vrednost za a: "); 
		 int a = input.nextInt();
		 System.out.print("Unesite vrednost za b: ");
		 int b = input.nextInt(); 
		 System.out.print("Unesite vrednost za c: "); 
		 int c = input.nextInt();
		
		 int max = a; 
	
		 if (b > max) 
			 max = b;
		 if(c > max) 
			 max = c; 
	
		 System.out.print("Najveći broj je: " + max);
		 input.close();
		 /* Moguce resenje ali nije optimalno resenje
		  * iskreno prvi primer je elegantan i bas dobar*/
		 /*package UUP1; import java.util.Scanner; 
		  * public class NajveciBroj { public static void main(String[] args) { 
		  * Scanner input = new Scanner(System.in);
		  *  System.out.print("Unesite vrednost za a: "); 
		  *  int a = input.nextInt(); 
		  *  System.out.print("Unesite vrednost za b: "); 
		  *  int b = input.nextInt(); 
		  *  System.out.print("Unesite vrednost za c: ");
		  *   int c = input.nextInt(); 
		  *    int max = a;
		  *    int max; 
		  *    if (b > a) max = b;
		  *     else max = a;
		  *      if (c > a) max = c;
		  *       else max = a;
		  *        if (c > b) max = c; 
		  *        else max = b; 
		  *    System.out.print("Najveći broj je: " + max);
		  *     input.close(); } }
		  */
		 
		 

	}

}

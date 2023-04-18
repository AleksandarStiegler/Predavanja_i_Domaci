package WhileDoWhilePetlje;

import java.util.Scanner;

public class Zadatak09 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int i , n ;
		double suma = 0.0;
		System.out.println("Unesite n ");
		n = sc.nextInt();
	/*	
		i = 1;
		while ( i <= n )
		{
			suma += (double) 1 /(2 * i);
			i++;
		}
	
		System.out.println(suma);
		*/

		i = 1;
		// Do while petlja
		do {
			
			suma += 1/ (double) (i * 2);
			i++;
		}
		while (i <= n);
		System.out.println(suma);
		sc.close();
	}

}

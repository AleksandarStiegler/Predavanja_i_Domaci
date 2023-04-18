package WhileDoWhilePetlje;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {

		// napisati program kojim se izracunava 1 na 2, 2 na 2,..... n na 2

		Scanner sc = new Scanner(System.in);
		
		int i, n, suma = 0;
		
		System.out.println("Unesite n ");
		n = sc.nextInt();
		
		i = 1 ;
	/*	
		while (i <= n)
		{
			if (i % 2 != 0 )
				suma += (i*i);
			i ++;
		}
		*/
		do {
			if (i % 2 != 0)
			suma += (i*i);
			i++;
		}
		while ( i <= n );
		System.out.println(suma);
		sc.close();
	}

}

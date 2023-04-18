package WhileDoWhilePetlje;

import java.util.Scanner;

public class Zadatak11 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int i, k, n;
		double suma = 0.0;
		System.out.print("Unesite konstantu k :");
		k = sc.nextInt();
		System.out.println("Unesite do kog broja ide suma , n : ");
		n = sc.nextInt();
		
		i = 0;
		
		while (i <= n)
		{
			suma += 2/ (double)(k + i);
			i++;
			
		}
		System.out.println("Za uneto n = "+n+" i konstantu k = "+k+" , suma = "+suma);
sc.close();
	}

}

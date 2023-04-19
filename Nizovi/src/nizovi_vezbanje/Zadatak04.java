package nizovi_vezbanje;

import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {
		
		// Napisati program kojim se izracunava i ispisuje proizvod clanova niza x od n 
		// elemenata koji nisu deljivi sa 4
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj clanova niza n : ");
		int n = sc.nextInt();
		
		int x[] = new int [n];
		
		int p = 1;
		System.out.println("Unesite clanove niza :");
		for (int i = 0; i < x.length ; i++)
		{
			System.out.print("x["+i+"] = ");
			x [i]= sc.nextInt();
			if (x[i] % 4 != 0)
			{
				p *= x[i];
			}
		}
		System.out.println("P = "+p);
		sc.close();
	}

}

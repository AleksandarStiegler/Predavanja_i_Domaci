package nizovi_vezbanje;

import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj clanova niza n : ");
		int n = sc.nextInt();
		
		int x[]= new int [n];
		
		System.out.println("Unesite clanove niza : ");
		for (int i = 0 ; i < x.length ; i++)
		{
			System.out.print("x["+i+"] = ");
			x[i] = sc.nextInt();
		}
		
		int p = 1;
		for (int i = 0 ; i < n ; i++)
		{
			if ( x[i] >= 3 && x[i] <= 9)
				p *= x[i];
		}
			System.out.println("P = "+p);
		sc.close();

	}

}

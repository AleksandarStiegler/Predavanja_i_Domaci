package nizovi_2go_predavanje;

import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {
		
		// Sortirati u opadajuci niz
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj clanova niza n : ");
		int n = sc.nextInt();
		
		int x[] = new int [50];
		
		System.out.println("Unesite clanove niza.");
		for (int i = 1 ; i <= n; i++)
		{
			System.out.print("x["+i+"] = ");
			x[i] = sc.nextInt();
		}
		
		System.out.println("\nNesortiran niz : ");
		for (int i = 1 ; i <= n; i++)
		{
			System.out.print(x[i]+" ");
		}
		// Resavanje problema
		int temp;
		for (int i = 1 ; i <= n; i++)
		{
			for (int j = 1 ; j <= n-1 ; j++)
			{
				if ( x[j] < x[j+1] )
				{
					temp = x[j];
					x[j] = x[j+1];
					x[j+1] = temp;
				}
			}
		}
		System.out.println("\nSortiran niz, u opadajucem poretku : ");
		for (int i = 1; i <= n ; i++)
		{
			System.out.print(x[i]+" ");
		}
		sc.close();
	}

}

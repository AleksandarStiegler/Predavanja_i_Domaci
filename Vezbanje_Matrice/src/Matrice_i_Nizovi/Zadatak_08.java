package Matrice_i_Nizovi;

import java.util.Scanner;

public class Zadatak_08 {

	public static void main(String[] args) {

		// Sortiranje niza u rastuci i opadajuci poredak
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj elemenata niza : ");
		int n = sc.nextInt();
		
		int x[] = new int [100];
		
		System.out.println("Unesite elemente niza : ");
		for (int i = 0; i < n; i++)
		{
			System.out.print("x["+i+"] = ");
			x[i] = sc.nextInt();
		}
		
		System.out.println("\nIzgled niza");
		for (int i = 0; i < n; i++)
		{
			System.out.print(x[i]+" ");
			
		}
		
		// Sortiranje niza rastuci poredak
		int temp;
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j <= i-1; j++)
			{
				if (x[i] < x[j])
				{
					temp = x[j];
					x[j] = x[i];
					x[i] = temp;
				}
					
			}
		}
		System.out.println("\nSortiran u rastuci poredak");
		for (int i = 0 ; i < n; i++)
		{
			System.out.print(x[i]+" ");
		} // int temp;
		// Sortiranje niza u opadajuci poredak
				
				for (int i = 0; i < n; i++)
				{
					for (int j = i + 1; j <= n; j++)
					{
						if (x[i] < x[j])
						{
							temp = x[i];
							x[i] = x[j];
							x[j] = temp;
						}
							
					}
				}
				System.out.println("\nSortiran u opadajuci poredak");
				for (int i = 0 ; i < n; i++)
				{
					System.out.print(x[i]+" ");
				}
		
				sc.close();
	}

}

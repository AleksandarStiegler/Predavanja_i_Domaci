package Matrice_i_Nizovi;

import java.util.Scanner;

public class Zadatak_20 {

	public static void matrica(int x[][], int r, int k) {
		for (int i = 0 ; i < r; i++)
		{
			for (int j = 0 ; j < k; j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		// Primer 9 Cas 19 slajd 29
		
		// Zameniti elemente glavne i sporedne dijagonale
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite broj redova matrica : ");
		int r = sc.nextInt();
		System.out.print("Unesite broj kolona matrica : ");
		int k = sc.nextInt();
		
		int a[][] = new int [10][10];
		
		
		System.out.println("Unesite elemente matrice A ");
		for (int i = 0; i < r; i++)
		{
			for (int j = 0 ; j < k; j++)
			{
				System.out.print("a["+i+","+j+"] = ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrica A");
		matrica(a, r, k);
		int temp = 0;
		for (int i = 0 ; i < r; i++)
		{
			
			for (int j = 0; j < k; j++)
			{
				if (i == j)
				{
					temp = a[i][j];
					a[i][j] = a[i][r-i-1];
					a[i][r-i-1] = temp;
				}
			}
		}
		System.out.println("Matrica B");
		matrica(a,r,k);
		sc.close();

	}

}

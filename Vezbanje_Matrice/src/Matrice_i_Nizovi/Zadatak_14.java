package Matrice_i_Nizovi;

import java.util.Scanner;

public class Zadatak_14 {
	static int suma3(int x[][], int r, int k, int s3) {
		for (int i= 0; i < r; i++)
		{
			for (int j = 0; j < k; j++)
			{
				if (x[i][j] > 3)
				{
					s3 += x[i][j];
				}
			}
			
		}
		 return s3;
	}
	static void matrica(int x[][], int r, int k) {
		for (int i = 0; i < r; i++)
		{
			for (int j = 0; j < k; j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		// Ucitati matricu i izracunati sumu svih clanova vecih od 3
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj redova matrice : ");
		int red = sc.nextInt();
		System.out.print("Unesite broj kolona matrice : ");
		int kolona = sc.nextInt();
		
		int x[][] = new int [20][20];
		System.out.println("Unesite elemente matrice.");
		for (int i = 0; i < red; i ++)
		{
			for (int j = 0 ; j < kolona ; j++)
			{
				System.out.print("x["+i+","+j+"] = ");
				x[i][j] = sc.nextInt();
			}
		}

		matrica(x, red, kolona);
		int s3 = 0;
		
		
		System.out.println("Suma elemenata vecih od 3 = "+suma3(x,red,kolona,s3));
		sc.close();
	}

}

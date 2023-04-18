package Matrice_i_Nizovi;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak_17 {
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
	static void rezultat(int a[][], int b[][],double c[][],int r,int k) {
		for (int i = 0; i < r; i++)
		{
			for (int j = 0; j < k; j++)
			{
				if (i < j)
				{
					c[i][j] = a[i][j]*a[i][j] - b[i][j]*b[i][j];
				}
				else if ( i == j)
				{
					c[i][j] = Math.abs(a[i][j]) + Math.abs(b[i][j]) + 1;
				}
				else 
				{
					c[i][j] = Math.sqrt(a[i][j]*a[i][j] + b[i][j]*b[i][j]);
				}
					
			}
		}
	}

	public static void main(String[] args) {
		
		// Zadatak 4  iz knjige
		DecimalFormat df = new DecimalFormat("##0.00");
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite broj redova matrica : ");
		int r = sc.nextInt();
		System.out.print("Unesite broj kolona matrica : ");
		int k = sc.nextInt();
		
		int a[][] = new int [10][10];
		int b[][] = new int [10][10];
		double[][] c = new double [10][10];
		
		System.out.println("Unesite elemente matrice A ");
		for (int i = 0; i < r; i++)
		{
			for (int j = 0 ; j < k; j++)
			{
				System.out.print("a["+i+","+j+"] = ");
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Unesite elemente matrice B ");
		for (int i = 0; i < r; i++)
		{
			for (int j = 0 ; j < k; j++)
			{
				System.out.print("b["+i+","+j+"] = ");
				b[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrica A");
		matrica(a, r, k);
		System.out.println("Matrica B");
		matrica(b, r, k);
		rezultat(a,b,c,r,k);
		System.out.println("Matrica C");
		for (int i = 0 ; i < r; i++)
		{
			for (int j = 0 ; j < k; j++)
			{
				System.out.print(df.format(c[i][j])+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}



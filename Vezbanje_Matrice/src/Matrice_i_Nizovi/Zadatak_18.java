package Matrice_i_Nizovi;

import java.util.Scanner;

public class Zadatak_18 {
	
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
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite broj redova matrica : ");
		int r = sc.nextInt();
		System.out.print("Unesite broj kolona matrica : ");
		int k = sc.nextInt();
		
		int a[][] = new int [r][k];
		
		
		
		for (int i = 0; i < r; i++)
		{
			for (int j = 0 ; j < k; j++)
			{
				if (i==j || i +j == r -1)
				{
					a[i][j] = 1;
				}
				else 
				{
					a[i][j] = 0;
				}
			}
		}
		matrica(a, r, k);
		sc.close();
	}

}

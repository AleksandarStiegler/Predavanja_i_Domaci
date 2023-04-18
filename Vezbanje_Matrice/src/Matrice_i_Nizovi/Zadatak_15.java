package Matrice_i_Nizovi;

import java.util.Scanner;

public class Zadatak_15 {
	
	public static void matrica(int x[][], int r, int k) {
		for (int i = 0 ; i < r; i++)
		{
			for (int j = 0; j < k; j ++ )
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int neg(int x[][], int r, int k){
	 int suma = 0;
	
		for (int i = 0; i < r; i++ )
		{
			for (int j = 0 ; j < k; j++)
			{
				if (x[i][j] < 0 )
					suma += x[i][j];
			}
		}
		return suma;
	}

	public static void main(String[] args) {


		// Naci sumu negativnih elemenata matrice
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj redova matrice : ");
		int red= sc.nextInt();
		System.out.print("Unesite broj kolona matrice : ");
		int kolona = sc.nextInt();
		
		int x[][] = new int [10][10];
		
		System.out.println("Unesite elemente matrice");
		for (int i = 0 ; i < red; i++)
		{
			for (int j = 0 ; j < kolona; j++)
			{
				System.out.print("x["+i+","+j+"] = ");
				x[i][j] = sc.nextInt();
			}
		}
		System.out.println("Matrica");
		matrica(x,red,kolona);
		
		
		System.out.println("Suma negativnih elemenata je "+neg(x, red , kolona));
	sc.close();
	}

}

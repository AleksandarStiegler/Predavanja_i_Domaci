package Matrice_i_Nizovi;

import java.util.Scanner;

public class Zadatak_03 {

	public static void main(String[] args) {
	
		
		// Izracunati sumu elemenata glavne dijagonale matrice i sporedne (posebno)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj redova matrice : ");
		int red = sc.nextInt();
		System.out.print("Unesite broj kolona matrice : ");
		int kolona = sc.nextInt();
		
		int a[][] = new int[red][kolona];
		
		System.out.println("Unesite elemente matrice .");
		for (int i = 0; i < red; i++)
		{
			for (int j = 0 ; j < kolona; j++)
			{
				System.out.print("a["+i+","+j+"] = ");
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Matrica");
		for (int i = 0 ; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		int suma = 0 , sumasp = 0;
		
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona ; j++)
			{
				if (i == j)
					suma += a[i][j];
				if (i + j == red - 1)
					sumasp += a[i][j];
			}
		}
		System.out.println("Suma elemenata glavne dijagonale je "+suma+""
				+ " , a sporedne je "+sumasp);
		sc.close();
	}

}

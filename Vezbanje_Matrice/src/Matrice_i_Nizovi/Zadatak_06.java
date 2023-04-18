package Matrice_i_Nizovi;

import java.util.Scanner;

public class Zadatak_06 {

	public static void main(String[] args) {
		/* Ucitati matricu i uraditi sledece
		 * a) Suma svih elemenata matrice
		 * b) proizvod svih elemenata matrice
		 * c) Ispisati parne elemente matrice
		 * d) Ispisati neparne elemente matrice */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj redova matrice : ");
		int red = sc.nextInt();
		System.out.print("Unesite broj kolona matrice : ");
		int kolona = sc.nextInt();
		
		int a[][] = new int [red][kolona];
		
		System.out.println("Unesite elemente matrice.");
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				System.out.print("a["+i+","+j+"] = ");
				a[i][j] = sc.nextInt();
			}
		}
		 
		System.out.println("Matrica");
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		 
		// Resavanje zadatka u ovom delu cu da uradim a b i c delove a d cu posebno
		
		System.out.println("Parni elementi matrice");
		int suma = 0, pro =1;
		for (int i = 0 ; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				suma += a[i][j];
				pro *= a[i][j];
				if (a[i][j] % 2 == 0)
					System.out.print(a[i][j]+" ");
			}
		}
		System.out.println("\nSuma svih elemenata matrice = "+suma+" , a proizvod = "+pro);
		
		// Ovde cu da uradim pod d
		System.out.println("Neparni elementi matrice");
		
		for (int i = 0 ; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				
				if (a[i][j] % 2 != 0)
					System.out.print(a[i][j]+" ");
			}
		}
		sc.close();
	}

}

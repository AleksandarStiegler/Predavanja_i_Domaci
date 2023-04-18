package Matrice_i_Nizovi;

import java.util.Scanner;

public class Zadatak_16 {
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

	public static void main(String[] args) {
		// Ucitati Matricu, naci:
		/* a) aritmeticku sredinu svih elemenata
		 * b) aritmeticku sredinu pozitivnih elemenata
		 * c) aritmeticku sredinu pozitivnih elemenata na redovima
		 * d) parnih elemenata na kolonama */
		 
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
		
		// Ovde cu kroz isti brojac da prodjem za pozitivne i za sve elemente da skratimo malo
		int suma = 0, poz =0 , p = 0;
		for (int i = 0 ; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				suma += x[i][j];
				if (x[i][j] >= 0)
				{
					p++;
					poz += x[i][j];
				}
			}
		}
		System.out.println("Aritmeticka suma svih elemenata matrice = "+(double)suma / (red*kolona)+"\n"
				+ " , a aritmeticka sredina pozitivnih elemenata = "+(double) poz / p);

		// Aritmeticka sredina pozitivnih elemenata na redovima
		
		for (int i = 0 ; i < red; i++)
		{ int spr = 0, r = 0;
			for (int j = 0; j < kolona; j++)
			{
				
				if (x[i][j] >= 0)
				{
					r++;
					spr += x[i][j];
				}
				
			}
			System.out.println("Aritmeticka suma pozitivnih elemenata "+(i+1)+" reda = "+(double) spr / r);
		}
		// Aritmeticka suma parnih elemenata na kolonama, e sad radi lakseg pracenja
		// obrnucu petlje
		
		for (int j = 0 ; j < kolona; j++)
		{ int spar = 0, z = 0;
			for (int i = 0; i < red; i++)
			{
				
				if (x[i][j] % 2 == 0)
				{
					z++;
					spar += x[i][j];
				}
				
			}
			System.out.println("Aritmeticka suma parnih elemenata "+(j+1)+" kolone = "+(double) spar / z);
		}
		sc.close();
		
	}
}

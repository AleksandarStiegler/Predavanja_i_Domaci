package Dvodimenzionalne_Matrice_1;

import java.util.Scanner;

public class Zadatak08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj redova matrice: ");
		int red = sc.nextInt();
		System.out.print("Unesite broj kolona matrica : ");
		int kolona = sc.nextInt();
		
		int niz[][] = new int [red][kolona];
		System.out.println("Unesite elemente matrice.");
		
		for ( int i = 0; i < red ; i++)
		{
			for (int j = 0 ; j < kolona ; j++)
			{
				System.out.print("a["+i+","+j+"] = ");
				niz[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				System.out.print(niz[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n Elementi na glavnoj dijagonali. ");
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				if ( i == j)
				System.out.print(niz[i][j]+" ");
			}
			
		}
		System.out.println("\n Elementi na sporednoj dijagonali. (desno) ");
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				if ( i + j == red - 1 )
				System.out.print(niz[i][j]+" ");
			}
			
		}
		
	}

}

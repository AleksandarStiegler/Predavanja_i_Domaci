package Dvodimenzionalne_Matrice_1;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	/*	System.out.print("Unesite broj redova matrice: ");
		int red = sc.nextInt();
		System.out.print("Unesite broj kolona matrica : ");
		int kolona = sc.nextInt(); */
		
		int red = 5;
		int kolona = 5;
		
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
		System.out.println("Matrica");
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				System.out.print(niz[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Glavna dijagonala i trougao ispod.");
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				if(i==j || i > j-1)
				System.out.print(niz[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}

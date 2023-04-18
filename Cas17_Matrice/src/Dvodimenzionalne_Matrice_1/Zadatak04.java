package Dvodimenzionalne_Matrice_1;

import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj redova : ");
		int red = sc.nextInt();
		System.out.print("Unesite broj kolona : ");
		int kolona = sc.nextInt();
		
		int niz[][] = new int [red][kolona];
		
		System.out.println("Unesite elemente matrice.");
		for(int i = 0 ; i < red ; i++)
		{
			for (int j = 0; j < kolona ; j++)
			{
				System.out.print("a["+i+","+j+"] = ");
				niz[i][j] = sc.nextInt();
			}
			
		}
		sc.close();
		System.out.println("Matrica.");
		for(int i = 0; i < red; i++)
		{
			for(int j = 0; j < kolona; j++)
			{
				
					System.out.print(niz[i][j]+" ");
			}
			System.out.println();
		}
/*		
		System.out.println("Elementi sa parnim indexom redova.");
		for(int i = 0; i < red; i++)
		{
			for(int j = 0; j < kolona; j++)
			{
				if (i % 2 != 0) // ili if ((i+1) % 2 == 0)
					System.out.print(niz[i][j]+" ");
			}
		} */
		
		System.out.println("\nElementi sa neparnim indexom kolona.");
		for(int i = 0; i < red; i++)
		{
			for(int j = 0; j < kolona; j++)
			{
				if (j % 2 == 0)
					System.out.print(niz[i][j]+" ");
			}
			
		}
		
		/*
		System.out.println("\nElementi sa parnim indexom kolona.");
		for(int i = 0; i < red; i++)
		{
			for(int j = 0; j < kolona; j++)
			{
				if ((j + 1)  % 2 != 0)
					System.out.print(niz[i][j]+" ");
			}
		}
		
		
		
		
		System.out.println("\nElementi sa neparnim indexom redova.");
		for(int i = 0; i < red; i++)
		{
			for(int j = 0; j < kolona; j++)
			{
				if (i % 2 == 0)
					System.out.print(niz[i][j]+" ");
			}
		}
		System.out.println("\nElementi sa parnim indexom redova i kolona.");
		for(int i = 0; i < red; i++)
		{
			for(int j = 0; j < kolona; j++)
			{
				if (i % 2 != 0 && j % 2 != 0)
					System.out.print(niz[i][j]+" ");
			}
		} */
		
	}

}

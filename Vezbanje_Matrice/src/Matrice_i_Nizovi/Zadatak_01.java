package Matrice_i_Nizovi;

import java.util.Scanner;

public class Zadatak_01 {

	public static void main(String[] args) {
		
		// Sabrati i oduzeti 2 matrice
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite koliko redova imaju matrice .");
		int red = sc.nextInt();
		System.out.println("Unesite koliko kolona imaju matrice .");
		int kolona = sc.nextInt();
		
		// Formiranje matrica
		
		int a[][] = new int [red][kolona];
		int b[][] = new int [red][kolona];
		int zbir[][] = new int [red][kolona];
		int raz [][] = new int [red][kolona];
		
		System.out.println("Unesite elemente matrice a : ");
		
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				System.out.print("a["+i+j+"] = ");
				a[i][j] = sc.nextInt();
			}
		
		}
		System.out.println("Unesite elemente matrice b : ");
		
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				System.out.print("b["+i+j+"] = ");
				b[i][j] = sc.nextInt();
			}
		
		}
		// Prikaz matrica
		
		System.out.println("Matrica a");
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Matrica b");
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		// Resavanje problema
		
		// Zbir I razlika Matrica
		
		for (int i = 0; i < red; i++ )
		{
			for (int j = 0 ; j < kolona; j++)
			{
				zbir[i][j] = a[i][j] + b[i][j];
				raz[i][j] = a[i][j] - b[i][j];
			}
		}
		// Prikaz rezultujucih matrica
		
		System.out.println("Zbir matrica");
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				System.out.print(zbir[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Razlika matrica");
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				System.out.print(raz[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}

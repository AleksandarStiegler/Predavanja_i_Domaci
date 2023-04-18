package Matrice_i_Nizovi;

import java.util.Scanner;

public class Zadatak_11 {

	public static void main(String[] args) {
		
		// Ucitati matricu i ispisati sve elemente na glavnoj dijagonali i ispod
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj redova matrice : ");
		int red = sc.nextInt();
		System.out.print("Unesite broj kolona matrice : ");
		int kolona = sc.nextInt();
		
		int x[][] = new int [red][kolona];
		
		System.out.println("Unesite elemente matrice.");
		for(int i = 0; i < red; i++)
		{
			for (int j = 0 ; j < kolona; j++)
			{
				System.out.print("x["+i+","+j+"] = ");
				x[i][j] = sc.nextInt();
			}
		}
			
		System.out.println("Matrica");
		for (int i = 0 ; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		
	/*	System.out.println("Glavna dijagonala i ispod.");
		for (int i = 0 ; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				if(i >= j) {
				System.out.print(x[i][j]+" ");}
				else {
				x[i][j] = 0;
				System.out.print(x[i][j]+" ");}
					
			}
			System.out.println();
		} */
	/*	System.out.println("Glavna dijagonala i iznad");
		for (int i = 0 ; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				if(i <= j ) {
				System.out.print(x[i][j]+" ");}
				else {
				x[i][j] = 0;
				System.out.print(x[i][j]+" ");}
					
			}
			System.out.println();
		} */
		// Aj sad da vidimo za sporedne dijagonale
	/*	System.out.println("Sporedna dijagonala i iznad");
		for (int i = 0 ; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				if(i + j <= red -1) {
				System.out.print(x[i][j]+" ");}
				else {
				x[i][j] = 0;
				System.out.print(x[i][j]+" ");}
					
			}
			System.out.println();
		} */
		System.out.println();
		// Ajmo kombinacija hocu samo gornji trougao izmedju glavne i sporedne dijagonale
	/*	for (int i = 0 ; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				if(i <= j && i + j <= red -1) {
				System.out.print(x[i][j]+" ");}
				else {
				x[i][j] = 0;
				System.out.print(x[i][j]+" ");}
					
			}
			System.out.println();
		} */
		// Ajmo kombinacija desni trougao izmedju glavne i sporedne dijagonale
		
		for (int i = 0 ; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				if(i <= j && i + j >= red-1) {
				System.out.print(x[i][j]+" ");}
				else {
				x[i][j] = 0;
				System.out.print(x[i][j]+" ");}
					
			}
			System.out.println();
		}
		sc.close();
	}
}

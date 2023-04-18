package Dvodimenzionalne_Matrice_1;

import java.util.Scanner;

public class Zadatak15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj redova : ");
		int red = sc.nextInt();
		System.out.print("Unesite broj kolona : ");
		int kolona = sc.nextInt();
		
		int x[][] = new int [red][kolona];
		
		System.out.println("Unesite elemente matrice.");
		
		for (int i =0 ; i < red; i++)
		{
			for (int j = 0 ; j < kolona; j++)
			{
				System.out.print("a["+i+","+j+"] = ");
				x[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("Matrica");
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		int suma = 0;
		System.out.println("Suma negativnih elemenata");
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				if (x[i][j] < 0)
				suma += x[i][j];
			}
			
		}
		System.out.println(suma);
		sc.close();
	}

}

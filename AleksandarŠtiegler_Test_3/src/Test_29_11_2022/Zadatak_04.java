package Test_29_11_2022;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak_04 {

	public static void main(String[] args) {

		// Unos podataka

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.##");
		
		System.out.print("Unesite broj redova i kolona matrica A i B: ");
		int red = sc.nextInt();
				
		
		
		int a[][] = new int[red][red];
		int b[][] = new int[red][red];
		double c[][] = new double[red][red];
		
		System.out.println("Unesite elemente matrice A : ");
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < red; j++)
			{
				System.out.print("a["+i+","+j+"] = ");
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nUnesite elemente matrice B : ");
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < red; j++)
			{
				System.out.print("b["+i+","+j+"] = ");
				b[i][j] = sc.nextInt();
			}
		}
		
		// stampanje formiranih matrica
		
		System.out.println("Matrica A ");
		for (int i = 0 ; i < red; i ++ )
		{
			for (int j = 0; j < red; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Matrica B ");
		for (int i = 0 ; i < red; i ++ )
		{
			for (int j = 0; j < red; j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		// Racunanje rezultujuce matrice
		for (int i = 0 ; i < red; i ++ )
		{
			for (int j = 0; j < red; j++)
			{
				if ( i < j)
				{
					c[i][j] = a[i][j] * a[i][j] - b[i][j] * b[i][j];
				}
				else if ( i == j)
				{
					c[i][j] = Math.abs(a[i][j]) + Math.abs(b[i][j]) + 1;
				}
				else 
				{
					c[i][j] =  Math.sqrt(Math.pow(a[i][j], 2) + Math.pow(b[i][j], 2));
				}
			}
		
		}
		// Stampanje rezultujuce matrice C
		System.out.println("Matrica C ");
		for (int i = 0 ; i < red; i ++ )
		{
			for (int j = 0; j < red; j++)
			{
				System.out.print(df.format(c[i][j])+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}

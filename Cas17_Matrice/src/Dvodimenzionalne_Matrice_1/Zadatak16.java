package Dvodimenzionalne_Matrice_1;

import java.util.Scanner;

public class Zadatak16 {

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
		sc.close();
		System.out.println("Matrica");
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	/*	int sumaars = 0,  ar = 0;
		int sumaarpoz = 0, poz = 0;
		
		c) aritmetičku sredinu pozitivnih elemenata na redovima

		d) aritmetičku sredinu parnih elemenata na kolonama 
		
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				sumaars += x[i][j];
				ar ++;
				if ( x[i][j] % 2 == 0)
				{
					sumaarpoz += x[i][j];
					poz++;
				}
				
			}
			
		} 
		
		System.out.println("Aritmeticka sredina "+(double) sumaars / ar+" \nAritmeticka sredina pozitivnih brojeva "+(double)sumaarpoz / poz );
		*/
		for (int i = 0; i < red; i ++)
		{
			int sumared=0; 
			for (int j=0 ; j< kolona; j++)
			{
				if(x[i][j] > 0)
				{
				sumared+= x[i][j];
				}
				
				
			}
			System.out.println("Ar.sred. "+(i+1)+" reda iznosi "+ (double) sumared / kolona); // tako je, palo mi napamet dok sam pustao ali ne i dok sam radio zadatak
			
			
		}
	}
}
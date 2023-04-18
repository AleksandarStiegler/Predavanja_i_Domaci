package Dvodimenzionalne_Matrice_1;

import java.util.Scanner;

public class Zadatak12 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj redova matrice: ");
		int red = sc.nextInt();
		System.out.print("Unesite broj kolona matrica : ");
		int kolona = sc.nextInt();
		
		if ( red <=0 || kolona <= 0)
			System.out.println("Unesite ponovo."); 
		else
		{
		
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
		System.out.println("Suma Kvadrata");
		int suma = 0;
		int sumad= 0;
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				suma += niz[i][j]*niz[i][j];
				if (i == j)
				{
					sumad += niz[i][j]*niz[i][j]; 
					
					
				}
			}
			
		}
		System.out.println(suma+"\t"+sumad);
		
		}


	}

}

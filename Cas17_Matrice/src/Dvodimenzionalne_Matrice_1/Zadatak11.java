package Dvodimenzionalne_Matrice_1;

//import java.util.Scanner;

public class Zadatak11 {

	public static void main(String[] args) {

	//Scanner sc = new Scanner(System.in);
			
		int red = 5;
		int kolona = 5;
		
		int niz[][] = {  {1,1,1,1,1}, {1,1,1,1,1}, {1,1,1,1,1}, {1,1,1,1,1}, {1,1,1,1,1} };
		
		
	
		System.out.println("Matrica");
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				System.out.print(niz[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Glavna dijagonala i trougao iznad.");
		for (int i = 0; i < red; i++)
		{
			for (int j = 4; j  >= i; j--)
		
				System.out.print(niz[i][j]+" ");
			
			System.out.println();
		}
		


	}

}

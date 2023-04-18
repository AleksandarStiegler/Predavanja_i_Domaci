package Matrice_i_Nizovi;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak_02 {

	public static void main(String[] args) throws Exception {
		// Transponovati matricu
		
		
		BufferedReader bfr = new BufferedReader( new InputStreamReader(System.in));
		
		System.out.println("Unesite broj redova matrice");
		int red = Integer.parseInt(bfr.readLine());
		System.out.println("Unesite broj kolona matrice");
		int kolona = Integer.parseInt(bfr.readLine());
		
		int a[][] = new int [red][kolona];
		
		System.out.println("Unesite elemente Matrice");
		
		for (int i = 0 ; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				System.out.print("a["+i+","+j+"] = ");
				a[i][j] = Integer.parseInt(bfr.readLine());
			}
		}
		
		//Prikaz Matrice
		for (int i = 0; i < red; i++)
		{
			for (int j = 0; j < kolona; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		// Transponovana Matrica
		System.out.println("Transponovana Matrica");
		for (int i = 0; i < kolona; i++)
		{
			for (int j = 0; j < red; j++)
			{
				System.out.print(a[j][i]);
			}
			System.out.println();
		}
	
	// Ovo je nacin na koji sam dosao sam, a sada da primenimo i profesorovu metodu
		int at[][] = new int[kolona][red];
		for (int i = 0; i < red; i++)
		{
			for (int j = 0 ; j < kolona; j++)
			{
				at[j][i] = a[i][j];
			}
		}
		// Ako je potrebno samo prikazati transponovanu matricu moje resenje radi
		// i mnogo je krace. Ali ako nam je transponovana matrica potrebna za nesto
		// onda moramo da uvedemo novu matricu.
		System.out.println("Transponovana Matrica II");
		for (int i = 0; i < kolona; i++)
		{
			for (int j = 0; j < red; j++)
			{
				System.out.print(at[i][j]);
			}
			System.out.println();
		}
	}
}
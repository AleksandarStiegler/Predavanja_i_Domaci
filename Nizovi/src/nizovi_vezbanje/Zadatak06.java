package nizovi_vezbanje;

import java.util.Scanner;

public class Zadatak06 {

	public static void main(String[] args) {
		
		// Napisati program kojim se ispisuje proizvod cifara clanova niza x od n elemenata.
		// Zatim sumirati dobijene proizvode i naci aritmeticku sredinu
		
		// asr - aritmeticka sredina suma/n
		
		int suma = 0, proizvod, temp, cifra;
		double asr;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj clanova niza n : ");
		int n = sc.nextInt();
		
		int x[] = new int [n];
		
		System.out.println("Unesite clan niza : ");
		for (int i = 0 ; i < x.length; i++)
		{
			proizvod = 1;
			System.out.print("x["+i+"] = ");
			x[i] = sc.nextInt();
			temp = x[i];
			while (temp != 0)
			{
				cifra = temp % 10;
				proizvod *= cifra;
				temp /= 10;
				
			}
			suma += proizvod;
			System.out.println("Proizvod cifara clana iznosi :"+proizvod);
		}
		asr = (double) suma / n ;
		System.out.println("Suma niza = "+suma+" , a aritmeticka sredina = "+asr);
		sc.close();

	}

}

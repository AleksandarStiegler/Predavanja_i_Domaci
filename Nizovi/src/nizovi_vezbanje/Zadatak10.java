package nizovi_vezbanje;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
		
		/* Napisati program kojim se odredjuje maksimalni i minimalni elementi u kao i njihovi
		 * polozaji u celobrojnom vektoru x od n elemenata */
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj elemenata niza n : ");
		int n = sc.nextInt();
		
		int []x = new int[100];
		
		System.out.println("Unesite clanove niza .");
		for (int i = 1 ; i <= n; i++)
		{
			System.out.print("x["+i+"] = ");
			x[i] = sc.nextInt();
		}
		sc.close();
		
		int max , min, k = 1, l = 1;
		max = x[1];
		min = x[1];
		
		
		for (int i = 2 ; i <= n ; i++ )
		{
			if (x[i] > max)
			{
				max = x[i];
				k = i;
			}
			if	(min > x[i])
			{
				min = x[i];
				l = i;
			}
		}
		
		System.out.println("Najveci element niza je "+max+" , njegova pozicija u nizu "+k+" mesto.\n"
				+ "a najmanji element je "+min+" , dok je njegova pozicija "+l+" mesto.");

	}

}

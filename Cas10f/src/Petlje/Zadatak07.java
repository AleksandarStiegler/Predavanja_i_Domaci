package Petlje;

import java.util.Scanner;

public class Zadatak07 {

	public static void main(String[] args) {
		// Napisati program kojim se za zadate vrednosti m i n
		// izracunava  S=n*(n+m)*(n+2m)*...(n+mm)
		
		Scanner sc = new Scanner(System.in);
		int n, m;
		System.out.print("Unesite prvi broj :");
		n = sc.nextInt();
		System.out.print("Unesite drugi broj :");
		m = sc.nextInt();
		sc.close();
		int S = n;
		for (int i = 1; i<=m; i++)
		{
			S = S*(n+i*m);
		}
		System.out.println(S);
	}

}

    	
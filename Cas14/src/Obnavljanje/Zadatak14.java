package Obnavljanje;

import java.util.Scanner;

public class Zadatak14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Unesite neki broj ");
		int a = sc.nextInt();
		
		int suma = 0, i = 0;
		while (a > 10 && a < 30)
		{
			suma += a;
			i++;
			System.out.println(" Unesite neki broj ");
			 a = sc.nextInt();
		}
		double ars = (double) suma / i;
		System.out.println("Aritmeticka sredina unesenih brojeva je "+ars);
		sc.close();

	}

}

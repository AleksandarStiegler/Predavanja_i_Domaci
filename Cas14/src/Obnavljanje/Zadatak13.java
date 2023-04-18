package Obnavljanje;

import java.util.Scanner;

public class Zadatak13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Unesite neku vrednost za a");
		int a = sc.nextInt();
		int suma = 0;
		
		while ( a != 5)
			{
			if ( a % 2 ==0 || a % 7 == 0)
				suma += a;
			System.out.println(" Unesite neku vrednost za a");
			 a = sc.nextInt();
			}
		System.out.println("Zbir ucitanih brojeva koji su deljivi sa 2 ili 7 je "+suma);
	sc.close();
	}
	

}

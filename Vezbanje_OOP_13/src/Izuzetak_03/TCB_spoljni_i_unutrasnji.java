package Izuzetak_03;

import java.io.IOException;
import java.util.Scanner;

public class TCB_spoljni_i_unutrasnji {

	public static void main(String[] args) {
		
		// Unutrasnji i spoljasnji try catch blok
		
		Scanner sc = new Scanner(System.in);
		
		int a [] = new int [3];
		
		int b,c;
		try {
			System.out.println("Unesite promenljivu b");
			b = sc.nextInt();
			System.out.println("Unesite promenljivu c");
			c = sc.nextInt();
			int d  = b * c / (b * c * (b - c - 2));
			try {
				System.out.println("Unesite broj clanova niza");
				int n = sc.nextInt();
				for (int i = 0; i < n; i++) {
				System.out.print("a["+i+"] = ");
				a[i] = sc.nextInt();}
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Uhvacen izuzetak duzina niza "+e);}
		
		}catch(ArithmeticException e) {
			System.out.println("Uhvacen izuzetak "+e);
		
		}
			

	}

}

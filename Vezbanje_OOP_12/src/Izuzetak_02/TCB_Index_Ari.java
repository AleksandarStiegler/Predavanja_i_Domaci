package Izuzetak_02;

import java.util.Scanner;

public class TCB_Index_Ari {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a [] = new int [3];
		int k, d;
		
		try {
			System.out.println("Unesite broj clanova niza : ");
			int n = sc.nextInt();
			System.out.println("Unesite promenljive k i x");
			k = sc.nextInt();
			d = sc.nextInt();
			
			double z = 1/k * (3-k)/((d - k)*d);
			for (int i = 0; i < n; i++) {
				System.out.print("a["+i+"] = ");
				a[i] = sc.nextInt();
			}
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e  ) {
			System.out.println("Uhvacen izuzetak "+e.getMessage());
		
		}

	}

}

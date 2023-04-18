package Zadatak_06;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		// Naci proizvod
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.00##");
		
		System.out.print("Unesite broj n : ");
		int n = sc.nextInt();
		double p = 1.0;
		
		for (int i = 1 ; i <= n ; i++) {
			p *= ( 1 - 1./(i+1));
		}
		System.out.println("Vrednost izraza do broja "+n+" iznosi "+df.format(p));
		sc.close();
	}

}

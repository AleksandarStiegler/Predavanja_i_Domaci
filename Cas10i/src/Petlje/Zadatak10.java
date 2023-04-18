package Petlje;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// u zadatom intervalu ispisati sve brojeve deljive sa 3

		Scanner sc = new Scanner(System.in);
		
		int x, y;
		System.out.println("Unesite prvi broj");
		x = sc.nextInt();
		System.out.println("Unesite drugi broj");
		y = sc.nextInt();
		sc.close();
		for (int i = x; i<=y; i++)
		{
			if (i%3==0)
			
				System.out.println(i);
		
		}
	}

}


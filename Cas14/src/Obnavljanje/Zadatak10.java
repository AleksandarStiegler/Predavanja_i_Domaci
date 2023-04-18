package Obnavljanje;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		double n , suma = 0.0;
		
		System.out.println("Unesite n ");
		n = sc.nextDouble();
		
		double i = 1 ;
		
		while ( i <= n )
		{
			suma += Math.pow(-1,1 + i) * i / ( i + 1);
			// lakse znak = - znak  suma += znak * i / ( i + 1 );
			// lakse za program
			i++;
		}
		System.out.println("suma s = "+suma);
		sc.close();
	}

}

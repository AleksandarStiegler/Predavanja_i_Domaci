package jbg;

import java.util.Scanner;

public class MatricaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Broj redova");
		int red = sc.nextInt();
		System.out.println("Broj kolona");
		int kol = sc.nextInt();
		double c [][] = new double[10][10];
		Matrica A[][] =  new Matrica [red][kol];
		for (int i = 0; i < red; i++) {
			for (int j = 0; j < kol; j ++) {
				System.out.print("a["+i+","+j+"] = ");
				
				 c[i][j] = sc.nextDouble();
				 
				
			}
		}
		A.prikaz(red, kol, c[red][kol]);
		
	}

}

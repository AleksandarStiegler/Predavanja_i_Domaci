package Matrica;

import java.util.Scanner;

public class Matr_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite broj redova matrice : ");
		int x = sc.nextInt();
		System.out.print("Unesite broj kolona matrice : ");
		int y = sc.nextInt();

		Matr A = new Matr(x, y);
		Matr B = new Matr(y);

		System.out.println("Matrica A");
		A.ispis(A);
		System.out.println("Matrica B");
		B.toString();
		
		System.out.println();

		A.setEl(2, 0, 1.8);
		A.ispis(A);
		System.out.println();
		System.out.println(A.getEl(2, 0));
		System.out.println();
		System.out.println(B.getEl(1, 1));
	}

}

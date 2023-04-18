package WhileIForPetlja;

import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, y;
		System.out.println("Unesite vrednost za n: ");
		int n = input.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Unesite vrednost broja a: ");
			a = input.nextDouble();
			if (a > 0)
				y = Math.sqrt(a);
			else
				y = Math.pow(a, 2);
			System.out.println("Y je = " + y);
		}
		input.close();
	}
}

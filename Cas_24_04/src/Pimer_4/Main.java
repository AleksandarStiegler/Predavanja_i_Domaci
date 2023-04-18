package Pimer_4;

import java.util.Scanner;

public class Main {

	public static int kolicnik(int a, int b) {
		return a / b;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite brojilac : ");
		int a = sc.nextInt();
		System.out.print("Unesite imenilac : ");
		int b = sc.nextInt();
		sc.close();

		try {
			int rez = kolicnik(a, b);
			System.out.println("Kolicnik iznosi " + rez);

		} catch (ArithmeticException e) {
			System.out.println("Izuzetak " + e);
		}

	}

}

package Obnavljanje;

import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {

		//

		Scanner sc = new Scanner(System.in);
		double n, suma = 0.0;
		System.out.println("Unesite broj n do kojec ce se racunati suma :");
		n = sc.nextDouble();

		double i = 1.0;
		do {
			suma += i / (1 + i);
			i++;
		} while (i <= n);
		System.out.println("vrednost sume je " + suma);
	sc.close();
	}

}

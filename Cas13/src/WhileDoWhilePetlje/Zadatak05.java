package WhileDoWhilePetlje;

import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {

		// Napisati program za ispisivanje sume brojeva od k do zadatog broja n

		Scanner sc = new Scanner(System.in);
		int i, k, n, suma = 0;
		System.out.println("Unesite broje od kojeg suma pocinje");
		k = sc.nextInt();
		System.out.println("Unesite krajnji broj n ");
		n = sc.nextInt();

		i = k;
		while (i <= n) {
			suma += i;
			i++;
		}
		System.out.println("Od " + k + " do " + n + " suma = " + suma);

		sc.close();
	}

}

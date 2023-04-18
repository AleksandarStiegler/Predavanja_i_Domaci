package GeometrijskoTelo;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite koliko kocki zelite da izracunate");
		int n = sc.nextInt();

		Kocka K[] = new Kocka[n];

		for (int i = 0; i < n; i++) {
			try {
				System.out.println("Unesite stranicu " + i + " kocke");
				double a = sc.nextDouble();
				K[i] = new Kocka(a);
			} catch (Exception e) {
				System.out.println("Desila se greska " + e.getMessage());
			}
		}

		for (int i = 0; i < n; i++) {
			try {

				System.out.println("Povrsina kocke " + i + " : " + K[i].izracunajPovrsinu() + "\nZapremina kocke " + i
						+ " : " + K[i].izracunajZapreminu());
			} catch (Exception e) {

			}

		}
		sc.close();
	}
}

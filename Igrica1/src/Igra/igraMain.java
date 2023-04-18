package Igra;

import java.util.Random;

public class igraMain {

	public static void main(String[] args) throws Exception {

		Random rand = new Random();
		int i = rand.nextInt(9);

		poziv a = new poziv();

		int broj;
		broj = a.unosBroja();
		int k = 0;
		do {

			if (i > broj) {
				System.out.println("Uneli ste manji broj");

				broj = a.unosBroja();
				k++;
			} else {
				System.out.println("Uneli ste veci broj");
				broj = a.unosBroja();
				k++;
			}
		} while (i != broj);
		System.out.println("Pronasli ste broj iz " + (k+1) + " puta.");

	}

}

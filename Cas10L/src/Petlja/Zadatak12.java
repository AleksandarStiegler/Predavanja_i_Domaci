package Petlja;

public class Zadatak12 {

	public static void main(String[] args) {

		// Napisati program koji prebrojava brojeve od 1 do 20 brojem 3

		int k = 0;
		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 0)
				k++;
		}

		System.out.println(k);

	}
}

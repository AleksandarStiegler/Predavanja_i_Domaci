package Petlja;

import java.util.Scanner;

public class Zadatak11 {

	public static void main(String[] args) {

		// napisati program kojim se stampaju Amstrongovi brojevi
		// Broj je Armstrongov ako je jednak zbiru kubova svojih cifara

		int s, d, j;

		for (int x = 100; x < 1000; x++) {
			s = x / 100;
			d = (x % 100) / 10;
			j = x % 10;
			if (x == (s * s * s + d * d * d + j * j * j))

				System.out.println("Broj " + x + " je Armstrongov");

		}

	}

}

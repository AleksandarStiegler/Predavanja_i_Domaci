package Zadatak_02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {

		// Trocifren broj
		// proizvod cifara
		// suma kubova cifara
		// obrnuto napisan broj

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Unesite trocifren broj : ");
		int x = Integer.parseInt(bfr.readLine());

		while (x < 100 || x > 999) {
			System.out.println("Nije trocifren broj unesite ponovo : ");
			x = Integer.parseInt(bfr.readLine());
		}

		// Resavanje i stampanje rezultata
		int s, d, j;

		s = x / 100;
		d = (x % 100) / 10;
		j = x % 10;

		System.out.println("Proizvod cifara = " + (s * d * j));
		System.out.println("Suma kubova cifara = " + (Math.pow(s, 3) + Math.pow(d, 3) + Math.pow(j, 3)));
		System.out.println("Obrnuto napisan broj = " + (j * 100 + d * 10 + s));

	}

}

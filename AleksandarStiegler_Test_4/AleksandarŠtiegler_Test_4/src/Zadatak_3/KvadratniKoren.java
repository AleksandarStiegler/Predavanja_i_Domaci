package Zadatak_3;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class KvadratniKoren {

	public static void main(String[] args) throws Exception {

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

		DecimalFormat df = new DecimalFormat("##0.0##");

		System.out.println("Unesite broj.");
		double a = Double.parseDouble(bfr.readLine());

		if (a >= 0) {
			System.out.println("Provera broja : " + a);
			System.out.println("Kvadratni koren broja " + a + " iznosi " + Math.sqrt(a));
		} else {

			System.out.println("Provera broja : " + a);
			throw new Izuzetak("Izuzetak : Kvadratni koren broja " + a + " ne moze se izracunati.");
		}

	}
}
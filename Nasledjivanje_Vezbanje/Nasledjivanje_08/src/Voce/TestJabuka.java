package Voce;

import java.util.Scanner;

public class TestJabuka {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Jabuka j = new Jabuka("Jabuka", "Zelena", 55.7,	 2500, "Delišes");

		System.out.println("Unesite kolicinu jabuka koju zelite da kupite");
		double k = sc.nextDouble();
		System.out.println("Potreno je da platite "+j.izracunajUplatu(k));
sc.close();
	}

}

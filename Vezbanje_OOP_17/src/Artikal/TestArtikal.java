package Artikal;

import java.io.*;
import Izuzetak.*;

public class TestArtikal {

	public static void main(String[] args) throws Exception {

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite naziv artikla");
		String naziv = bfr.readLine();
		System.out.println("Unesite naziv proizvodjaca");
		String proizvodjac = bfr.readLine();
		System.out.println("Unesite barkod");
		String barkod = bfr.readLine();
		System.out.println("Unesite cenu");
		double cena = Double.parseDouble(bfr.readLine());

		Artikal A = new Artikal();

		try {
			A.setNaziv(naziv);
			A.setProizvodjac(proizvodjac);
			A.setBarCode(barkod);
			A.setCena(cena);
			System.out.println(A.toString());

		} catch (IzuzetakArtikal e) {
			System.out.println("Greska : " + e.getMessage());
		}

	}

}

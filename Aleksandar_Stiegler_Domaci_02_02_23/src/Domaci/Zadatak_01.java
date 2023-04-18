package Domaci;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak_01 {

	public static void main(String[] args) throws Exception {

		// Napisati program koji pretvarabinarniu dekadni broj

		// posto je binarni broj u osnovi sastavljen od 0 i 1 i za osnovu ima 2
		// kako bismo pretvorili taj broj u dekadni potrebno je da binarni broj
		// rasclanimo
		// i da svaku 1 ili 0 pomnozimo sa 2 na odgovarajuci stepen

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite broj u binarnom obliku");

		int binbroj = Integer.parseInt(bfr.readLine());
		int broj = 0;
		int temp = 0;
		int i = 0;
		while (binbroj != 0) {
			// da odvojimo poslednju cifru pa da krenemo odatle
			temp = binbroj % 10;
			if (temp == 1 || temp == 0) {
				broj += temp * Math.pow(2, i);
			}

			else {
				System.out.println("Pogresan unos mozete uneti samo 0-e ili 1-ce!");
				break;
			}

			binbroj = binbroj / 10;
			i++;
		}

		System.out.println("Unesen broj je " + broj);
		
	}

}

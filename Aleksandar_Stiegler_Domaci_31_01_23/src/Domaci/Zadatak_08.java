package Domaci;

import java.util.Scanner;

public class Zadatak_08 {
	
	public static int suma (int broj) {
		if( broj < 10) {
			return broj; // Ukoliko imamo manje od 10 imamo samo jednu cifru i ta cifra je suma
		}else {
			int cifra = broj % 10; // Izdvajamo poslednju cifru broja
			return cifra + suma(broj / 10); // Uzimamo dobijenu cifru i pozivamo ponovo metodu
											// ali sad vracamo broj / 10 kao parametar
											// dok ne dodjemo ispod 10 gde ce nam samo
											// dodati tu poslednju cifru na  zbir
											
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj");
		int n = sc.nextInt();
		sc.close();
		System.out.println("Suma cifara unetog broja iznosi "+suma(n));
		
		
	}

}

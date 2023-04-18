package Zadatak_05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AL_Brojevi {

	Scanner sc = new Scanner(System.in);

	List<Integer> brojevi = new ArrayList<Integer>();

	void unosBrojeva() {
		System.out.println("Za prekid unosenja unesite -1 : ");
		while (true) {
			System.out.print("Unesite broj : ");
			int num = sc.nextInt();
			if (num == -1) {
				return;
			}

			// smestanje ucitanih vrednosti sa konzole u kolekciju
			this.brojevi.add(num);
		}

	}

	void ispis() {
		System.out.println(this.brojevi);
	}


}

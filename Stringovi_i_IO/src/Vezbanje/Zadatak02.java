package Vezbanje;

import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// mislim da nije pametno posto solidna brzina kucanja
		
	System.out.println("Unesite koliko brojeva posmatramo ");
	int n = sc.nextInt();
	
	// sad cemo da prodjemo kroz petlju n puta
	int zbir = 0;
	System.out.println("Unesite brojeve ");
	for (int i =1; i <= n ; i ++) {
		try {
		int a = sc.nextInt();  // negativne i neparne?
		
		if (a < 0 && a%2 != 0) {
			zbir += a; // neispravan unos , pogresan tip ?
			
		}
		}
		catch (Exception e) {
			System.out.println("Greska neispravan unos");
			return;// da idem ovako ili da idem preko if else grane
		}
	}
	System.out.println("Vrednost : "+ zbir);
		
	sc.close();
	}

}

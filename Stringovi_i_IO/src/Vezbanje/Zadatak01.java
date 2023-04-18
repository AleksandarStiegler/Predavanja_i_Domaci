package Vezbanje;

import java.util.Scanner;

public class Zadatak01 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// radno vreme od 9 do 17
		
		System.out.println("Unesite sate, opseg od 0 do 23 ");
		int s = sc.nextInt();
		System.out.println("Unesite minute , opseg od 0 do 59");
		
		int m = sc.nextInt();
		if (s < 0 || s > 23 || m < 0 || m >59) {
			System.out.println("Pogresan unos");
		}
		else {
		
		int vreme = s*60 + m;
		
		if ( vreme >= 9*60 && vreme <= 17*60) {
			System.out.println("Mail je poslat u toku radnog vremena");
		}
		else {
			System.out.println("Mail nije poslat u okviru radnog vremena");
		}
		sc.close();
		}
	}

}

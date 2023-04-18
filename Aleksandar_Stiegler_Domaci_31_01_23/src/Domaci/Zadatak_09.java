package Domaci;

import java.util.Scanner;

public class Zadatak_09 {

	public static void main(String[] args) {
		// Napisati program koji prebrojava “space” simbole.
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite neku recenicu");
		String s = sc.nextLine();
		sc.close();
		
		int brojac = 0;
		for (int i = 0; i < s.length() ; i++) {
			if (s.charAt(i) == ' '){
				brojac ++;
			}
		}
		System.out.println("Broj praznih (space) polja u unetoj recenici iznosi : "+brojac);

	}

}

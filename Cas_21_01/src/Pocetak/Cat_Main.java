package Pocetak;

import java.util.Scanner;

public class Cat_Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Cat cat = new Cat();
		
		System.out.println("Unesite ime macke : ");
		
		cat.ime = sc.nextLine();
		
		cat.prikazatiIme();
	}

}

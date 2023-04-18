package Proizvod;

import java.util.Scanner;

public class TestPP {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Unesite naziv proizvoda");
		String pr = sc.nextLine();
		System.out.println("Unesite vrstu");
		String vr = sc.nextLine();
		System.out.println("Unesite proizvodjaca");
		String proizv = sc.nextLine();
		System.out.println("Unesite rok trajanja");
		String rt = sc.nextLine();		
		System.out.println("Unesite cenu");
		double c = sc.nextDouble();
		
		PrehrambeniProzivod PP = new PrehrambeniProzivod(pr, proizv, c, rt);
		
		PP.ispisi();
		sc.close();
	}

}

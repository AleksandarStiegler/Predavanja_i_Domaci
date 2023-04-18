package Primer;

import java.util.Scanner;

public class KnjigaGlavni {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Ime knjige ");
		String n = sc.nextLine();
		System.out.println("Broj strana ");
		int bs = sc.nextInt();

		Knjiga k = new Knjiga(n, bs);

		k.prikazi();
		sc.close();

	}

}

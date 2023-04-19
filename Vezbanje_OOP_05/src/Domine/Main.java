package Domine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite prvo polje domine ");
		int x = sc.nextInt();
		System.out.println("Unesite drugo polje domine ");
		int y = sc.nextInt();
		sc.close();
		
		Domine A = new Domine();
		Domine B = new Domine(3, 7);
		Domine C = new Domine(x, y);
		
		B.opis();
		B.zamena();
		B.opis();
		A.opis();
		C.opis();
		
		System.out.println("Domine B i C su jednake => " +C.ispitivanje(B));
		

	}

}

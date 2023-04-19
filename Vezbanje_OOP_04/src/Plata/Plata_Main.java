package Plata;

import java.util.Scanner;

public class Plata_Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite ime radnika.");
		String i = sc.nextLine();
		System.out.println("Unesite procenat.");
		double x = sc.nextDouble();
		System.out.println("Unesite prihod.");
		double y = sc.nextDouble();
		sc.close();
		
		Plata o1 = new Plata("Sinisa", 6.25, 647350.2);
		Plata o2 = new Plata(i, x, y);
		
		System.out.println(o1.opis()+ " /" +" "+ o1.zarada());
		System.out.println(o2.opis()+ " /"+" "+o2.zarada());
		
		
		
		
	}

}

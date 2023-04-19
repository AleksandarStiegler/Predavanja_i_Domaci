package Zadatak23;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj");
		double broj = sc.nextDouble();
		
		Negativan negbr = (nb) -> (nb < 0);
		
		if (negbr.broj(broj)) {
			System.out.println("Broj je negativan");
		}else {
			System.out.println("Broj je pozitivan ili nula");
		}

	}

}

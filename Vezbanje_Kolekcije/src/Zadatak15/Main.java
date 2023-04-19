package Zadatak15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite deljenik ");
		int x = sc.nextInt();
		System.out.println("Unesite delilac ");
		int d = sc.nextInt();
		sc.close();
		
		DeljivostDvaBroja ddb = (n, dd) -> (n % dd) == 0;
		
		if (ddb.deljenje(x, d)) {
			System.out.println(" Broj "+ x + " je deljiv brojem "+ d+" .");
		}else {
			System.out.println(" Broj "+ x + " nije deljiv brojem "+ d+" .");
		}
		// kao i za prethodni deo uradicu jedan zadatak sa 2 ili 3 lambda izraza 
		// kroz jednu klasu kao vezbu

	}

}

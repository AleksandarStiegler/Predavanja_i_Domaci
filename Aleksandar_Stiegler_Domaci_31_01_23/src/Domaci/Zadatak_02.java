package Domaci;

import java.util.Random;

public class Zadatak_02 {

	public static void main(String[] args) {

	// Generisati 5 slucajnih brojeva celobrojnog tipa
		
		Random ran = new Random();
		
		for (int i = 1; i <= 5; i++) {
			int r = ran.nextInt();
			System.out.println(r);
		}
		
		
		

	}

}

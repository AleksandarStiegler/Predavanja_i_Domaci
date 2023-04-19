package Zadatak06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Konzola {
	
	Scanner sc = new Scanner(System.in);
	List<Integer> skup = new ArrayList<Integer>();
	
	public void unos() {
	System.out.println("Unesite elemente liste. Za prekid unosa koristite - 2.");
	while (true) {
		int b = sc.nextInt();
		if( b == -2) {
			return;
		}
		else
			skup.add(b);
	}

}

	public int size() {
		
		return skup.size();
	}
	
	public void prikaz() {
		for (int i = 0; i < skup.size(); i++) {
			System.out.print(skup + " ");
		}
	}
	
	
	
}
package Zadatak_02;

import java.util.Scanner;

public class ForPetlja_Unapredjena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int [] niz = {1,2,5,7,29};
		System.out.println("Stampanje niza for petljom : ");
		for (int i = 0; i < niz.length; i ++) {
			System.out.println(niz[i]);
		}
		
		System.out.println("\nStampanje elemenata niza unapredjenom petljom");
		
		for(int i : niz) {
			System.out.println(i);
		}
		int a [] = new int [5];
		System.out.println("Unos unapredjenom petljom");
		for (int j : a) {
			System.out.println("Unesite broj : ");
			a[j] = sc.nextInt();
		}
		
		System.out.println("\nStampanje elemenata niza unapredjenom petljom");
		
		for(int j : a) {
			System.out.println(j);
		}
	}

}

package Igra2;



import java.util.Random;
import java.util.Scanner;



public class Igra {
	
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Random rand = new Random();
		int x = rand.nextInt(9);
		int y = rand.nextInt(9);
		char c = 'X';

		char matr[][] = new char[20][20];

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
					matr[i][j] = '?';
				}
			}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				
					System.out.print(matr[i][j] + " ");
				}
				System.out.println();
			}
	
		
		
		System.out.print("Unesite kolonu : ");
		int kol = sc.nextInt();
		System.out.print("Unesite red : ");
		int red = sc.nextInt();
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == kol && j == red) {
					matr[i][j] = c;
				}else {
					matr[i][j] = '?';
				}
			}
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				
					System.out.print(matr[i][j] + " ");
				}
				System.out.println();
			}
		
		if (x == kol && y == red) {
			System.out.println("Pogodili ste");
		}else {
			System.out.println("Promasili ste");
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == kol && j == red) {
					matr[i][j] = c;
				}else if (i == x && j == y){
					matr[i][j] = c;
				}else {
					matr[i][j] = '?';
				}
			}
		}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				
					System.out.print(matr[i][j] + " ");
				}
				System.out.println();
			}
		

	}

}

package Zadatak_01;

import java.util.Scanner;

public class ForPetlja {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int br[] = new int [5];
		
		for(int i = 0; i < br.length; i++) {
			System.out.print("Uneti broj : ");
			br[i] = sc.nextInt();// itd....
		}

	}

}

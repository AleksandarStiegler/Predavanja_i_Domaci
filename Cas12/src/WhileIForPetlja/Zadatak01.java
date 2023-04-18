package WhileIForPetlja;

import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("unesite broj n");
		int n = sc.nextInt();
		sc.close();
		int i ;
		for ( i = 1; i <= n; i++)
			i*=i;
		System.out.println(i);
		
		
	}

}

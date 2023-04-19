package nizovi_vezbanje;

import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj clanova niza n : ");
		int n = sc.nextInt();
		
		int x[] = new int[n];
		
		System.out.println("Unesite clanove niza : ");
		for (int i = 0 ; i < x.length ; i++)
		{
			System.out.println("x["+i+"]= ");
			x[i] = sc.nextInt();
		}
		
			
		
		for (int i = 0 ; i < x.length ; i++)
		{
			System.out.println(x[i]);
		}
			sc.close();
	}

}

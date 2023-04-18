package Petlje;

import java.util.Scanner;

public class Zadatak15 {

	public static void main(String[] args) {
		
		
		// napisati program koji ucitava 10 brojeva i ispisuje koliko
		// ima negativnih, nula i pozitivnih brojeva
		
		Scanner ulaz = new Scanner(System.in);
		
		int x, n=0, neg=0, p=0;
		for(int i = 1; i <= 10; i++)
		{
			System.out.print("Unesite "+i+" broj : ");
			x = ulaz.nextInt();
			if (x<0)
			{
				neg++;
			}
			else if (x==0)
			{
				n++;
			}
			else
			{
				p++;
			}
		}
    System.out.println("Imamo "+neg+" negativnih/an, "+n+" nule(u) "+p+" i pozitivnih/an brojeva");
	}

}

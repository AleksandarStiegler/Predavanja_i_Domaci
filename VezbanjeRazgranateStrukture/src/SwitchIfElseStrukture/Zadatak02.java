package SwitchIfElseStrukture;

import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {
		
		// Napisati program kojim se utvrdjuje da li je uneti znak malo ili veliko slovo, cifra ili specijalni znak
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesite neki znak :");
		char x = ulaz.next().charAt(0);
		
		ulaz.close();
		
		if ( x >= 'a' && x <= 'z')
		{
			System.out.println("Uneli ste malo slovo : "+x);
		}
		else if ( x >= 'A' && x <= 'Z')
		{
			System.out.println("Uneli ste veliko slovo : "+x);
		}
		else if ( x >= '0'  && x <= '9')
		{
			System.out.println("Uneli ste cifru : "+x);
		}
		else 
		{
			System.out.println("Uneli ste specijalan znak : "+x);
		}

	}

}

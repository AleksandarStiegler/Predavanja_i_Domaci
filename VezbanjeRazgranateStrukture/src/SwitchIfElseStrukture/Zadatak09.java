package SwitchIfElseStrukture;

import java.util.Scanner;

public class Zadatak09 {

	public static void main(String[] args) {
		
		// Napisati program koji za uneti karakter stampa da li je samoglasnik ili suglasnik
		
		// Unos podataka
		
		Scanner ulaz = new Scanner(System.in);
		System.out.print(" Unesite neko slovo : ");
		char x = ulaz.next().charAt(0);
		ulaz.close();
		
		// Resavanje problema
		
		if (x >= 'a' && x <= 'z'  ||  x>= 'A' && x <= 'Z')
		{
			switch (x)
			{
			case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U':
			{
				System.out.println(" Uneli ste samoglasnik " +x);
				break;
			}
			default :
			{
				System.out.println("Uneli ste suglasnik "+x);
			}
			}
		}
		else if (x >= '0' && x <= '9')
		{
			System.out.println("Uneli ste cifru "+x);
		}
		else
		{
			System.out.println("Uneli ste specijalni karakter "+x);
		}
		

	}

}

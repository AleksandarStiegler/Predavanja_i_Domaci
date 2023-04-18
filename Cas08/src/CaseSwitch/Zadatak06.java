package CaseSwitch;

import java.util.Scanner;

public class Zadatak06 {

	public static void main(String[] args) {
		
		// Napisati program kojim se ucita znak za operaciju + , - , / , *
		// i dva realna operanda a zatim se stampa rezultat
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite vrednost broja x = ");
		double x = sc.nextDouble();
		System.out.print("Unesite vrednost broja y = ");
		double y = sc.nextDouble();
		System.out.println("Unesite znak + , - , * ili / u zavisnosti od zeljene operacije");
		char operator = sc.next().charAt(0);
		sc.close();
	/*	
		switch (operator)
		{
		case '+':
		{
			System.out.println("Resenje = "+(x+y));
			break;
		}
		case '-':
		{
			System.out.println("Resenje = "+(x-y));
			break;
		}
		case '/':
		{
			System.out.println("Resenje = "+x/y);
			break;
		}
		case '*':
		{
			System.out.println("Resenje je = "+x*y);
			break;
		}
		default :
			System.out.println("Nije unesena odgovarajuca operacija");
		}
	*/
		if (operator == '+')
		{
			System.out.println("Resenje = "+(x+y));
		}
		else if (operator == '-')
		{
			System.out.println("Resenje = "+(x-y));
		}
		else if (operator == '/')
		{
			System.out.println("Resenje = "+x/y);
		}
		else if (operator == '*')
		{
			System.out.println("Resenje je = "+x*y);
		}
		else 
			System.out.println("Nije unesena odgovarajuca operacija");
	}

}

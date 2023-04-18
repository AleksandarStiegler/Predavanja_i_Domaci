package CaseSwitch;

import java.util.Scanner;

public class Zadatak08 {

	public static void main(String[] args) {

    // za uneti mesec ispisati koliko dana ima uneti mesec

		Scanner sc = new Scanner(System.in);
		int g, m;
	/*
		System.out.println("Unesite godinu ");
		g = sc.nextInt(); */
	
		System.out.println("Unesite mesec od 1 do 12");
		m = sc.nextInt();
		 
		switch (m)
		{
		case 1:
		{
			System.out.println("31");
			break;
		}
		case 2 :
		{
			System.out.println("28 ili 29 za prestupnu ;p");	
			break;
		}
		case 3 : 
		{
			System.out.println("31");
			break;
		}
		case 4 :
		{
			System.out.println("30");
			break;
		}
		case 5 :
		{
			System.out.println("31");
			break;
		}
		case 6:
		{
			System.out.println("30");
			break;
		}
		case 7 :
		}
		
		
		
		
		
		
	}

}

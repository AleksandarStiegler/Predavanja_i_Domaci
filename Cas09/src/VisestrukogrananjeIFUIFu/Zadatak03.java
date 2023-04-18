package VisestrukogrananjeIFUIFu;

import java.util.Scanner;

public class Zadatak03 {

	public static void main(String[] args) throws Exception{
		
		// Zadatak 3 ( zadatak 2 ali sa switch case strukturom)
		
		Scanner sc = new Scanner(System.in);
		char k ;
		
		System.out.println("Unesite kategoriju vozacke dozvole");
		
		k = sc.next().charAt(0);
		
		switch (k)
		{
		case 'A' :  case 'a' :
		{
			System.out.println("Mozete voziti motor");
			break;
		}
		case 'B' :  case 'b' :
		{
			System.out.println("Mozete voziti automobil");
			break;
		}
		case 'C' :  case 'c' :
		{
			System.out.println("Mozete voziti automobil, kamion i kombi");
			break;
		}
		case 'D' :  case 'd' :
		{
			System.out.println("Mozete voziti automobil, kamion, kombi i autobus");
			break;
		}
		case 'E' :  case 'e' :
		{
			System.out.println("Mozete voziti automobil, kombi, šleper i šleper sa prikolicom");
			break;
		}
		default :
			System.out.println("Unesena vrednost ne pripada vozackim kategorijama");
		}
			
		

	}

}

package VisestrukogrananjeIFUIFu;

import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		char k;
		
		System.out.println("Unesite kategoriju vozacke dozvole ");
		 k = ulaz.next().charAt(0);
		ulaz.close();
		 
		 if (k=='A' || k=='a')
		 {
			 System.out.println("Mozete voziti motor");
		 }
		 else if (k== 'B' || k == 'b')
		 {
			 System.out.println("Mozete voziti automobil ");
		 }
		 else if (k == 'C' || k == 'c')
		 {
			 System.out.println("Mozete voziti automobil, kamion i kombi");
			 
		 }
		 else if (k == 'D' || k == 'd')
		 {
			 System.out.println("Mozete voziti automobil, kamion, kombi i autobus");
			 
		 }
		 else if (k == 'E' || k == 'e')
		 {
			 System.out.println("Mozete voziti automobil, kombi, šleper i šleper sa prikolicom");
		 }
		 else
		 {
			 System.out.println("Unesena vrednost ne pripada vozackoj kategoriji");
		 }

	
		
	}

}

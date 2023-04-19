package RazgranateStrukture;

import java.util.Scanner;

public class Primer09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// za b razlicito od nule z=a/b ako je b=0 deljenje nulom
		
		// Unos podataka
		Scanner input = new Scanner(System.in);
		double a, b;
		System.out.print("Unesite vrednost za a = ");
		a = input.nextDouble();
		System.out.print("Unesite vrednost za b = ");
		b = input.nextDouble();
		
		// ovo cu preko ternarnih operatora
		
		//z = (b!=0) ? a/b : // izgleda da ipak necu nisam siguran kako da instant idem na stampanje ako nije ispunjen uslov ^^
		
		if (b!=0)
		    System.out.println("Vrednost izraza z = "+a/b);
		else
			System.out.println("Deljenje nulom");
		input.close();
		
		
		
		

	}

}

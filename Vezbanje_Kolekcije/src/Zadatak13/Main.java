
package Zadatak13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
	//	Testirabroj paranBroj = /* ovde dolazi lambda izraz */ 
		
		// leva strana lambda izraza -> desna strana lambda izraza 
		// ako ima parametar nalazi se u zagradama a ako ne zagrade ostaju prazne
		// desna strana izvrsava akciju 
		
		Testirabroj paranBroj =  (n) -> (n % 2 == 0);
		
		if (paranBroj.test(20)) {
			System.out.println("Broj je paran");
		}
		else {
			System.out.println("Nije paran"); // ovo neka ovako ostane kao sa casa uradicu 1, 2
											  // osnovna primera
		}
		
	}

}

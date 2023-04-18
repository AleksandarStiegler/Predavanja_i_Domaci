package aleksandar.stiegler;

import java.util.Scanner;

public class KiloUBajt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite vrednost u kilobajtima ");
		double x = input.nextDouble();
		System.out.println("Vrednost u bajtovima je " + x*1024);
		
		input.close();

	}

}

package WhileDoWhilePetlje;

import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);
		int n, i = 1;
		double s = 0;
		System.out.print("Unesite vrednost za n: ");
		n = ulaz.nextInt();
		while (i <= n) {
			s += (double) 1 / i;
			i++;
		}
		System.out.println("Suma recipročnih vrednosti brojeva do " + n + " je: " + s);
		ulaz.close();

		/*for ( int i = 1 ; i <= n ; i++)
			s += (double) 1 / i;
		System.out.println("Suma recipročnih vrednosti brojeva do " + n + " je: " + s);
	*/
	}
	

}

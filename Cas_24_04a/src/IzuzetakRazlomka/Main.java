package IzuzetakRazlomka;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	// throws ( kljucna rec ) koristi se u zaglavlju metode
	// da naznaci tip / tipove izuzetaka koje ta metoda moze da baci
	public static int kolicnik(int b, int i) throws ArithmeticException {
		return b / i;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Unesite brojilac : ");
			int b = sc.nextInt();
			System.out.print("Unesite imenilac : ");
			int i = sc.nextInt();
			sc.close();

			int rez = kolicnik(b, i);
			System.out.println("Kolicnik iznosi " + rez);

		} catch (ArithmeticException e) {
			System.out.println("Izuzetak " + e);

		}catch(InputMismatchException e) {
			System.out.println("Unesite celobrojne vrednosti");
					
		}

	}

}

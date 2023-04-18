package aleksandar.stiegler;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Ucitavanje (i smestanje) unete vrednosti sa konzole
		
		    Scanner sc = new Scanner(System.in); {
			

			System.out.println("Kako se zovete? ");
			String ime = sc.nextLine();
			System.out.println("Vi se zovete: " + ime);
			System.out.println("Koliko imate godina? ");
			int brojGodina = sc.nextInt();
			System.out.println("Imate godina " + brojGodina);
		}
	}

}

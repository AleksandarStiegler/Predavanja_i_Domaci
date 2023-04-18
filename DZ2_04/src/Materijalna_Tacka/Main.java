package Materijalna_Tacka;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
	
			
			NizTacaka nt = new NizTacaka();
			
			double m = 0;
			System.out.println("Unesite masu tacke. Unesite negativnu vrednost za prekid!");
			while (m >= 0) {
				System.out.print("Nova tacka : \nUnesite masu:");
				m = sc.nextDouble();
				if(m < 0) {
					break;
				}
				else {
					System.out.print("\nUnesite koordinate tacke. \nx : ");
					double x = sc.nextDouble();
					System.out.print("\ny : ");
					double y = sc.nextDouble();
					System.out.print("\nz : ");
					double z = sc.nextDouble();
					Tacka t = new Tacka(x, y, z, m);
					nt.dodajTacku(t);
				}
				nt.ispisiNiz();
				System.out.println("Tacka sa najvecom privlacnom silom u odnosu na "
						+ "tacku jedinicne mase u koordinatnom pocetku : ");
				nt.najvecePrivlacenje(new Tacka());
				System.out.println("\n\n");
				
		}
			sc.close();
	}

}

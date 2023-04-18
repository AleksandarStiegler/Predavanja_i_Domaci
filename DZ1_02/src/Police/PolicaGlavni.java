package Police;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PolicaGlavni {

	public static void main(String[] args) throws Exception {
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		// Nosivost police i broj slobodnih mesta cu postaviti ,
		// simuliramo slucaj kupljene police
		
		Polica polica = new Polica(5, 200);
		
		// Ovde cemo korisniku pokazati osobine police 
		System.out.println(polica.opis());
		
		System.out.println("Koliko predmeta stavljate na policu ?");
		int n = Integer.parseInt(bfr.readLine());
		
		if ( n < 0 || n > 5) {
			System.out.println("Ne mozete da stavite toliko predmeta nema dovoljno mesta!");
		}
		else {
			for (int i = 0; i < n; i++) {
				System.out.println("Unesite tezinu predmeta : ");
				double x = Double.parseDouble(bfr.readLine());
				polica.prvoSlobodnoMesto(x);
				if(polica.trenutnaTezina() > polica.nosivostPolice()) {
					System.out.println("Svaka cast polomili ste policu ");
					break;
				}
			}
			polica.Stanje();
			System.out.println("Sa kog mesta zelite da uklonite predmet ? Ne zaboravite ima ih "+polica.brMesta()+".");
			try {
			int k = Integer.parseInt(bfr.readLine());
			if (k < 0 || k > 5) {
				System.out.println("Pa upravo sam vam rekao da ima "+polica.brMesta() +" mesta.......");
			}
			else {
			polica.uzmiPredmet(k);
			}
			polica.odredjenoMesto(4, 16.5);
			if (polica.ispitajMesto(5) == true) {
				System.out.println("Sva mesta su popunjena");
			}
			else {
				System.out.println("Ima jos "+(polica.brMesta() - polica.trenutnoPopunjeno())+" praznih mesta.");
			}
			
			polica.Stanje();
			
		}catch (Exception e) {
			
		}
		
		}
	}

}

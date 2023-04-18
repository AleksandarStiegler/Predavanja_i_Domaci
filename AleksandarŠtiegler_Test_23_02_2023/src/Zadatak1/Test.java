package Zadatak1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Test {

	public static void main(String[] args) throws Exception{
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("##0.000");
		
		try {
		System.out.print("Unesite poluprecnik : ");
		double poluprecnik = Double.parseDouble(bfr.readLine());
		System.out.print("\nUnesite visinu : ");
		double visina = Double.parseDouble(bfr.readLine());
		if( poluprecnik < 0) {
			poluprecnik =Math.abs(poluprecnik);
		}
		if (visina < 0 ) {
			visina = Math.abs(visina);
		}
		
		Valjak v = new Valjak(poluprecnik, visina);
		// posto sam sve metode za valjak stavio u opis za Valjak cu samo pozvati opis da se
		// ne ponavljaju rezultati
		v.opis(); 
		
		System.out.println("\nUnesite pocetnu popunjenost kante");
		double pocPop = Double.parseDouble(bfr.readLine());
		if (pocPop < 0) {
			pocPop = Math.abs(pocPop);
		}
		// Za prvu kantu cu koristiti pocetne podatke sa unosa za valjak da skratim malo
		Kanta K1 = new Kanta(poluprecnik, visina, pocPop);
		// da istestiramo metode
		K1.dolivanje();
		K1.ispitivanje();
		System.out.println("Koliko tecnosti zelite da dolijete?");
		double dolivenaTecnost = Double.parseDouble(bfr.readLine());
		double trenutnaKolTecnosti = K1.DolivanjeTecnosti(dolivenaTecnost);
		System.out.println("Trenutna tecnost u kanti : "+df.format(trenutnaKolTecnosti));
		
		System.out.println("Koliko tecnosti zelite da odlijete ?");
		double odlTecnost = Double.parseDouble(bfr.readLine());
		trenutnaKolTecnosti = K1.Odlivanje(trenutnaKolTecnosti, odlTecnost);
		System.out.println("Trenutna tecnost u kanti "+df.format(trenutnaKolTecnosti));
		
		System.out.print("Unesite poluprecnik kante ");
		double polkanta = Double.parseDouble(bfr.readLine());
		System.out.print("\nUnesite visinu kante ");
		double viskanta = Double.parseDouble(bfr.readLine());
		System.out.println();
		// Iskoristicu pocetnu popunjenost posto je ona nevazna za ovaj deo zadatka
		// jer ispitujemo maksimalno presipanje sto znaci da je pocetna kanta puna do vrha
		// a nova kanta prazna i u tom slucaju pocetna popunjenost ne ulazi u opticaj
		Kanta K2 = new Kanta(polkanta, viskanta, pocPop);
		System.out.println("Maksimalnu kolicinu tecnosti koju mozemo presuti ,"
				+ "\n iz prve kante u drugu je "+ K1.MaximalnoPresipanje(K2));
		K1.opisKante();
	
		
		}catch (Exception e) {
			System.out.println("Pogresan unos.");
		}
	}

}

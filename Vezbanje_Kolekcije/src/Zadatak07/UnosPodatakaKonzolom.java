package Zadatak07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class UnosPodatakaKonzolom {

	// Nista za pocetak da uvedemo nacin unosa podataka i kreiramo listu 
	
	BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
	
	List<Double> rbr = new ArrayList<Double>();
	
	public void unos() throws IOException{
		System.out.println("Unesite clanove liste. Za prekid unesite -10.");
		while(true) {
			double a = Double.parseDouble(bfr.readLine());
			if (a == -10) {
				return;
			}else {
				rbr.add(a);
			}
		}
	}
	
	// Metoda za ispisivanje ajde da koristimo 2 nacina unapredjena for petlja i petlja
	
	public void ispis() {
		for (double k : rbr) {
			System.out.printf("%s ",k);
		}
	}
	public void prikaz() {
		for (int i = 0; i < rbr.size(); i++) {
			System.out.print(rbr.get(i) +" ");
		}
	}
	// to je sto se tice prikazivanja ajde jos da prikazemo duzinu niza i recimo
	// ispitivanje da li se trazeni element nalazi u listi koristeci konzolu
	
	public int duzina() {
		return rbr.size();
	}
	
	public boolean ispitaj() throws IOException {
		System.out.println("Unesite element koji trazite u listi");
		double b = Double.parseDouble(bfr.readLine());
		if (rbr.contains(b)) {
			return true;
		}else {
			return false;
		}
	}
}

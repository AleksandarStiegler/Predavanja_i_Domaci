package Zadatak_03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestArtikal {
	

	public static void main(String[] args) throws Exception { 
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		// Unos podataka o artiklu
		System.out.println("Unesite naziv artikla: ");
		String naziv = ulaz.readLine();
		System.out.println("Unesite proizvodjača artikla: ");
		String proizvodjac = ulaz.readLine();
		System.out.println("Unesite barkod artikla: ");
		String barkod = ulaz.readLine();
		System.out.println("Unesite cenu artikla: ");
		double cena = Double.parseDouble(ulaz.readLine()); 
		// Kreiranje niza objekata klase 
		 Artikal a = new Artikal();
		try {
			// Postavljanje podataka o artiklu
			a.setNaziv(naziv); 
			a.setProizvodjac(proizvodjac);
			a.setBarkod(barkod);
			a.setCena(cena); 
			// Štampanje podataka o artiklu 
			System.out.println("\nUneti podaci o artiklu su: "); 
			System.out.println(a.toString()); 
			} catch (IzuzetakArtikal e) {
				System.out.println("Greška: " + e.getMessage()); 
				}
		} 
	}
		
	
	
	



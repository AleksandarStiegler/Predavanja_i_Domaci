package Osoba;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Osoba {

	protected String ime = "N";
	protected String prezime = "N";
	protected String maticniBroj;

	
	public String getIme() {
		return ime;
	}

	public void setIme() throws Exception {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Unesite ime osobe.");
			String i = bfr.readLine();
			if (i.isBlank() || i.isEmpty()) {

				throw new Izuzetak("Ime osobe ne moze biti prazno polje ili null. Unesite ponovo!");
			} else {
				ime = i;
			}
		} catch (Izuzetak e) {
			System.out.println("Greska! " + e.getMessage());
			setIme();
		}

	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime() throws Exception {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Unesite prezime osobe.");
			String p = bfr.readLine();
			if (p.isBlank() || p.isEmpty()) {

				throw new Izuzetak("Prezime osobe ne moze biti prazno polje ili null. Unesite ponovo!");
			} else {
				prezime = p;
			}
		} catch (Izuzetak e) {
			System.out.println("Greska! " + e.getMessage());
			setIme();
		}

	}

	public String getMaticniBroj() {
		return maticniBroj;
	}

	public void setMaticniBroj() throws Exception {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Unesite maticni broj osobe.");
			String mb = bfr.readLine();
			if (mb.isBlank() || mb.isEmpty()) {

				throw new Izuzetak("Maticni broj osobe ne moze biti prazno polje ili null. Unesite ponovo!");
			} else {
				maticniBroj = mb;
			}
		} catch (Izuzetak e) {
			System.out.println("Greska! " + e.getMessage());
			setIme();
		}

	}
}

package Osoba;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Osoba {

	String ime;
	String prezime;
	String datumRodjenja;
	String adresaStanovanja;

	public String getIme() {
		return ime;
	}

	public void setIme() throws Exception {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite ime");
		String i = bfr.readLine();
		if (i.isBlank() || i.isEmpty()) {
			System.out.println("Greska. Ime ne moze biti prazno. Unesite ponovo!");
			setIme();
		} else {
			this.ime = i;
		}

	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public void setPrezime() throws Exception {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite prezime");
		String p = bfr.readLine();
		if (p.isBlank() || p.isEmpty()) {
			System.out.println("Greska. Prezime ne moze biti prazno. Unesite ponovo!");
			setPrezime();
		} else {
			this.prezime = p;
		}

	}
	public String getDatumRodj() {
		return datumRodjenja;
	}
	public void setDatumRodj() throws Exception {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite datum rodjenja");
		String dr = bfr.readLine();
		if (dr.isBlank() || dr.isEmpty()) {
			System.out.println("Greska. Datum rodjenja ne moze biti prazan. Unesite ponovo!");
			setDatumRodj();
		} else {
			this.datumRodjenja = dr;
		}

	}
	
	public String getAdresa() {
		return adresaStanovanja;
	}
	
	public void setAdresa() throws Exception {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite adresu stanovanja");
		String a = bfr.readLine();
		if (a.isBlank() || a.isEmpty()) {
			System.out.println("Greska. Adresa ne moze biti prazna. Unesite ponovo!");
			setAdresa();
		} else {
			this.adresaStanovanja = a;
		}

	}
	
	public void ispisi() {
		
		System.out.println("IME : "+getIme()+"\tPrezime : "+getPrezime()+"\tDatum rodjenja : " +getDatumRodj()+
				"\nAdresa stanovanja : "+getAdresa());
	}

}

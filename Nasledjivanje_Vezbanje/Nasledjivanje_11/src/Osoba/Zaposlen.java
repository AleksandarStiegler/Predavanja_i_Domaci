package Osoba;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zaposlen extends Osoba {
	
	String nazivFirme;
	String odeljenje;
	
	public String getFirma() {
		return nazivFirme;
	}
	
	public void setFirma() throws Exception {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite naziv firme");
		String f = bfr.readLine();
		if (f.isBlank() || f.isEmpty()) {
			System.out.println("Greska. Naziv firme ne moze biti prazan. Unesite ponovo!");
			setFirma();
		} else {
			this.nazivFirme = f;
		}

	}
	
	public String getOdeljenje() {
		return odeljenje;
	}
	
	public void setOdeljenje() throws Exception {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite naziv odeljenja");
		String o = bfr.readLine();
		if (o.isBlank() || o.isEmpty()) {
			System.out.println("Greska. Naziv odeljenja ne moze biti prazan. Unesite ponovo!");
			setOdeljenje();
		} else {
			this.odeljenje = o;
		}

	}
	
	public void ispisiZaposlen() {
		super.ispisi();
		System.out.println("FIRMA : "+getFirma()+"\nOdeljenje : "+getOdeljenje());
	}

}

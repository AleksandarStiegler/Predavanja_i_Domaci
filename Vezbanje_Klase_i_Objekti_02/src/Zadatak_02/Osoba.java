package Zadatak_02;

public class Osoba {
	
	private String ime, datum, adresa;
	
	Osoba (String i, String d, String a){
	
		
		this.ime = i;
		this.datum = d;
		this.adresa = a;
	}
	
	public String opis() {
		return this.ime + " rodjen/a je "+this.datum+ " u "+ this.adresa;
	}
	
	
	}


package Artikal;

import Izuzetak.*;

public class Artikal {
	
	String naziv;
	String proizvodjac;
	String barkod ;
	double cena ;
	
	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv (String n) throws Exception {
		if (n.isBlank() || n.isEmpty()) {
			throw new IzuzetakArtikal("Artikal mora imati naziv, ne moze biti null ili prazno polje");
		}
		else {
			this.naziv = n;
		}
	}
	
	public String getProizvodjac() {
		return proizvodjac;
	}
	public void setProizvodjac (String p) throws Exception {
		if (p.isBlank() || p.isEmpty()) {
			throw new IzuzetakArtikal("Artikal mora imati proizvodjaca, ne moze biti null ili prazno polje");
		}
		else {
			this.proizvodjac = p;
		}
	}
	
	public String getBarCode() {
		return barkod;
	}
	
	public void setBarCode (String b) throws Exception {
		if (b.isBlank() || b.isEmpty()) {
			throw new IzuzetakArtikal("Artikal mora imati barkod, ne moze biti null ili prazno polje");
		}
		else {
			this.barkod = b;
		}
	}
	
	public double getCena() {
		return cena;
	}
	
	public void setCena (double c) throws Exception {
		
			if (c <= 0) {
				throw new IzuzetakArtikal("Cena artikla mora biti veca od 0");
			}
			else {
				this.cena = c;
			}
		}
	public String toString() {
		return "Naziv : "+naziv+"\nProizvodjac : "+proizvodjac+"\nBarCode : "+barkod+"\nCena : "+cena;
	}
	
}

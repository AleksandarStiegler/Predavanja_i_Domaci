package Zadatak_1;

public class Knjiga {
	
	public String naslov;
	public String autor;
	public String opis;
	public double cena;
	public boolean stanje;
	
	
	
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String n) {
		this.naslov = n;
	}
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String a) {
		this.autor = a;
	}
	public String getOpis() {
		return opis;
	}
	public void setOpis(String o) {
		this.opis = o;
	}
	public double getCena() {
		return cena;
	}
	public void setCena(double c) {
		this.cena = c;
	}
	public boolean getStanje() {
		return stanje;
	}
	public void setStanje(int s) {
		 boolean stanje = s >=1;
		 this.stanje = stanje;
		}
	}
	



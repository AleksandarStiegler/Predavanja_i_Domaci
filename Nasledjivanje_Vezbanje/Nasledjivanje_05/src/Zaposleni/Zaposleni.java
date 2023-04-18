package Zaposleni;

public abstract class Zaposleni {
	
	double brojRadnihSati;
	double cenaRadnogSata;
	
	public Zaposleni(double brs, double crs) {
		this.brojRadnihSati = brs;
		this.cenaRadnogSata = crs;
	}
	
	public abstract double izracunajPlatu();

}

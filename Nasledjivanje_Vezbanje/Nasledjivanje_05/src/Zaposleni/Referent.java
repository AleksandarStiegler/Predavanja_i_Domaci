package Zaposleni;

public class Referent extends Zaposleni{
	
	double bonus;
	Referent (double brojRS, double cenaRS, double bonus){
		super(brojRS, cenaRS);
		this.bonus = bonus;
	}
	
	public double izracunajPlatu() {
		
		return brojRadnihSati * cenaRadnogSata + bonus;
	}

}

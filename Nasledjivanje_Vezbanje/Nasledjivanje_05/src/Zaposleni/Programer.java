package Zaposleni;

public class Programer extends Zaposleni{
	
	double bonus;
	double prekovremeniRad;
	Programer(double brojRS, double cenaRS, double bon, double prekRad){
		super(brojRS, cenaRS);
		this.bonus = bon;
		this.prekovremeniRad = prekRad;
	}
	

	public double izracunajPlatu() {
		
		return brojRadnihSati * cenaRadnogSata + bonus + prekovremeniRad;
	}

}

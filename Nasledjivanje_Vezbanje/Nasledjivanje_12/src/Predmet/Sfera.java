package Predmet;

public class Sfera extends Predmet{
	
	double poluprecnik;
	Sfera(double specTez, double p){
		super(specTez);
		poluprecnik = p;
		oznaka = 'S';
	}

	
	public double zapremina() {
		return 4 * Math.pow(poluprecnik, 3) * 3.14 / 3;
	}

	
	public double tezina() {
		return (4 * Math.pow(poluprecnik, 3) * 3.14 / 3) / specTezina;
		
	}
	
	public String opisSfere() {
		return "Sfera poluprecnika : "+poluprecnik+" i "+opis()+" ima zapreminu "
	+ zapremina()+" i tezinu "+ tezina();
	
	}

}

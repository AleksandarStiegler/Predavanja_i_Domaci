package Predmet;

public abstract class Predmet {
	
	double specTezina;
	char oznaka;
	
	public abstract double zapremina();
	public abstract double tezina();
	
	public char getOznaka() {
		return oznaka;
	}
	Predmet(){
		specTezina = 1;
	}
	Predmet(double st){
		specTezina = st;
	}
	
	public String opis() {
		return "specificne tezine " +specTezina;
	}

}

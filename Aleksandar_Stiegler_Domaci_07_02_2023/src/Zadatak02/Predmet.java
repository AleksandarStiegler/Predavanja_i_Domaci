package Zadatak02;

public class Predmet {
	
	protected char vrstaPredmeta;
	protected double specTezina;
	
	public char getI() {
		return vrstaPredmeta;
	}
	public double getSpecTezina() {
		return specTezina;
	}
	
	Predmet(){
		char vrstaPredmeta = 1;
		specTezina = 1.0;
	}
	
	Predmet (char i , double st){
		this.vrstaPredmeta = i;
		this.specTezina = st;
	}
	
	public String opisPredmeta () {
		return "Ima specificnu tezinu "+specTezina;
	}
	
	

}

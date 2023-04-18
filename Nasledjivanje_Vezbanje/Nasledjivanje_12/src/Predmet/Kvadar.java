package Predmet;

public class Kvadar extends Predmet {
	
	double ivicaA;
	double ivicaB;
	double ivicaC;
	
	Kvadar(double specT, double a, double b, double c){
		super(specT);
		ivicaA = a;
		ivicaB = b;
		ivicaC = c;
		oznaka = 'K';
	}

	
	public double zapremina() {
		
		return ivicaA * ivicaB * ivicaC ;
	}

	
	public double tezina() {
		
		return ivicaA * ivicaB * ivicaC / specTezina;
	}
	
	public String opisKvadra() {
		return "Kvadar stranica a : "+ivicaA+" b : "+ivicaB+" c : "+ivicaC
				+" i "+opis()+" . Ima zapreminu "+zapremina()+" i tezinu "+tezina();
	}

}

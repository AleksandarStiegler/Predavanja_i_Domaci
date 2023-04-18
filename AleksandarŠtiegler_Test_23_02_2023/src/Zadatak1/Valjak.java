package Zadatak1;

public class Valjak {
	
	private double poluprecnik;
	private double visina;
	
	Valjak (double p, double h){
		this.poluprecnik = p;
		this.visina = h;
	}
	
	public double getPoluprecnik() {
		return poluprecnik;
	}
	
	public double getVisina() {
		return visina;
	}
	
	public double zapremina() {
		return poluprecnik * poluprecnik * 3.14 * visina;
	}
	
	public void opis() {
		System.out.println("Poluprecnik iznosi : "+getPoluprecnik()+"\nVisina iznosi : "+getVisina()+"\nZapreminu "+zapremina());
	}
	
	
	
	
	
}


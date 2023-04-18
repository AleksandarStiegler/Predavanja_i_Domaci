package Pocetak_OOP;

public class Krug {
	
	private double poluprecnik;

	Krug (){
		poluprecnik = 10.0;
	}
	
	// poluprecnik ima vrednost 10, koja je postavljena u konstruktoru 
	// prilikom kreiranja objekta
	
	public double area () {
		return 3.14 * poluprecnik * poluprecnik;
	}
	
	
}

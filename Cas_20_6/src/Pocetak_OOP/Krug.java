package Pocetak_OOP;

public class Krug {
	
	private double radius ;
	
	Krug (double rad){ // Konstruktor klase koji inacijalizuje jedan podatak
		
		radius = rad;
	}

	public double area() {
		return 3.14 * radius * radius;
	}
}

package Figura;

public class Pravougaonik extends Figura{

	Pravougaonik(double x, double y) {
		super(x, y);
		
	}

	
	public double obim() {
		
		return 2 * xRef + 2* yRef;
	}


	public double povrsina() {
		
		return xRef * yRef;
	}
	
	

}

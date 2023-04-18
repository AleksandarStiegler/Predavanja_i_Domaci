package Primer;

public class Krug {
	
	private double poluprecnik;
	
	Krug(){
		poluprecnik = 0.0;
	}
	
	Krug(double poluprecnik){
		this.poluprecnik = poluprecnik;
	}
	
	Krug (Krug ob){
		poluprecnik = ob.poluprecnik;
	}
	
	public double area() {
		return 3.14 * poluprecnik * poluprecnik;
	}

}

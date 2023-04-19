package Kvadar;

public class Kvadar {
	
	// Postaviti kvadar dohvatiti stranice naci povrsinu i zapreminu i naci razliku istih za 
	// Dva kvadra od kojih je jedan dimenzija 2 3 i 5
	
	private double a;
	private double b;
	private double c;
	
	public Kvadar() {
		a = 2.0;
		b = 3.0;
		c = 5.0;
	}
	
	public Kvadar(double x, double y, double z) {
		this.a = x;
		this.b = y;
		this.c = z;
	}

	public double getA() {
	return a;}
	public double getB() {
		return b;
	}
	public double getC() {
		return c;
	}
	public double povr() {
		double p = 2* a * b + 2 * a * c + 2 * b * c;
		return p;
	}
	public double zap() {
		double z = a * b * c;
		return z;
	}
	
	
	
	public String toString() {
		return "Kvadar stranica a = "+a+" , b = "+ b + " , c = "+c+" , ima povrsinu "+povr()+" i zapreminu "+zap();
	}
	
}

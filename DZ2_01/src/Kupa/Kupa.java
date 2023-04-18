package Kupa;

public class Kupa {
	
	double r1; // donji poluprecnik
	double r2; // gornji poluprecnik
	double h;  // visina kupe
	
	public double zapremina() {
		double zap;
		zap = Math.PI * h * (r1 * r1 + r2 * r2 + r1 * r2) / 3;
		return zap;
	}
	
	
	
	Kupa(double x, double y, double c){
		this.r1 = x;
		this.r2 = y;
		this.h = c;
	}
	// Zaboravih na podrazumevane vrednosti ...
	Kupa (){
		this.r1 = 2;
		this.r2 = 1;
		this.h = 1;
	}
	
	public double ispitajZapremine(Kupa A) {
		if (this.zapremina() > A.zapremina()) {
			return A.zapremina();
		}
		else {
			return this.zapremina();
		}
	}
	
	public double polDonjeKupe() {
		return r1;
	}
	public double polGornjeKupe() {
		return r2;
	}
	public double visinaKupe() {
		return h;
	}
	
	public String opisKupe() {
		return "K("+r1+ "," +r2+ "," + "," +h+")";
	}

}

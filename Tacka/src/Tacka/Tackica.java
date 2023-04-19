package Tacka;

public class Tackica {
	
	 double x;
	 double y;
	 
	  Tackica(){
		 x = 0;
		 y = 0;
	 }
	  
	Tackica (double a, double b){
		x = a;
		y = b;
	}
	
	public double Rastojanje() {
		double c;
		return c = Math.sqrt(x*x + y*y);
	}
	public double Rasizm(Tackica t) {
		double c;
		return c = Math.sqrt(Math.pow(x-t.x, 2) + Math.pow(y-t.y,2));
	}

}

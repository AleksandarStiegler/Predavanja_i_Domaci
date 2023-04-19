package Tackica;

public class Tacka {
	
	private double x, y;
	
	Tacka (){
		x = 1;
		y = 1;
		
	}
	
	Tacka (double a){
		x = y = a;
	}
	Tacka (double a , double b){
		x = a;
		y = b;
	}
	
	public double rasodkoor() {
		return Math.sqrt(x * x + y * y); 
	}
	
	public double ras2tac(Tacka a) {
		return Math.sqrt(Math.pow(x-a.x, 2) + Math.pow(y-a.y, 2));
	}
	
	public String opisook() {
		return " rastojanje od koordinatnog pocetka : "+rasodkoor();
	}
	public String opisr2t(Tacka a ) {
		return " iznosi : "+ras2tac(a);
	}
	
	
	
	
	

}

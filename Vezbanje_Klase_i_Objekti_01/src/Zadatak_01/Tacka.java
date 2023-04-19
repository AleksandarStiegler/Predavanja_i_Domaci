package Zadatak_01;

public class Tacka {
	
	private double x;
	private double y;
	
	
	Tacka(double a, double b){
		x = a;
		y = b;
	}
	Tacka(){
		x = 0.0;
		y = 0.0;
	}
	
	public double getx() {
		return x;
	}
	public double gety() {
		return y;
	}
	
	public String prikaz() {
		return "Tacka ima koordinate T(" +getx()+","+gety()+") .";
	}

}

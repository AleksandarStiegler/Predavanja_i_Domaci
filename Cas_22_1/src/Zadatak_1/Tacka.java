package Zadatak_1;

public class Tacka {
	
	private double x;
	private double y;
	
	Tacka (double xx, double yy){
		x = xx;
		y = yy;
	}
	
	double getx(){
		return x;
	}
	double gety() {
		return y;
	}
	
	public String ispisi() {
		return "("+x+","+y+")";
	}
	
	public void prikaz() {
		System.out.println("Tacka ima koordinate T ("+getx()+","+gety()+")");
	}
}

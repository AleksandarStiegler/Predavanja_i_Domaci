package Zadatak01;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tacka {
	
	private double x;
	private double y;
	
	Tacka(){
		x = 1.0;
		y = 1.0;
	}
	Tacka (double xx, double yy){
		this.x = xx;
		this.y = yy;
	}
	// Rastojanje od koordinatnog pocetka do tacke
	
	public double rastojanje (){
		double r;
		r = Math.sqrt((x * x) + (y * y));
		return r;
	}
	// Malo je nejasno da li se trazi samo rastojanje od koordinatnog pocetka ili izmedju 2 tacke
	// pa cu napisati i metodu za rastojanje izmedju 2 tacke
	
	public double rastojanjeIzmedju2Tacke (Tacka A) {
		double ras;
		ras = Math.sqrt((Math.pow(A.x-x, 2) + Math.pow(A.y-y, 2)));
		return ras;
	}
	
	
	
	
	// dohvatanje koordinata
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	// postavljanje koordinata
	public void setX() throws Exception {
		BufferedReader bfr = new BufferedReader (new InputStreamReader(System.in));
		
		try {
			System.out.println("Unesite koordinatu X zeljene tacke : ");
			x = Double.parseDouble(bfr.readLine());
		}catch (Exception e) {
			System.out.println("Pogresan unos! Unesite ponovo");
			setX();
		}
	}
	
	public void setY() throws Exception {
		BufferedReader bfr = new BufferedReader (new InputStreamReader(System.in));
		
		try {
			System.out.println("Unesite koordinatu Y zeljene tacke : ");
			y = Double.parseDouble(bfr.readLine());
		}catch (Exception e) {
			System.out.println("Pogresan unos! Unesite ponovo");
			setY();
		}
	}
	// kratak opis
	public void opisTacke() {
		System.out.println("Tacka ima koordinate ("+x+","+y+").");
	}

}

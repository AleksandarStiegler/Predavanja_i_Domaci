package Zadatak02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kvadar extends Predmet{
	
	private double stranicaA;
	private double stranicaB;
	private double stranicaC;
	
	Kvadar (char k, double sptez, double stra, double strb, double strc){
		super(k,sptez);
		this.stranicaA = stra;
		this.stranicaB = strb;
		this.stranicaC = strc;
	}
	// Imamo 3 stranice
	public double getStranicaA() {
		return stranicaA;
	}
	
	public void setStranicaA() throws IOException {
		BufferedReader bfr = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Unesite stranicu kvadra");
		try {
			stranicaA = Double.parseDouble(bfr.readLine());
		}catch (IOException e) {
			System.out.println("Pogresan unos. Unesite ponovo.");
			setStranicaA();
		}
	}
	
	public double getStranicaB() {
		return stranicaB;
	}
	
	public void setStranicaB() throws IOException {
		BufferedReader bfr = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Unesite stranicu kvadra");
		try {
			stranicaB = Double.parseDouble(bfr.readLine());
		}catch (IOException e) {
			System.out.println("Pogresan unos. Unesite ponovo.");
			setStranicaB();
		}
	}

	public double getStranicaC() {
		return stranicaC;
	}
	
	public void setStranicaC() throws IOException {
		BufferedReader bfr = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Unesite stranicu kvadra");
		try {
			stranicaC = Double.parseDouble(bfr.readLine());
		}catch (IOException e) {
			System.out.println("Pogresan unos. Unesite ponovo.");
			setStranicaC();
		}
	}
	
	public static double zapreminaKvadra(double a, double b, double c) {
		return a * b * c;
	}
}

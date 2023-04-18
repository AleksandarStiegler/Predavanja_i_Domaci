package Zadatak_2;

import java.io.*;

public class BankAccount {
	
	public double stanje;
	public double uplata;
	
	
	public BankAccount() {
		stanje = 0;
	}
	
	public double getStanje() {
		return stanje;
	}
	
	public void setStanje()throws Exception{
		try {
			BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Unesite stanje na racunu");
			double s = Double.parseDouble(bfr.readLine());
			this.stanje = s;
			
		}
		catch(Exception e ) {
			System.out.println("Pogresan unos. Unesite ponovo");
			setStanje();
		}
	}
	public double getUplata() {
		return uplata;
	}
	public void setUplata()throws Exception{
		try {
			BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Unesite uplatu");
			double u = Double.parseDouble(bfr.readLine());
			this.uplata = u;
			
		}
		catch(Exception e ) {
			System.out.println("Pogresan unos. Unesite ponovo");
			setUplata();
		}
	}
	
	public void opis() {
		System.out.println("Trenutno stanje na vasem racunu iznosi : "+(getStanje()+getUplata()));
	}
	

}

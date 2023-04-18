package Uredjaj;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Uredjaj {
	
	String marka;
	boolean ukljucen = true;
	
	Uredjaj(String m, boolean u){
		try {
			if (m != null) {
		
		this.marka = m;
		this.ukljucen = u;
			}
			else
				System.out.println("Greska: marka uredjaja ne moze biti null");
	}catch (Exception e) {
		System.out.println(e.getMessage());
	}
	}
	
	public String getMarka() {
		return marka;
	}
	
	public void setMarka() throws Exception{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Unesite marku uredjaja");
			String m = bfr.readLine();
			if(m.isBlank() || m.isEmpty()) {
				System.out.println("Greska: marka uredjaja ne moze biti null ili prazno polje. Unesite ponovo.");
				setMarka();
			}
			else {
				this.marka = m;
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
			
		}
	}
	
	public void ukljuci() {
		ukljucen = true;
	}
	public void iskljuci() {
		ukljucen = false;
	}
	
	public String ispisi() {
		if (ukljucen == true) {
			return "Marka uredjaja : "+getMarka()+" . Uredjaj je ukljucen.";
		}
		else {
			return "Marka uredjaja : "+getMarka()+" . Uredjaj je iskljucen.";
		}
	}

}

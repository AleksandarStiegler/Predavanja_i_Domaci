package Osoba;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Djak extends Osoba{
	
	String nazivSkole;
	int razred;
	
	public int getRazred() {
		return razred;
	}
	public void setRazred() throws Exception{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Unesite razred");
			this.razred = Integer.parseInt(bfr.readLine());
		}catch (Exception e ) {
			System.out.println("Greska. Razred moze biti samo celobrojnog tipa od 1 do 8. Unesite ponovo!");
			setRazred();
		}
	}
	
	public String getNazivSkole() {
		return nazivSkole;
	}
	
	public void setSkola() throws Exception {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite naziv skole");
		String s = bfr.readLine();
		if (s.isBlank() || s.isEmpty()) {
			System.out.println("Greska. Skola mora imati naziv. Unesite ponovo!");
			setSkola();
		} else {
			this.nazivSkole = s;
		}

	}
	public void ispisDjak() {
		super.ispisi();
		System.out.println("SKOLA : "+getNazivSkole()+"\tRazred : "+getRazred());
	}
	

}

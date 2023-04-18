package Zadatak02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sfera extends Predmet{
	
	private double poluprecnik;
	
	Sfera (char s, double spect, double r){
		super (s,spect);// Nasledjivanje parametrizovanog konstruktora klase Predmet
		this.poluprecnik = r;
	}
	
	public static double zapreminaSfere (double poluprecnik) {
		double zs ;
		
			zs = 4.0 * Math.PI * poluprecnik * poluprecnik * poluprecnik / 3.0;
		
		return zs;
	}
	// Da dodamo setere i gettere posto nisam uveo unos preko konzole
	
	public double getPoluprecnik() {
		return poluprecnik;
	}
	
	public void setPoluprecnik() throws IOException{
		BufferedReader bfr = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Unesite poluprecnik");
		try {
			
			poluprecnik = Double.parseDouble(bfr.readLine());
		}catch (IOException e ) {
			System.out.println("Pogresan unos. Unesite ponovo");
			setPoluprecnik();
		}
	}
	
	

}

package Osoba;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zaposleni extends Osoba {
	
	protected int brojRadneKnjizice;
	protected double prosecnaZarada;
	
	public int getBrRadKnjizice() {
		return brojRadneKnjizice;
	}
	
	public void setBrRadKnjizice() throws IOException{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Unesite broj radne knjizice.");
			this.brojRadneKnjizice = Integer.parseInt(bfr.readLine());
		}catch (Exception e ) {
			System.out.println("Greska: broj radne knjizice moze biti samo iz skupa prirodnih brojeva od 0,1...9. Unesite ponovo!");
			setBrRadKnjizice();
		}
		
	}
	
	public double getProsZarada() {
		return prosecnaZarada;
	}
	
	public void setProsZarada() throws IOException{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Unesite prosecnu zaradu.");
			this.prosecnaZarada = Integer.parseInt(bfr.readLine());
		}catch (Exception e ) {
			System.out.println("Greska: Prosecna zarada se moze prikazati samo brojevima. Unesite ponovo!");
			setProsZarada();
		}
		
	}

}

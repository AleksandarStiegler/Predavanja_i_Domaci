package Auto;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Auto {
	
	protected String naziv;
	protected String boja;
	protected int brojVrata;
	
	public void postaviVrednosti() throws Exception{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite naziv automobila");
		this.naziv = bfr.readLine();
		System.out.println("Unesite boju automobila");
		this.boja = bfr.readLine();
		System.out.println("Unesite broj vrata");
		try {
			this.brojVrata = Integer.parseInt(bfr.readLine());
		}catch (Exception e) {
			System.out.println("Greska. Broj vrata moze biti samo ceo broj. Unesite izpocetka " );
			postaviVrednosti();
		}
	}
	
	public String ispisi() {
		return "Naziv automobila : "+naziv+"\nBoja : "+boja+"\nBroj vrata : "+brojVrata;
	}

}

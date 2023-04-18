package Osoba;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TEST {

	public static void main(String[] args) throws Exception {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.println("Unesite da li je osoba u pitanju djak ili zaposlen/a. \n1. za Djak \n2. za Zaposlen");
		int n = Integer.parseInt(bfr.readLine());
		
		switch (n) {
		case 1 : 
			Djak dj = new Djak();
			dj.setIme();
			dj.setPrezime();
			dj.setDatumRodj();
			dj.setAdresa();
			dj.setSkola();
			dj.setRazred();
			dj.ispisDjak();
			break;
		case 2 : 
			Zaposlen z = new Zaposlen();
			z.setIme();
			z.setPrezime();
			z.setDatumRodj();
			z.setAdresa();
			z.setFirma();
			z.setOdeljenje();
			z.ispisiZaposlen();
			break;
		default :
		System.out.println("Pogresan unos. Unesite 1 ili 2.");
			
		}
		
	
	}

}

package Izuzetak;

import java.io.*;

public class Automobil {

	String naziv;
	String proizvodjac;
	int godiste;
	double potrosnja;

	public void unetiNazivAutomobila() throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite naziv automobila.");
		naziv = bfr.readLine();
	}

	public void unetiProizvodjacaAutomobila() throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite naziv prozivodjaca.");
		proizvodjac = bfr.readLine();
	}

	public void unetiGodisteAutomobila() {
		while (true) {
			try {
				BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

				System.out.println("Unesite godiste automobila.");
				godiste = Integer.parseInt(bfr.readLine());
				break;
			} catch (Exception e) {
				System.out.println("Pogresan unost. Unesite ponovo");
			}
		}
	}

	public void unetiPotrosnjuAutomobila() {
		try {
			BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Unesite potrosnju automobila.");
			potrosnja = Double.parseDouble(bfr.readLine());
		} catch (Exception e) {
			System.out.println("Pogresan unos.");
			unetiPotrosnjuAutomobila();
		}

	}
	public String opis() {
		return "Naziv : "+naziv+"\nProizvodjac : "+proizvodjac+"\nGodiste : "+godiste+"\nPotrosnja : "+potrosnja;             
	}

}

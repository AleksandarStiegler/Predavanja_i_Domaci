package Materijalna_Tacka;

import java.util.ArrayList;

public class NizTacaka {
	
	private int kapacitet ;
	
	
	private ArrayList<Tacka> nizT = new ArrayList<Tacka>(kapacitet);
	
	NizTacaka(){
		kapacitet = 5;
		nizT = new ArrayList<Tacka>(kapacitet);
		
	}

	NizTacaka(int j){
		this.kapacitet = j;
		this.nizT = new ArrayList<Tacka>(j);
	
	}
	public int brojTacakaUNizu() {
		return nizT.size();
	}
	
	
	public int dohvatiKapacitet() {
		return kapacitet;
	}
	
	public void dodajTacku(Tacka A) {
		if (nizT.size() == kapacitet) {
			this.kapacitet += 5;
			this.nizT.add(A);
			
		}else {
			this.nizT.add(A);
		}
		
	}
	
	public void najvecePrivlacenje(Tacka A) {
		Tacka pocetna = nizT.get(0);
		double maxSila = pocetna.privlacnaSila(A);
		
		for (int i = 1; i < nizT.size(); i++) {
			if(maxSila < nizT.get(i).privlacnaSila(A)) {
				maxSila = nizT.get(i).privlacnaSila(A);
				pocetna = nizT.get(i);
			}
		}
		System.out.println(pocetna.ispisiTacku());
	}
	
	public void ispisiNiz() {
		for (Tacka t : nizT) {
			System.out.println(t.ispisiTacku() + "\n");
		}
	}
	
	
	
	
}

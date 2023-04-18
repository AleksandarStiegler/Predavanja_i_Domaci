package Kupa;

public class NizKupa {
	
	private int brojKupa;
	private int kapacitetNiza;
	
	private Kupa [] kupe;
	
	public NizKupa(int i) {
		
		kupe = new Kupa[i];
		kapacitetNiza = i;
		brojKupa = 0;
		
	}
	
	public NizKupa() {
		kapacitetNiza = 5; // Podrazumevana vrednost
	}
	
	public int brojPopunjenihMesta() {
		return brojKupa;
	}
	
	public int kapacNiza() {
		return kapacitetNiza;
	}
	
	public NizKupa dodaj(Kupa A) {
		if (brojKupa == kapacitetNiza ) {
			System.exit(1);;
		}else {
			kupe[brojKupa++] = A;
			
		}
		return this;
	}
	
	public String popunjenIliNe() {
		if (brojKupa == kapacitetNiza) {
			return "Niz je popunjen.";
		}else {
			return "Niz nije popunjen.";
		}
	}
	
	// Kupa sa najmanjom zapreminom i njen indeks
	
	public int najmanjaZapremina() {
		int najmanji = 0;
		Kupa najmanjaZapremina = kupe [0];
		double temp = najmanjaZapremina.zapremina();
		for (int i = 1; i < brojKupa; i++) {
			if (temp > kupe[i].zapremina()) {
				najmanji = i;
				temp = kupe[i].zapremina();
			}
		}
		return najmanji;
	}
	
	

}

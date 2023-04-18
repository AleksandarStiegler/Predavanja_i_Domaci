package Adapter;

// 1. Prvo se implementira interfejs tipa prema kojem se vrsi prilagodjavanje
// To je interfejs koji klijent ocekuje

public class Curka_Adapter implements Patka {

	Curka curka;

	// 2. Dobiti referencu na objekat koji prilagodjavamo

	public Curka_Adapter(Curka curka) {
		this.curka = curka;
	}

	// 3. Implementacija metoda u interfejsu

	// Prevodjenje metode kvace() u metodu curlice() izmedju klasa

	public void kvace() {
		curka.curlice();
	}

	public void leti() {
		for (int i = 0; i < 5; i++) {
			curka.leti();
		}
	}

}

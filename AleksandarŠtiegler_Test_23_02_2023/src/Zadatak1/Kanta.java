package Zadatak1;

public class Kanta extends Valjak{
	
	double pocetnaPop;

	Kanta(double p, double h, double pp) {
		super(p, h);
		pocetnaPop = pp;
		
	}
	
	// Dohvatanje tecnosti
	public double getTecnost() {
		return pocetnaPop;
	}
	// Dolivanje?
	public void dolivanje() {
		System.out.println("Mozemo doliti jos "+(zapremina()-pocetnaPop));
	}
	// Ispitivanje da li je puna ili ne
	public void ispitivanje() {
		double puna = zapremina() - pocetnaPop;
		if (puna == zapremina()) {
			System.out.println("Kanta je puna");
		}else if (puna == 0) {
			System.out.println("Kanta je prazna");
		}
		else {
			System.out.println("Kanta nije ni potpuno puna ni potpuno prazna");
		}
	}
	
	// Dolivanje tecnosti
	
	public double DolivanjeTecnosti(double tec) {
		double trenutnaPop = pocetnaPop + tec;
		if (trenutnaPop >= zapremina()) {
			return zapremina();
		}else {
			return trenutnaPop;
		}
	}
	
	// Odlivanje tecnosti
	public double Odlivanje(double trenT, double odl ) {
		double odlivTec = trenT- odl;
		if (odlivTec > 0) {
			return odlivTec;
		}
		else {
			return 0;
		}
	}
	// Maksimalno presipanje ce zavisiti od zapremine kanti ukoliko je zapremina kante 1 veca
	// maksimalno presipanje ce biti zapremina 2-ge kante posto smo rekli da se sve ostalo 
	// preliva. U suprotnom max presipanje ce biti zapremina prve kante
	public double MaximalnoPresipanje(Kanta A) {
		if (zapremina() >= A.zapremina()) {
			return zapremina();
		}
		else {
			return A.zapremina();
		}
	}
	
	public void opisKante() {
		super.opis();
		System.out.println("Kanta je pocetno popunjena "+pocetnaPop);
		
	}
	
	
	

}

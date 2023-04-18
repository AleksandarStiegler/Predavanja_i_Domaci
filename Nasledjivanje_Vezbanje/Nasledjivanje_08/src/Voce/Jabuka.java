package Voce;

public class Jabuka extends Voce{
	/*Definisati klasu Jabuka koja je izvedena iz klase Vocekoja sadrži:
	 * •podatak vrsta tipa String,
	 * •konstruktor za postavljanje podataka,
	 * •metodu izracunajZaUplatu  kojom  se  računa  koliko  novca  treba  dati  pri  kupovini određene količine jabuka.
	 */
	String vrsta;
	Jabuka (String naziv, String boja, double cena, double kolicina, String vrsta){
		super(naziv, boja, cena, kolicina);
		this.vrsta = vrsta;
	}
	
	public double izracunajUplatu(double kol) {
		return cena * kol;
	}
	

}

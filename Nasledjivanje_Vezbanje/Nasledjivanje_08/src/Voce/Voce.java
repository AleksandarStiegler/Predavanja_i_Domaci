package Voce;

public class Voce {
	
/*	zaštićeni podatak naziv tipa String,
 * •zaštićeni podatak boja tipa String,
 * •zaštićeni podatak cena tipa double,
 * •zaštićeni podatak kolicina tipa double,
 * •konstruktor za postavljanje inicijalnih vrednosti podataka. 
 */

	protected String naziv;
	protected String boja;
	protected double cena;
	protected double kolicina;
	
	Voce (String n, String b, double c, double k){
		this.naziv = n;
		this.boja = b;
		this.cena = c;
		this.kolicina = k;
	}
	
}

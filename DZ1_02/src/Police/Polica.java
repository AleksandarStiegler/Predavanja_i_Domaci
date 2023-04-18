package Police;

import java.util.ArrayList;
import java.util.List;

public class Polica {
	/*
	 * 3. Napisati klasu polica i tom prilikom predvideti: 
	 * -stvaranje  police  sa zadatim  brojem  mesta  za  stavljanje  predmeta 
	 *  i zadatom dozvoljenom  najvećom težinom svih predmeta na polici, 
	 * -stavljanje predmeta na zadato mesto i na prvo slobodno mesto na polici, 
	 * -uzimanje predmeta sa zadatog mesta na polici (predmet se uklanja sa police)
	 * -pristup predmetu na datom mestu na polici (predmet ostaje na polici)
	 * -ispitivanje da li je neko mesto na polici prazno, 
	 * -dohvatanje podataka o stanju police (kapacitet, broj popunjenih mesta, 
	 *  nosivost, ukupan teret na polici i koliko tereta može još da se doda), 
	 * -sastavljanje tekstualnog opisa police, 
	 * -pražnjenje police. 
	 * U main klasi ispitati kreirane klase
	 */

	
	public int brojMesta;
	public double nosivost;
	
	
	// Posmatracu kao jedno mesto jedan predmet necu uzimati u obzir gabarit 
	// a sto se tice ukupne tezine razmisljam se i to da ne koristim i onda kada 
	// preteraju polica pukne i oni moraju da kupe novu
	// mada cu najverovatnije da stavim oba slucaja
	
	
	Polica(int bm, double nosiv){
		this.brojMesta = bm;
		this.nosivost = nosiv;
	}
	
	List<Double> polica = new ArrayList<Double>();
	
	// Posto mi je palo napamet da obradim oba slucaja sa i bez zastite uvescu jos 
	// jednu promenljivu koja ce da prati trenutnu tezinu 
	
	public double trenutnaTezina() {
		double trentez = 0;
		for(int i = 0; i < polica.size(); i++) {
			trentez += polica.get(i);
		}
		return trentez;
	}
	
	// postavljanje na prvo slobodno mesto
	
	public void prvoSlobodnoMesto(double tezina) {
		this.polica.add(tezina);
	}
	
	// postavljanje na odredjeno mesto
	// razmisljao sam da napravim da kada se postavlja ili uklanja na poziciji a posto 
	// indeksiranje ide od 0, da stavim a-1 kako bi mi skinuli ili postavili 
	// sa prave pozicije posto ako korisnik kaze zelim da postavim na 3ce mesto na polici 
	// on nece uneti 2 nego ce uneti 3. 
	// Pa sam ostavio ovde objasnjenje zasto sam odradio ovako , posto mi deluje logicnije

	public void odredjenoMesto(int a, double tezina) {
		this.polica.add(a - 1, tezina);
	}
	
	// uklanjanje sa odredjenog mesta
	
	public void uzmiPredmet(int a) {
		this.polica.remove(a-1);
	}
	
	// pristupanje odredjenom mestu na polici
	
	public double pristupiMestu(int a ) {
		return polica.get(a-1);
	}
	// Primetio sam da bi unos 0 moglo da pravi problem tako da cu to ograniciti na unosu
	// u glavnom programu
	
	// ispitivanje da li je mesto na polici prazno ili puno
	// Razmisljanje mi je ovako ako je uneseno mesto (indeks) veci od trenutne duzine (velicine)
	// liste automatski nam je poznato da je mesto prazno u suprotnom je puno jer uzimanje sa
	// police automatski brise to mesto u listi
	public boolean ispitajMesto(int a) {
	
		if (a > polica.size() ) {
			return false;
		}
		else {
			return true;
		}
		
	}
	
	// stanje police , ako sam dobro shvatio ovo bi trebalo da samo dobijemo kao neku
	// tekst poruku da vidimo gde stojimo i da bih to dobio potrebna su nam jos 2 getera
	// kako bismo znali koliko ima mesta na polici i njena nosivost ostalo smo do sada odradili
	
	public double brMesta() {
		return brojMesta;
	}
	public double nosivostPolice() {
		return nosivost;
	}
	
	public void Stanje() {
		System.out.println("Kapacitet : "+ brMesta()+"\nPopunjeno : "+polica.size()+
				"\nNosivost : "+nosivostPolice()+"\nTrenutna tezina na polici : "+trenutnaTezina()+
				"\nKoliko jos moze da se doda tereta : "+(nosivostPolice() - trenutnaTezina()));
	}
	
	// Sastavljanje tekstualnog opisa police, posto vec imamo napravljen opsirniji opis police 
	// kroz stanje ovde cu samo kratak opis koliko polica ima mesta i njena nosivost
	public String opis() {
		return "Polica ima "+brMesta()+" mesta i ima nosivost od "+nosivostPolice()+" kilograma";
	}
	
	// 
	public void isprazniPolicu() {
		this.polica.clear();
	}
	public int trenutnoPopunjeno() {
		return this.polica.size();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

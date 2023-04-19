package Zadatak19;

public class Gen <P> {
	
	/* Dakle ovo je genericka klasa. Sta to znaci? Pa to znaci da je parametrizovana.
	 * Ovo nam omogucava da radimo sa razlicitim tipovima podataka koristeci unapred 
  	 * kreirane metode koje ce zahvaljujuci parametrizciji moci da rade.
	 * Npr ako kreiramo neku povratnu metodu tipa int ona moze da vraca samo i samo int tip 
	 * podataka. Ali ako kreiramo genericku metodu dokle god napravimo objekat potrebnog
	 * tipa ona ce raditi i za druge tipove vrednosti.
	 */
	
	P obj; /* parametrizujemo jednu promenljivu P je proizvoljan tip koji cemo kasnije po potrebi
		    * menjati kao primera radi ako kazemo da a pripada skupu Realnih brojeva
		    * to znaci da a moze biti bilo koja vrednost unutar tog skupa tako mozemo i da 
		    * taj parametar pripada skupu tipova kao sto je Integer Double String Char itd
		    * i moze biti bilo koj od njih */
	
	Gen (P ob){ //konstruisemo jedan konstruktor
		this.obj = ob;
	}
	
	// Napravicemo getere i setere kao i metodu za ispis tipa podatka
	
	public P getOb() {
		return obj;
	}
	public void setOb(P o) {
		obj = o;
	}
	
	public void ispisTip() {
		System.out.println("Tip podataka je "+ obj.getClass().getName());
	}
	
}

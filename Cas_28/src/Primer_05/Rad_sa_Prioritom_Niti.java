package Primer_05;

public class Rad_sa_Prioritom_Niti {

	public static void main(String[] args) {
		
		
		A a = new A();
		B b = new B();
		
	// Kada odredjenoj niti zelite da dodate prioritet izvrsavanja , pozovite metodu
	// setPriority() koja je clan klase Thread.
	// void setPriority (nivo) ide od 1 - 10, po defaultu je 5, sto je veci broj veci prioritet	
	// Parametrom "nivo" zadajete prioritet niti za koju je metoda pozvana
	// Vrednost mora biti u opsegu izmedju MIN_PRIORITY i MAX_PRIORITY
	// vrednosti tih konstanti (Min i Max) izmedju 1 i 10.
	// Podrazumevana vrednost je 5 moze da se zada preko NORM_PRIORITY
		
		a.setPriority(Thread.MAX_PRIORITY);
		b.setPriority(Thread.MIN_PRIORITY);
		a.start();
		b.start();

	}

}

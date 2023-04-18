package Vektori;

public class Vektor {
	
	
	/*
	 * 1.Napisati klasu vektora realnih brojeva sa zadatim opsezima indeksa 
	 * i tom prilikom predvideti > 
	 * -stvaranje  vektora  s  opsegom  indeksa  od  zadate  donje  do  zadate  gornje  granice, 
	 *  od  1  do zadate  gornje granice i od 1 do 10. 
	 *  -postavljanje Idohvatanje vrednosti komponente sa zadatim indeksom, 
	 *  -izračunavanje skalarnog proizvoda dva vektora
	 *  -dohvatanje graničnih vrednosti indeksa.
	 *   U main klasi ispitati kreirane klase.
	 */

	public int gornjagr;
	public int donjagr;
	public double vrednost[];
	
	Vektor(){
		donjagr = 1;
		gornjagr = 10;
		this.vrednost = new double [10];
	}
	
	Vektor(int dg, int gg) {
		this.donjagr = dg;
		this.gornjagr= gg;
		this.vrednost = new double [gg - dg + 2];
	}
	
	public int dohvatiGornjuG() {
		return gornjagr;
	}
	
	public int dohvatiDonjuGr() {
		return donjagr;
	}
	
	public void postaviVrednost(int i, double v) throws IzuzetakVektor {
		int dg = dohvatiDonjuGr();
		int gg = dohvatiGornjuG();
		if (i >= dg && i <= gg) {
			vrednost[i] = v;
		}
		else {
			throw new IzuzetakVektor("Trazeni element ne postoji posto nije u granicama.");
		}
	}
	
	public double dohvatiVrednost(int i) {
		return vrednost[i];
	}
	
	// Da bismo mogli da skalarno mnozimo 2 vektora oni moraju imati iste granice
	// oko ovoga nisam najsigurniji posto sam se samo susretao sa 2d i 3d vektorima u matematici
	// i ako uzmemo da su pravci i, j, k ili samo i, j oba vektora trebaju biti u istom sistemu
	// kako bismo mnozili i jos postoji i ugao izmedju njih za koji se ovde ne trazi 
	// znam da kada je 90 stepeni kosinus tog ugla postaje 1 i onda mozemo da zanemarimo taj deo
	// ali sta sa ostalim slucajevima.? Posmatracu svako mnozenje vektora kao da su normalni
	// jedan na drugi ali cu ostaviti i metodu za racunanje ugla izmedju istih mozda zatreba 
	// u nekom trenutku
	
	public double skalarniProizvod(Vektor A) throws IzuzetakVektor {
		if (this.donjagr == A.donjagr && this.gornjagr == A.gornjagr) {
			double proizvod = 0;
			for (int i = donjagr; i <= gornjagr; i++){
				proizvod = proizvod + this.dohvatiVrednost(i) * A.dohvatiVrednost(i);
			}
			return proizvod;
		}
		else {
			throw new IzuzetakVektor("Vektori nisu istih granica.");
		}
	}
	
	public double kosinusUgla(Vektor A) throws IzuzetakVektor {
		if (this.donjagr == A.donjagr && this.gornjagr == A.gornjagr) {
			double proizvod = 0;
			double koren = 1;
			double kosinus = 0;
			for (int i = donjagr; i <= gornjagr; i++){
				proizvod += this.dohvatiVrednost(i)*A.dohvatiVrednost(i);
				koren = koren * Math.sqrt(Math.pow(this.dohvatiVrednost(i),2) + Math.pow(A.dohvatiVrednost(i), 2));
			}
			kosinus = proizvod / koren;
			return kosinus;
	}
		else {
			throw new IzuzetakVektor("Vektori nisu istih granica.");
		}
	}
}	
	
	
	
	
	
	
	
	
	


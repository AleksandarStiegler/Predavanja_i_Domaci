package Student;

public class Izuzetak extends Exception {
	
	private int indeksStudenta;
	
	Izuzetak(){
		indeksStudenta = -1;
	}
	
	Izuzetak (int indeks){
		super("Indeks studenta je van dozvoljenog opsega (1-99).");
		this.indeksStudenta = indeks;
	}
	
	public int getIndeksStudenta() {
		return indeksStudenta;
	}

}

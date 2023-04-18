package Zaposleni;

public class TestZaposleni {

	public static void main(String[] args) {
		
		
		Referent R = new Referent(160, 100, 10000);
		Programer P = new Programer(160, 120, 8200, 1500);
		
		System.out.println("Plata referenta iznosi : "+R.izracunajPlatu());
		System.out.println("Plata programera iznosi : "+ P.izracunajPlatu());
	}

}

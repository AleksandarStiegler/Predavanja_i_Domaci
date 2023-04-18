package Nabrajanje_03;

	/*
	 * Nabrajanje je vrsta klase. Instanca klase ne pravi se pomocu
	 * kljucne reci new. Rezervisana rec Enum definise klasu
	 * Svaka konstanta definisana u nabrajanju je objekat ciji tip
	 * je to isto nabrajanje.
	 */

public class Main {

	public static void main(String[] args) {
		
		Boja b;
		
		System.out.println("Zelena boja , udeo : "+Boja.Zelena.getUdeo());
		
		System.out.println();
		
		System.out.println("Sve boje : \n");
		for(Boja c : Boja.values()) {
			System.out.print(c+" "+c.getUdeo()+"; ");
		}
		
	}

}

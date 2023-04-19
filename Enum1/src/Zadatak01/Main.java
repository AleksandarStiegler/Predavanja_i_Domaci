package Zadatak01;

public class Main {

	public static void main(String[] args) {
	
		Boje b;
		
		System.out.println("Udeo zelene boje : "+ Boje.Zelena.getUdeo());
		
		Boje x[] = Boje.values();
		System.out.println("Sve boje : ");
		for(Boje a : Boje.values()) {
			System.out.print(a + " " + a.getUdeo()+", ");
		}
		// Dakle ako ne stavimo a.getUdeo() u ispisivanje, dobijamo samo konstante u Enumu
		// tj listu bez vrednosti unutar zagrada. Zbog toga dodajemo jos taj deo kako
		// bismo dobili i postavljene vrednosti
	}

}

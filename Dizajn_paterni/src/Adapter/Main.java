package Adapter;

public class Main {
	
	static void testPatka(Patka patka) {
		patka.kvace();
		patka.leti();
	}

	public static void main(String[] args) {
		
		Divlja_Patka patka = new Divlja_Patka();
		
		Curka curka = new Divlja_Curka();
		
	// Umotavamo Curku u Curka_Adapter, zahvaljujuci kome ce izgledati kao patka
		
		Patka Curka_Adapter = new Curka_Adapter(curka);
		
		System.out.println("Curka : ");
		curka.curlice();
		curka.leti();
		
		System.out.println("Patka : ");
		testPatka(patka);
		
		System.out.println("AdapterCurka");
		testPatka(Curka_Adapter); // Metoda test patka ne zna da je dobila Curku
								  // prerusenu u Patku. New Assassins Creed
		

	}

}

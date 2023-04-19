package Zadatak17;

public class Main {

	public static void main(String[] args) {
		
		// posto je slozeniji izraz koji ne mozemo napisati unutar jedne linije
		// onda desnu stranu stavljamo u { zagrade }
		
		ObrniString obs =  (s) -> { 
			String rez = " ";
			for (int i = s.length() - 1; i >= 0; i --) {
				rez += s.charAt(i);
				
			}
			return rez;
		};
		
		System.out.println("Provera" + obs.obrni("Provera"));
		System.out.println("Milan Kitanovic obrnuto "+ obs.obrni("Milan Kitanovic"));
		
		

	}

}

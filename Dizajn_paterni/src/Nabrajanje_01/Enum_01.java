package Nabrajanje_01;

public class Enum_01 {
	
	// Nabrajanje je lista imenovanih vrednosti koje definisu nov tip podataka
	// i njegove dozvoljene vrednosti. To znaci da navrajanje moze da sadrzi
	// samo neku od vrednosti koje su navedene na listi. Druge vrednosti 
	// nisu dozvoljene !!!
	

	public static void main(String[] args) {
	
		Boje b; // Dakle nema new nego posmatramo samo kao prost tip ( int a)
		
		b = Boje.Crvena; // ekvivalent int a = neka vrednost tipa 5;
		
		System.out.println("Boja : "+b);
		
		b = Boje.Plava;
		
		if (b == Boje.Plava) {
			
			System.out.println("Plava");
		}
		switch (b) {
		case Crvena :
			System.out.println("Crvena");
			break;
		case Zelena : 
			System.out.println("Zelena");
			break;
		case Zuta :
			System.out.println("Zuta");
			break;
		case Plava : 
			System.out.println("Plava");
			break;
		case Crna :
			System.out.println("Crna");
			break;
		case Narandzasta : 
			System.out.println("Narandzasta");
			break;
		case Bela : 
			System.out.println("Bela");
			break;
		}

	}

}

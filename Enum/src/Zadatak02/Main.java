package Zadatak02;

public class Main {

	public static void main(String[] args) {
		
		Boje2 b;
		
		System.out.println("Boje : ");
		Boje2 nizBoja[] = Boje2.values(); // values() niz vrednosti koje nam se nalaze  
		for(Boje2 a : nizBoja) {		  // skupu konstanti koje su definisane u enumu
			System.out.print(a + " ");
		}
		
		Boje2 c;
		c = Boje2.valueOf("Crna");
		System.out.println();
		System.out.println("Boja "+c);
		b = Boje2.valueOf("Bela");
		System.out.println("Boja "+b);
	}

}

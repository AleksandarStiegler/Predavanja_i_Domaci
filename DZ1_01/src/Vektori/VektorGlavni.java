package Vektori;

public class VektorGlavni {

	public static void main(String[] args) throws IzuzetakVektor {
	
		try {
		Vektor Va = new Vektor(1, 3);
		Vektor Vb = new Vektor(1, 3);
		Vektor Vc = new Vektor();
		
		
		Va.postaviVrednost(1, 1.5);
		Va.postaviVrednost(2, 1.75);
		Va.postaviVrednost(3, 2.15);
		
		Vb.postaviVrednost(1, 2.0);
		Vb.postaviVrednost(2, 2.33);
		Vb.postaviVrednost(3, 3.66);
		
		
		
		double rezultujuciSkalar = Va.skalarniProizvod(Vb);
		System.out.println("Skalarni proizvod vektora Va i Vb iznosi : "+rezultujuciSkalar);
		
		System.out.println("Granicne vrednosti vektora Va : "
				+ "\nDonja granica : "+Va.dohvatiDonjuGr()+"\nGornja granica : "+Va.dohvatiGornjuG());
		System.out.println();
		
		System.out.println("Granicne vrednosti vektora Vb : "
				+ "\nDonja granica : "+Vb.dohvatiDonjuGr()+"\nGornja granica : "+Vb.dohvatiGornjuG());
		System.out.println();
		
		System.out.println("Granicne vrednosti vektora Vc : "
				+ "\nDonja granica : "+Vc.dohvatiDonjuGr()+"\nGornja granica : "+Vc.dohvatiGornjuG());
		
		}catch (IzuzetakVektor e) {
			System.out.println(e.getMessage());
		}

	}

}

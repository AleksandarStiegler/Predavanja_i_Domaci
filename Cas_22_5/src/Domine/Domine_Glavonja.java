package Domine;

public class Domine_Glavonja {

	public static void main(String[] args) {
		
		Domine d1 = new Domine(3, 4);
		Domine d2 = new Domine(4, 5);
		
		System.out.println(d1.opis());
		
		d1.zamena();
		System.out.println("Novi raspored polja "+d1.opis());
		
		
		System.out.println(d1.iste(d2));
		
	}

}

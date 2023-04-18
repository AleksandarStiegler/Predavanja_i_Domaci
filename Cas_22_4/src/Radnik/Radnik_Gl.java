package Radnik;

public class Radnik_Gl {

	public static void main(String[] args) {
		
		Radnik r1 = new Radnik("Pera",100,150000);
		Radnik r2 = new Radnik("Mika", 80, 120000);
	
		System.out.println("Prihod prvog radnika "+r1.getPrihod());
		System.out.println("Prihod drugog radnika "+r2.getPrihod());
		System.out.println("Ime/Plata : "+r1.opis());
		System.out.println("Ime/Plata : "+r2.opis());
		
	}	
}

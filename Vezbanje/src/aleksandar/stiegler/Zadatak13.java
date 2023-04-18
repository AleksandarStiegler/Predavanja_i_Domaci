package aleksandar.stiegler;

public class Zadatak13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Poslednji primer ima ogroman text i vezan je za fiziku i otpornost materijala
		// tako da cu ga preskociti jer ovakav zadatak mogu samo da resim ako nam daju 
		// formule koje mozemo da koristimo inace nista od toga
		// tako da cu da odradim neki drugi sa nekim funkcijama
		
		// Napisati program za testiranje aritmetickih operatora 
		// +,-,*,/,% nad operandima 2 i 5
		
		byte z, r, m, cd, od;
		z = 2 + 5;
		r = 2 - 5;
		m = 2 * 5;
		cd = 5 / 2;
		od = 5 % 2;
		
		// Stampanje rezultata
		System.out.println("Rezultati operacija na operandima 2 i 5 "
				+"\n Zbir = "+z+"\nRazlika = "+r+"\nProizvod = "+m+
				"\nCelobrojno deljenje = "+cd+ "\nOstatak pri deljenju ="+od+ 
				"\nRealno deljenje = "+(5.0/2.0));
		
	}

}

package RazgranateStrukture;

import java.util.Scanner;

public class Primer12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Napisati program kojim se proverava da li je tacka unutar pravougaonika
		
		// E sad posto je ovo proizvoljno a ne neki zadat pravougaonik trazicemo da korisnik sam unese vrednosti za tacke
		// i vrednost pravougaonika, tj vrednosti na y i x osi, 
		
		// Unos podataka
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite koordinatu x posmatrane tacke :");
		double x = sc.nextDouble();
		System.out.print("Unesite koordinatu y posmatrane tacke :");
		double y = sc.nextDouble();
		System.out.print("Unesite koordinatu pravougaonika x1 :");
		double x1 = sc.nextDouble();
		System.out.print("Unesite koordinatu pravougaonika x2 :");
		double x2 = sc.nextDouble();
		System.out.print("Unesite koordinatu pravougaonika y1 :");
		double y1 = sc.nextDouble();
		System.out.print("Unesite koordinatu pravougaonika y2 :");
		double y2 = sc.nextDouble();
		
		sc.close();
		
		// Resavanje problema
		// Tacka ce se nalaziti UNUTAR!!!! pravougaonika ako je koorinata po x unutar opsega izmedju x1 i x2 I ako je 
		// izmedju opsega y1 i y2. U suprotnom tacka je van pravougaonika. Tacka na pravougaoniku (tj. na liniji) se takodje
		// smatra van posto ona nije unutra
		
		if ((Math.max(x1, x2) > x) && (x > Math.min(x1, x2)) && (Math.max(y1,y2) > y) && (y > Math.min(y1, y2)))
				
		{
			System.out.println("Tacka se nalazi u pravougaoniku");
		}
		else
		{
			System.out.println("Tacka je van pravougaonika");
		}
		// Ovako nije tacno posto u zavisnosti od toga koja je koordinata veca nas program moze da daje pogresne vrednosti
		// tako da bi trebalo prvo odrediti koje je od x1 i x2 kao i y1 i y2 vece pa postaviti im mesta tako da je x2 > x1
		// i y2 > y1 inace nema nista od tacnog ispitivanja
		
		// Kao i sto sam mislio uvodjenjem funkcije Math.max i Math.min eliminise potrebu da vrtimo i prebacujemo koja je vrednost
		// manja a koja veca. Problem je bio vrlo jednostavan niko ne garantuje da ce korisnik prvo da unese manju vrednost pa onda
		// vecu moze da ih unese kako ih posmatra ili kako god ali ako uvedemo samo ovu Math funkciju mi smo eliminisali
		// tu mogucnost greske jer ce onda uvek opseg da se posmatra kako treba

	}

}

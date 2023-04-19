package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SestiPrimer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Sesti primer je  Primer 4 slajd 26
		// e sad za ovo je potrebno poznavanje malo fizike mada verovatno nece biti slozeni zadatci 
		// ali iskreno ovo nije tezak slucaj pa je moguce da se pojavi
		
		// Unos podataka
		// F - intenzitet sile
		// a - alfa ugao u stepenima , obratiti paznju na to da li radi program ako se unese u stepenima
		// za sada necu obracati paznju na to dok ne dodjem do kraja pa cemo da vidimo
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat ("#.###");
		
		System.out.println("Unesite silu u kN F = ");
		double F = input.nextDouble();
		System.out.println("Unesite ugao a u stepenima a = ");
		double a = input.nextDouble();
		 a = Math.toRadians(a); // ako ostavimo u stepenima resenje nece biti ispravno!!!!
		
		// Resavanje problema, e sad potrebno je naci Dekartove koordinate sile po x i y
		
		double X = F*Math.cos(a); 
		double Y = F*Math.sin(a);
 
		// Stampanje rezultata
		
		System.out.println("Koordinata X = "+ df.format(X));
		System.out.println("Koordinata Y = "+ df.format(Y));
		
		// e sad da vidimo jel radi sve kako treba
		// dobio sam neko resenje bez pretvaranja u Radijanse ali to obavezno moram da prodjem kroz neki primer moze da bude
		// e sad resenje je negativno i po x i po y sto je nemoguce jer ugao koji je zadat je 60 sto znaci prvi kvadrant
		// samim tim resenje i po y i po x mora biti pozitivno, dakle nas problem je stepen ajde da dodamo jos jednu
		// naredbu za prebacivanje u radijanse pa da vidimo
		
		// sad sam dobio pozitivne vrednosti za obe koordinate tako da radi
		
	}

}

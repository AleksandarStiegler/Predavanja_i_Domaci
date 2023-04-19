package aleksandar.stiegler;

import java.util.Scanner;

public class PrviPrimer {

	public static void main(String[] args) {
		// TODO Auto-generated method 
/* OStavicu ovde komentar ne u svakom primeru ali komentar ce 
 * nositi eksplicitni oblik zadatka onda cu da ga prebacim
 * u matematicki izraz koji java moze da koristi i na kraju ce biti 
 * ispisan program koji cu pokretati za vezbu */
		
		// za pocetak nesto prosto 
		// 1) ab + bc
		// a*b + b*c
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite vrednost za a =  ");
		double a = input.nextDouble();
		System.out.println("Unesite vrednost za b =  ");
		double b = input.nextDouble();
		System.out.println("Unesite vrednost za c =  ");
		double c = input.nextDouble();
		 
		System.out.println("Vrednost izraza za prvi deo je = " + (a*b+a*c));
		
		// da ne bih otvarao za svaki deo novu clasu odradicu ovde sve pod primere
		// u jednom zadatku. Necu obracati paznju na ektremne slucajeve kao sto je 
		// deljenje sa 0 posto iako znam kako bih to mogao da resim u blokovnom algor.
		// ne znam jos uvek komandu za if petlju ili while
		// mada sve jedno posto je cilj ove vezbe samo da se upoznam sa matematickim
		// izrazima i njihovim pisanjem kao i vezbanje koriscenja scannera
		// posto jos uvek gresim ili zaboravim ispravne komande
		
		// 2) 3((2a-8b)/c) generalno ovo je vec matematicki zapis posto sam shvatio da 
		// nemam bas mogucnosti da napisem kao u wordu, mozda i ima ali jos nisam nasao
		// nije kao da imam vremena na pretek a nije ni bitno posto tako nesto sve jedno 
		// ovde ne moze da se odradi
		// posto vec imamo a, b i c ne vidim razlog zasto to ne bismo mogli da iskoristimo
		// odmah za sledeci pod primer
		
		System.out.println("Vrednost izraza za drugi deo je = " + (3*(2*a-8*b)/c));
		
		// 3) (a+k)*(3k+1)/(k-3)
		// e sad probacu ovako i sa jos jednom zagradom da bih video da li je razlika u
		// konacnom izrazu. Ne bi trebalo da ima nikakve razlike posto su racunske 
		// operacije mnozenja i deljenja iste "starosti"
		
		System.out.println("Unesite vrednost za promenljivu k ");
		double k = input.nextDouble();
		 
		System.out.println("Vrednost izraza za treci deo je = " + ((a+k)*(3*k-1))/(k-3));
		
		// pored Scannera moze da se koristi i BufferedReader
		// ali cu ja iskreno da se drzim Scannera jos neko vreme dok makar ne savladam 
		// ovaj nacin
		
		// po ovome sto sam video dodatne zagrade u izrazu nisu bile potrebne ali ih necu 
		// obrisati nek ostane kao podsetnik
		// dakle (a+k)*(3*k-1)/(k-3) je bilo sasvim korektno i dodatne zagrade su 
		// redudantne
		
		
		
		
 

	}

}

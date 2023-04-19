package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PetiPrimer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ovo su sve primeri koji su odradjeni na predavanjima
		// Tako da necu da prepisujem postavku zadataka vec cu direktno da ih resavam uz napomenu koji je primer u pitanju
		// Primer 3 slajd 21   izracunati funkciju f za zadate vrednosti x , y , z
		// Jos cu se drzati Scanner unosa danas a sutra cu probati BufferedReader kad malo budem spremniji
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		
		// Unos vrednosti potrebnih za resavanje funkcije
		
		System.out.println("Unesite vrednost za x = ");
		double x = input.nextDouble();
		System.out.println("Unesite vrednost za y = ");
		double y = input.nextDouble();
		System.out.println("Unesite vrednost za z = ");
		double z = input.nextDouble();
		
		// Resenje funkcije 
		
		double f = Math.pow(((x + y + 3*z)/(2*x)),4) - x/(x + 3*z - y);
		
		// e sad posto jos ne znam kako da postavim petlje extremne slucajeve kao sto je x=0 i x+3z-y=0 cu preskociti
		
		// Stampanje rezultata
		
		System.out.println(" Vrednost funkcije f =  " + df.format(f));
		
		// OK sta je veoma bitno postavljanje zagrada a pri tome mislim ispod razlomacke crte pogotovo
		// prvo sam napisao bio 2*x i program je radio bez problema, ali to sto nije prijavljivao gresku
		// ne znaci da je radio kako treba, jer kao sto kazemo ako ne mozemo da nadjemo gresku to ne znaci da 
		// nje nema nego samo da je jos nismo nasli
		// U mom slucaju rezultati su dobijeni ali nisu bili tacni tako da sam ispravio izraz i dobio tacan rezultat
		// Dakle ispravno je bilo  (2*x)
		
		
	}

}

package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DrugiPrimer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// drugi primer ce isto imati 2 dela i iskreno zaista je komplikovan
		// tako da cilj je da naucimo da pisemo math. oblik do nekle posto ima dosta
		// komandi i pravila naravno ne znam sva ali tu je vezbanje iz tog razloga
		// kao i prethodni primer pokusacu da napisem kod koji ce zapravo raditi
		// odnosno izracunavati trazene izraze
		
		Scanner input = new Scanner(System.in);
		
		// ajde da vidimo da predstavimo resenje u komentarima pa da kodiramo
		// 1) ln,koren od apsolutne vrednosti (sin(a + e na x/2)) + cos(b- arctgx/2)
		// i= Math.log(Math.sqrt(Math.abs(Math.sin(a + Math.exp(x/2)) +
		// + Math.cos(b - Math.atan(x/2)))))
		// Pogledao sam resenje koje je napisano na casu i na prvi pogled tacno je
		// nisam bio siguran kako se e radi pa sam to pogledao ali je Math.exp
		// Sad da to napisemo kao program
		
		System.out.println("Unesite vrednost za a = ");
		double a = input.nextDouble();
		System.out.println("Unesite vrednost za b = ");
		double b = input.nextDouble();
		System.out.println("unesite vrednost za x = ");
		double x = input.nextDouble();
		
		// Verovatno bih mogao izraz da direktno predstavim u resenju ali posto je 
		// dosta dugacak lakse cu ga ispratiti uz dodatni korak, nije elegantno
		// ali bitno je da je tacno za sada, ima vremena da naucimo da pisemo krace
		// i lepse 
		
		double R ;
		R = Math.log(Math.sqrt(Math.abs(Math.sin(a + Math.exp(x/2)+ Math.cos(b-Math.atan(x/2))))));
		
		// Izraz ne pokazuje nikakvu sintaksnu gresku tako da ce napisani program raditi a da li je tacan
		// e to je potpuno drugi problem kome se u ovom trenutku opste necu posvecivati posto cilj ovog vezbanja 
		// je da naucim kako da ih napisem a ne da li su i tacne ( pa donekle ) naravno prostije izraze cu proveriti
		
		//System.out.println("Vrednost izraza R = " +df.format(R));
		
		
		// Profesor je pokazao nacin kako da lepse napisemo ove vece izraze pa ajde i to da provezbam
		
		DecimalFormat df = new DecimalFormat("#.##");
		
		// ajde da vidimo da li radi
		// bez formatiranja rezultat je bio R = -1.610873402611907
		// da vidimo kakav ce rezultat biti prikazan u novom slucaju
		// dakle moramo malo da promenimo kod
		// Pojavila se greska nisam mogao da formatiram izraz posto je df format unesen posle naseg resenja
		// tako da cu staviti prvobitno resenje kao komentar i napisati novo da vidimo onda
		
		System.out.println("Vrednost izraza R = " + df.format(R));
		
		// U ovom slucaju nemamo nikakav problem i nase formatiranje radi kako treba  :)
		
		
		
		// Drugi izraz nazovimo ga T
		// ln koren od ( tg na kvadrat od x plus 0,2 + cosy/ e na xy
		// Math.log(Math.sqrt(Math.pow(Math.tan(x),2) + Math.cos(x)/Math.exp(x*y)))
		// Da probamo to u programu koristicemo postojece x i y
		
		double T ;
		
		System.out.println("Unesite vrednost za y =");
		double y = input.nextDouble();
		
		T = Math.log(Math.sqrt(Math.pow(Math.tan(x),2) + 0.2 + Math.cos(y)/Math.exp(x*y)));
		// Imamo gresku u prethodnom zadatku korisceni su a , b i x nema y pa mormao da je uvedemo
		// Posto je to pridodato nas zadatak ne prijavljuje nikakvu gresku
		// Jos bi bilo FANTASTICNO da nisam zaboravio da ispisem rezultat jos stoji napomena u editoru koja
		// pokazuje da T nije iskorisceno nigde, izgleda da me stize umor
		
		System.out.println("Vrednost izraza T = "+ df.format(T));
	
		
		
		
		
		

	}

}

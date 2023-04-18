package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Napisati program za pretvaranje temperature iz skale Celzijusa u 
		// Kelvinovu u Farenhajtovu temperaturu.
		// Van ovoga mozemo i da se igramo pa da obrcemo sto cu i da uradim posle
		
		// C - Celzijus stepen
		// F - Farenhajt stepen
		// K - Kelvin stepen
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Unesite temperaturu u celzijusima = ");
		float C = input.nextFloat();
		float F, K;
		F = C*1.8f + 32;
		K = C + 273.15f;
		
		K = C +273.15f ;
		//C = K - 273.15f;
		//F = 1.8f*C +32; // Da smo prebacivali u C iz F islo bi C= (F - 32)/1.8f
		
		System.out.println("Za unetu temperatu "+ df.format(K)+ " \nFahrenheit-ova skala ce pokazati "+ df.format(F)+" stepena Fehrenheit-a,\n dok ce Kelvinova skala prikazivati "+ df.format(K)+" stepeni Kelvina");
		
		// e sad posto smo videli kako ovo radi stavicu resenje p i racun pod komentarima i promenicu
		// tekst da iz K ide u F, posto nema ili barem ne znam direktnu
		// korelaciju izmedju 2 skale ici cu prvo u stepene a zatim u F
		
		
		input.close();
		
		
	}

}

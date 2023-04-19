package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TreciPrimer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ovaj primer ima 4 pod zadatka pa cu ih zvati 1 deo, 2 deo itd
		// iskreno nema poentu pokusati ovde napisati njihov izgled barem za pod 1 mnogo razlomackih crta jedna ispod druge
		// ali ajde da probamo tekstom
		// (a-b) pa ide prva razlomacka linija ispod je c+ pa ide a kroz ponovo c + b kroz (c-b)
		// za prethodna 2 c nije bilo zagrade zato sto nije ceo izraz pod razlomkom samo u prvom delu "a" pa onda u drugom "b"
		// Ne znam da li sam uspeo da prikazem sta sam hteo ovo je prvi zadatak sa 4 casa
		
		// (a-b)/(c + a / ( c + b /(c-b)))
		
		// Ajde da vidimo
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite vrednost za a ");
		double a = input.nextDouble();
		System.out.println("Unesite vrednost za b ");
		// Dok sam kucao primetio sam nesto zanimljivo. Planirao sam da ubacim java.util.Scanner kasnije posto to mozemo da 
		// odradimo lagano kad izaberemo to kao jedno ponudjeno resenje ali je ono samo bilo uvezeno kad sam napisao drugi red
		// double a = input itd , provericu u narednim primerima da li stvarno tako radi
		double b = input.nextDouble();
		System.out.println("Unesite vrednost za c ");
		double c = input.nextDouble();
		
		System.out.println("Resenje prvog dela je " + (a-b)/(c+a/(c+b/(c-b))));
		
		// Posto je ovakav zapis realno ruzan malo cemo da ga formatiramo
		DecimalFormat df = new DecimalFormat("#.###");
		// 2) (tgx + 1)(X na 4n + 4x + 1)
		// (Math.tan(x) + 1)*(Math.pow(x,4n) + 4*x + 1)
		
		System.out.println("Unesite vrednost za x ");
		double x = input.nextDouble();
		System.out.println("Unesite vrednost za n ");
		double n = input.nextDouble();
		
		System.out.println("Resenje drugog dela je " + df.format((Math.tan(x)+1)*(Math.pow(x,4*n)+4*x + 1)));
		
		// Resenje drugog dela izgleda daleko lepse
		
		// 3) (( x na y) / ( y na x)) pa sve na kvadrat pa / z na y/x
		// Treba da uvedemo jos y i z za zadatak
		
		System.out.println("Unesite vrednost za y ");
		double y = input.nextDouble();
		System.out.println("Unesite vrednost za z ");
		double z = input.nextDouble();
		
		// resenje  Math.pow((Math.pow(x,y)/Math.pow(y,x)),2)/Math.pow(z,y/x)
		
		System.out.println("Resenje treceg dela je " + df.format(Math.pow((Math.pow(x, y)/Math.pow(y, x)),2)/Math.pow(z,y/x)));
		// Uff mnogo zagrada izgubih se malo i preskocio sam jednu ali tu je editor da pripomogne :)
		
		// 4) koren (sin ( koren od x + x na 3ci))/ ln na 2 od ( sin (x na 2))
		
		// sve potrebne promenljive smo vec uneli kroz prethodne delove tako da mozemo odmah na resenje 
		
		System.out.println("Resenje cetvrtog dela je " + df.format((Math.sqrt(Math.sin(Math.sqrt(x)+ Math.pow(x, 3))))/Math.pow(Math.log(Math.sin(x*x)),2)));
		
		// e sad ovako dok ne udjem u stos bice problem pracenje zagra1da ali editor tu pomaze kad nisi siguran gde je greska
		// idi sa pocetka i broji zagrade i vidi gde je nisi zatvorio
		// Ovaj primer ima mnogo uslova koji treba da se ispune kako bi zadatak zapravo bio validan
		// ispod razlomka ne sme da ide 0, prirodni logaritam ln mora da bude veci od 0 i da bude sin x na kvadrat bude razlicit od 1
		// kada se ispune ovi uslovi radice kako treba
		
		
	}

}

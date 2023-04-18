package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Napisati program za izracunavanje sinusa i kosinusa ugla zadatog u radijanima
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		
		/*System.out.println("Unesite vrednost ugla u radijanima rad =");
		double rad = input.nextDouble();
		double x = Math.sin(rad);
		double y = Math.cos(rad);
		rad = Math.toDegrees(rad);
		System.out.println("Sinus zadatog ugla je sinx ="+ df.format(x)+" , a cosinus cosx = "+df.format(y));
		System.out.println(rad);*/
		// e sad van ovoga da je vrednost bila zadata u stepenima prvo bismo morali da pretvorimo ugao 
		// u radijane pa cu to da odradim u nastavku da probamo malo samo da vidimo prvo
		// koji ugao cemo da koristimo ajde da unesemo 3.14 u radijanima i da vidimo
		// koliko je to u stepenima pa da onda idemo obrnuto da vidimo hocemo li dobiti
		// isti rezultat sin= 0.002 zbog zaorkuzivanja  cos = -1 ugao 179.9087476710785 zaokruzimo na 179.909
		// stavicemo sve u jedan blokovni komentar 
		
		System.out.println("Unesite vrednost ugla u stepenima alfa =");
		double alfa = input.nextDouble();
		// posto je ugao u stepenima ukoliko ne prebacim u radijane dobicu lose rez.
		// ajde da vidimo
		
		alfa = Math.toRadians(alfa); // dodato naknadno
		double x = Math.sin(alfa);
		double y = Math.cos(alfa);// unecu 179.909 pa da vidimo
		// Sinus zadatog ugla je sinx =-0.743 , a cosinus cosx = -0.669 
		// ovo su dobijene vrednosti kao sto vidimo program radi ali zato sto nismo
		// preveli u radijane dobili smo netacne rezultate sad cu da dodam
		// konverziju u radijane pre resavanja pa da vidimo onda
		// Sinus zadatog ugla je sinx =0.002 , a cosinus cosx = -1
		// u ovom slucaju smo dobili resenje kako treba
		
		System.out.println("Sinus zadatog ugla je sinx ="+ df.format(x)+" , a cosinus cosx = "+df.format(y));
		input.close();
	}

}

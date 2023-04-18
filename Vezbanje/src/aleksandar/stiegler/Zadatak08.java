package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ucitati 2 tacke M1(x1,y1) i M2(x2,y2) i izracunati pojedinacnu udaljenost
		// tacaka od koordinatnog pocetka
		// za ovo koristimo Pitagorinu teoremo jer ako znamo koordinate po x i 
		// koordinate po y mozemo naci dijagonalu koja ce zapravo predstavljati 
		// udaljenost od koordinatnog pocetka to jest od 0 tacke
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		
		// Unost podataka
		
		System.out.println("Unesite vrednost kordinate x za prvu tacku X1 = ");
		double X1= input.nextDouble();
		System.out.println("Unesite vrednost kordinate y za prvu tacku Y1 = ");
		double Y1 = input.nextDouble();
		System.out.println("Unesite vrednost kordinate x za drugu tacku X2 = ");
		double X2 = input.nextDouble();
		System.out.println("Unesite vrednost kordinate y za drugu tacku Y2 = ");
		double Y2 = input.nextDouble();
		
		// resavanje problema
		
		double d1 = Math.sqrt(X1*X1+Y1*Y1);
		double d2 = Math.sqrt(X2*X2 + Y2*Y2);
		
		System.out.println("Udaljenost prve tacke od koordinatnog pocetka je "+df.format(d1)+"\n a druge tacke je "+df.format(d2));
		// ajmo da dodamo i udaljenost izmedju 2 tacke
		// ako bismo to radili i ako konstruisemo trougao nad njima hipotenuza 
		// ce biti rastojanje tako da ce resenje biti sledece
		// d3 = koren iz ( (X1-X2) na kvadrat + (Y1-Y2) na kvadrat)
		// sto se tice unosa nisam znao ali mogao sam da stavim unos obe tacke
		// pod jednim stampanjem kao koordinate mada ovako jasno definisemo koja
		// je koja tacka meh mnogo elegantnije da sam isao direktno obe
		// znanje je cudo!!!!!
		
		double d3 = Math.sqrt(Math.pow(X1-X2, 2)+Math.pow(Y1-Y2, 2));
		System.out.println("Medjusobno rastojanje tacaka je "+df.format(d3));
		
		
		
		
		input.close();
		
		
	
		

	}

}

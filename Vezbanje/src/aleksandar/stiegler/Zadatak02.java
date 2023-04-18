package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		// Zadatak 2 nije sa predavanja nego samo zadatak koji cu da odradim ovako
		// Napisati program koji ce izracunati zapreminu i povrsinu lopte 
		// poluprecnika r i zapreminu i povrsinu valjka koristeci poluprecnik lopte
		// za poluprecnik osnove valjka i koji ce ici iz 2 najudaljenije medjusobne tacke
		// Zatim pronaci povrsinu i zapreminu dela koji ostaje 
		
		// Pl - Povrsina lopte
		// Pv - Povrsina valjka
		// Vl - Zapremina lopte
		// Vv - Zapremina valjka
		// r - poluprecnik osnove valjka i lopte
		// H - visina valjka , e sad posto smo rekli da je visina valjka razdaljina
		// izmedju 2 medjusobno najudaljenije tacke lopte to je zapravo precnik lopte
		// dakle H = 2r
		
		// Unos podataka
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		
		System.out.println("Unesite vrednost za poluprecnik r = ");
		double r = input.nextDouble();
		
		// Resavanje problema
		double Pl,Pv,Vl,Vv,H;
		Pl = 4*r*r*Math.PI;
		H = 2*r;
		Pv = 2*r*Math.PI*(r+H);
		Vl = 4*r*Math.PI/3;
		Vv = 2*r*r*Math.PI*H;
		double Po = Math.abs(Pl-Pv);
		double Vo = Math.abs(Vl-Vv);
		
		// Koristili smo absolutnu vrednost iz prostog razloga sto povrsina i zapremina ne mogu biti negativne vrednosti
		
		// Stampanje rezultata
		
		System.out.println("Za unet poluprecnik r = "+df.format(r)+", povrsina lopte je  Pl = "+df.format(Pl)+ ", a zapremina Vl = "+df.format(Vl)+"\nPovrsina valjka je Pv = "+df.format(Pv)+", a zapremina je Vv = "+df.format(Vv));
		System.out.println("Povrsina preostalog tela je Po = "+df.format(Po)+ ", a zapremina Vo = "+df.format(Vo));
		
		input.close();
		
		
	}

}

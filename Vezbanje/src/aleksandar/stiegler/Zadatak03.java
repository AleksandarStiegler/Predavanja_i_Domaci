package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak03 {
	
	public static void main(String[] args) {
	
		// Napisati program za izracunavanje povrsine i zapremine kocke stranice a
		// zatim koristeci stranicu a konstruisati kvadar pomocu stranica b i c
		// i izracunati povrsinu i zapreminu kvadra.
		// Ako kazemo da jedno telo pocinje gde se drugo zavrsava izracunati
		// povrsinu i zapreminu novonastalog tela
		
		// a - stranica kocke i kvadra
		// b,c - stranice kvadra
		// Pko - povrsina kocke
		// Pkv - povrsina kvadra
		// Vko - zapremina kocke 
		// Vkv - zapremina kvadra
		
		// Unos podataka
		
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.###");
		
		System.out.println("Unesite stranicu a = ");
		double a = input.nextDouble();
		System.out.println("Unesite stranicu b = ");
		double b = input.nextDouble();
		System.out.println("Unesite stranicu c = ");
		double c = input.nextDouble();
		 
		double Pko, Pkv, Vko, Vkv;
		
		Pko = 6*a*a;
		Vko = Math.pow(a, 3);
		Pkv = 2*(a*b + a*c + b*c );
		Vkv = a*b*c ; 
		
		// P - povrsina nastalog tela
		// V - zapremina nastalog tela
		
		double P = Pko + Pkv;
		double V = Vko + Vkv;
		
		//Stampanje rezultata
		
		System.out.println("Za unesene vrednosti stranica a, b i c ");
		System.out.println("Povrsina kocke je "+df.format(Pko)+ ", zapremina je "+ df.format(Vko));
		System.out.println("Povrsina kvadra je "+df.format(Pkv)+ ", a zapremina je "+ df.format(Vkv));
        System.out.println("Povrsina novonastalog tela P = "+ df.format(P)+", a zapremina V = "+df.format(V));
        input.close();
        
		
		
	
	
	
	}
	
}

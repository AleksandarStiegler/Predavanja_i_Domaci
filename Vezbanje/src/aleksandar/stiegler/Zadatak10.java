package aleksandar.stiegler;

import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Iz zadatog trocifrenog broja izdvojiti stotine desetice i jedinice
		// 1) Napisati broj u sledecem obliku cifra desetica jedinica stotina
		// 2) Naci razliku izmedju cifara stotina i jedinica i dobijeni rezultat
		// pomnoziti sa cifrom desetica
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite trocifren broj x = ");
		int x = input.nextInt();
		int s, d, j;
		s = x / 100;
		d = (x % 100) /10;
		j = x % 10;
		
		// da proverim da li je tok misli ok
		//System.out.println(""+d+j+s); // ok rezultat posmatranja je sledeci
		//System.out.println(d);    // Zeznuo sam jedinice nisam razmisljao kako
		//System.out.println(s); // treba kad se odradi deljenje sa ostatkom od sto
		//System.out.println(j); // ocigledno je da ce ostati desetice i jedinice
		// kao sto sam to iskoristio za trazenje desetica ali onda sam to smetnuo 
		// sa uma, dobro je sto sam proverio
		// Drugi problem ukoliko ne stavimo znake navoda pa onda upisemo rezultate
		// posle njih Eclipse smatra da mi hocemo da saberemo promenljive
		// ali ako stavimo navodnike prvo pa onda + onda on to shvata kao da mi
		// zelimo samo da nadovezemo na tekst i nema problema
		// Stavicu sve sad pod komentar da nastavim dalje
		System.out.println("Novonastali trocifren broj ce izgledati "+d+j+s);
		System.out.println("Broj dobijen primenjenim racunskim operacijama nad ciframa je"+(s-j)*d);
		input.close();
		// radi kako treba ako izuzmemo nameran unos pogresnih vrednosti
		// Ok malo sam glup, cifru jedinica mozemo dobiti odmah iz broja ako 
		// odradimo % 10 od unesenog broja jer je to ostatak pri deljenju sa 10
		// kako jedinice ne mozemo da podelimo sa deset taj ostatak je nasa cifra jedinice
		// celobrojno deljenje sa 10 ce nam dati prve dve cifre
		// dodatni komentar za podsetnik
		
		
	}

}

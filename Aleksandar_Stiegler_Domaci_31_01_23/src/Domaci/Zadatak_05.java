package Domaci;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Zadatak_05 {

	public static void main(String[] args) {
		
		List<String> imena = new LinkedList<String>();
		
		String i[] = {"Pera", "Laza", "Mika", "Zika", "Ana", "Una", "Ema", "Lena","Mile", "Sava"};
		// napravio sam niz imena da ne bih isao pojedinacno unos za svako ime
		
		for (String s : i) {
			imena.add(s);
		}
		System.out.println(imena); 
		
		imena.set(4, "Milojko Pantic"); // Posto indeksi idu od 0 ; 5 pozicija je index 4
										// i pomocu setera postavljamo novo ime
		for(String s : imena) {
			System.out.print(s + ", ");
			
		}
		// Obrisati jedno ime tu cu da ubacim Random f-ju pa nju da iskoristimo u opsegu od 0-9
		Random ran = new Random();
		imena.remove(ran.nextInt(10));
		/* Zanimljivo je ovako ne znam koje ce ime da nestane ( bude izbrisano ) ali
		*  to smo mogli i preko remove ili indeksa (sto je slucaj koji sam uradio koristeci 
		* Random) ili direktno da brisemo ime iz liste */ 
		imena.remove("Zika");// ovako brisemo preko imena unutar liste i u ovom slucaju do
						     // dva imena posto Random moze da nam ukloni Ziku pre nego
							 // sto ova linija koda dodje na izvrsavanje
		System.out.println();
		System.out.println(imena);
		
		

	}

}

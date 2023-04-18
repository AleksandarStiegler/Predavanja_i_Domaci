package Domaci;

import java.io.DataInputStream;
import java.io.FileOutputStream;

public class Zadatak_07_31_1_23 {

	public static void main(String[] args) throws Exception{
		
		// Programski kreirati fajl i upisati tekst:  Ja sam programer!
		
		// Kao i prethodni zadatak ovaj ce biti uradjen u sklopu novog domaceg posto 
		// nisam predao na vreme
		
		DataInputStream dataIS = new DataInputStream(System.in);
		FileOutputStream fajlOS = new FileOutputStream("testfajl.txt");
		
		// Nisam siguran da li nam treba unos preko konzole ili samo da upisemo zadati tekst
		// pa cu uraditi zadati teks i ostaviti mogucnost za unos preko konzole
		
		String s = "Ja sam programer !";
		
		for (int i = 0; i < s.length(); i++) {
			fajlOS.write(s.charAt(i)); // Ovako smo upisali nas string posto write metoda
			// upisuje karakter po karakter
		}
	/*	
		System.out.println("Unesite tekst , prekid unosa uradite unosom specijalnog znaka $");
		// Posto smo rekli da write upisuje karakter po karakter uvescemo promenljivu tipa char
		// kako bismo mogli da vrsimo upis
		
		char c ;
		while ((c = (char) dataIS.read() )!= '$') { // metoda read nam omogucava da unosimo
			fajlOS.write(c); // znak po znak sa tastature
		}
		*/ // Stavio sam pod komentar pa ako je potrebno tu je
	
		fajlOS.close();

	}

}

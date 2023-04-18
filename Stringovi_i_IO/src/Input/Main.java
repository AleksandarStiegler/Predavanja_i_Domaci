package Input;

import java.io.DataInputStream;
import java.io.FileOutputStream;

public class Main {

	public static void main(String[] args) throws Exception{ // Dodato throws exception
															// posto cesto dolazi do gresaka pri unosu
		// Osnovne UI - input output operacije				
		
		// Za UI operacije Java koristi tokove(Stream)
		// Strimovi obezbedjuju nacine za rad sa podacima koji se primaju i salju
	
		// Povezivanje tastature (konzole) pomocu klase koja omogucuje povezivanje sa stream -om
		
		DataInputStream dis = new DataInputStream(System.in);
		
		
		
		// Upis se vrsi preko InputStream - a , a ispis preko OutputStream - a
		
		// Povezivanje fajla klasom  fileOutputStream - om
		
		FileOutputStream fos = new FileOutputStream("rezultat.txt");
		
		System.out.println("Unesite string ( unos prekinite unosom karaktera $)");
		
		// read() - upisuje znak po znak i unosi u fajl.
		// write()
		
		char ch;
		
		while((ch = (char)dis.read()) != '$') {
			fos.write(ch);
		}
		fos.close();
		
	}

}

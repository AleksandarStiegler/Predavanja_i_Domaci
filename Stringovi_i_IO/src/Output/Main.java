package Output;

import java.io.FileInputStream;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		FileInputStream fis = new FileInputStream("Ispis.txt");
		System.out.println("Sadrzaj fajla: " );
		
		// metoda koja ce citati i prosledjivanje vrednosti
		// read() izvedena iz klase inputstream cita jedan po jedan bajt iz datoteke i vraca ga 
		// kao celobrojnu vrednost. Kada stigne do kraja metoda read() vraca vrednost -1.
		
		int ch;
		
		while ((ch = fis.read()) != -1) {
			System.out.print((char)ch);
		}
		fis.close(); // zatvaranjem oslobadjaju se sistemski resursi koje je datoteka zauzela
		
		

	}

}

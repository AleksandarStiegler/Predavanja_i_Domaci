package Student;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestStudent {

	public static void main(String[] args) throws Exception {

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite broj studenata.");
		int n = Integer.parseInt(bfr.readLine());

		String ime;
		String prezime;
		String adresa;
		int brojindeksa;
		Student s[] = new Student[10];

		try {
			for (int i = 1; i <= n; i++) {
				System.out.print("Unesite ime studenta : ");
				ime = bfr.readLine();
				System.out.print("Unesite prezime studenta : ");
				prezime = bfr.readLine();
				System.out.print("Unesite adresu studenta : ");
				adresa = bfr.readLine();
				System.out.print("Unesite broj indeksa : ");
				brojindeksa = Integer.parseInt(bfr.readLine());
				if (brojindeksa > 0 && brojindeksa < 100) {
					brojindeksa = brojindeksa;
				} else {
					throw new Izuzetak(brojindeksa);
				}
				s [i] = new Student(ime, prezime, adresa, brojindeksa);
				
				
				
			}
			System.out.println("Student : \tIme: \tPrezime :\tAdresa\tBR.Indeksa :" );
			for (int i = 1; i <= n; i++) {
				s[i].ispisi();
			}
			
		} catch (Izuzetak e) {
			System.out.println("Broj indeksa za koji se desila greska : ");
			System.out.println("Indeks : " + e.getIndeksStudenta());
		}

	}

}

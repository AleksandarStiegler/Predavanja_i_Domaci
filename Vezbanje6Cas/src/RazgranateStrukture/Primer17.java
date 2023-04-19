package RazgranateStrukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primer17 {

	public static void main(String[] args) throws Exception{
		
		// Primer 18 predavanje 6
		
		double x;
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite vrednost x");
		x = Double.parseDouble(bfr.readLine());
		
		// Izgleda da u ovom primeru ne valjaju uslovi mislim da profesor to menjao na predavanju
		// Nije takva je postavka, e sad uslov gde je koren iz minusnog broja <=0 je sam po sebi pogresan
		// ukoliko se ne uvede matematicko i = -1 ali nemam predstavu kako bi to radilo iskreno
		// tako da ajde da radimo ovako kako jeste
		
	
		
		// Posto je profesor stavio x>= od 1 mi sad mozemo da radimo kako treba tako da zapravo uslov je bio postavljen lose
		// nije ni bitno shvatam sta on hoce da radi. Ovde imamo 2 uslova x razlicito od -2 i koren iz (x-1) <= 0
		// Ako cemo kako treba ovde imamo samo jednu jedinu mogucnost gde zadatak zapravo radi  to je x=1
		// To je jedina mogucnost koja ce da ispuni zadovoljavajucu stranu desno ali onda moramo da uzmemo sledece 
		// u obzir mi koristimo program da ispitamo da li je tvrdnja tacna i imamo levu i desnu stranu posto se koristi
		// ILI iz tautologije koje kaze izraz je tacan ukoliko je barem jedan od dva poredjena izraza tacan
		// a netacan ako su oba netacna tako da cu da uzmem x>= 1 kao uslov kako je i profesor odradio i samim tim
		// zaobilazimo mogucnost da je x = -2 
		
		
		if (x>=1)
		{
			boolean y = Math.sqrt((2 + x + x*x*x) / (x + 2)) > 0 || Math.exp(x - 1)<(x - 1) && Math.sqrt(x - 1) <= 0;
			System.out.println("Funkcija y je "+y);
		}
		else 
			System.out.println("Nije dobar unost x je < ili = od 1");
		
	
		
		

	}

}

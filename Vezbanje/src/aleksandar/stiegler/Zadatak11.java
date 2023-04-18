package aleksandar.stiegler;

import java.util.Scanner;

public class Zadatak11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Putovanje traje n sekundi napisati program za izracunavanje koliko je to
		// sati, minuta i sekundi
		
		// h - sati
		// m - minuti
		// s - sekunde
		
		// 1h=60m=3600s ili 60*60=3600
		// Unos podataka
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite trajanje putovanja u sekundama ");
		
		int n = input.nextInt();
		int h, m, s;
		h = n/3600;
		m = (n % 3600)/60;
		s = (n % 3600)%60;
		
		// ajde da vidimo jel radi ajde da uzmemo vrednost 2h32m15sec to je = 9135s
		// da vidimo je vraca tacno resenje
		System.out.println("Kad uneseno vreme pretvorimo dobijamo "+h+" sat[a] "+m+" minut[a] "+s+" i sekunda[i]" );
		// radi kako treba samo sam ga prebacio u integer oblik mogao sam i u short aj to da uradim
		input.close();
		
		
	}

}

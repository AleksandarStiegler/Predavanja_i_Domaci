package Zadatak_05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		// n - ti koren iz a preko iterativnog postupka
		// a mora biti vece od nule
		// apsolutna tacnost nije zadata stavicu epsilon 1E-6
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.00####");
		
		System.out.println("Unesite broj a koji treba biti veci od nule : ");
		double a = sc.nextDouble();
						
		while (a <= 0) {
			System.out.println("Unesite ponovo broj je manji ili jednak 0 : ");
			a = sc.nextDouble();
		}
		
		System.out.println("Unesite stepen korena n : ");
		int n = sc.nextInt();
		
		double xp = ( a + n - 1 ) / n;
		double xn = ((n - 1) * xp + a / Math.pow(xp, n-1)) / n;
		
		double xpdw = xp;
		double xndw = xn;
		
		double eps = 1E-6;
		
		while (Math.abs(xn - xp) > eps) {
			xp = xn ;
			xn = ((n - 1) * xp + a / Math.pow(xp, n-1)) / n;
		}
		// Dobijeno while petljom
		System.out.println("Vrednost "+n+" korena broja "+a+" iznosi "+df.format(xn));
	
		// Da ne bih stavljao resenje u komentare uvescu jos "2" promenljive kako bi mi stampao oba rezultata
		
		// do while petlja
		
		do {
			xpdw = xndw;
			xndw = ((n - 1) * xpdw + a / Math.pow(xpdw, n-1)) / n;
			
		}while(Math.abs(xndw - xpdw) > eps);
		System.out.println("Vrednost "+n+" korena broja "+a+" iznosi "+df.format(xn));
		
		
		sc.close();
	}

}

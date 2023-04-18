package aleksandar.stiegler;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Unos podataka
		
		// a, b, c - stranice trougla
		// s - poluobim trougla
		// R - poluprecnik opisanog kruga
		// r - poluprecnik upisanog kruga
		// P - povrsina trougla
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.print("Unesite stranicu a = ");
		double a = input.nextDouble();
		System.out.print("Unesite stranicu b = ");
		double b = input.nextDouble();
		System.out.print("Unesite stranicu c = ");
		double c = input.nextDouble();
		
		// Resavanje problema
		
	    double s, R, r, P ;
	    
	    s = (a + b + c)/2;
	    P = Math.sqrt(s*(s-a)*(s-b)*(s-c)); // Heronov obrazac
	    R = a*b*c/(4*P);
	    r = a*b*c/(2*R*s);
	    
	    // Stampanje rezultata
	    
	    System.out.println("Za uneste stranice trougla a, b i c poluprecnik opisanog kruga R = "+df.format(R)+
	    		" a poluprecnik upisanog kruga r = "+df.format(r));
	    input.close();
	    
	        	    		
	}

}

package Metode;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak_04 {
	
	static double sila(double m, double n, double r) {
		double k = 6.67 * Math.pow(10,-11);
		return k * m * n / (r*r);
	}
	

	public static void main(String[] args) {
		// Sila slajd 35
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.000");
		
		System.out.println("Unesite masu I-og tela");
		double m1 = sc.nextDouble();
		System.out.println("Unesite masu II-og tela");
		double m2 = sc.nextDouble();
		System.out.println("Unesite rastojanje");
		double r = sc.nextDouble();
		
		System.out.println("Sila privlacenja = "+sila(m1, m2, r));
		
		sc.close();
	}

}

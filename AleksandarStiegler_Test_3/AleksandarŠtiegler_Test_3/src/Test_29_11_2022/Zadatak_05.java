package Test_29_11_2022;


import java.util.Scanner;

public class Zadatak_05 {
	
	static double f(double q1, double q2, double r) {
		final double k = 9 * Math.pow(10, 9);
		return k * q1 * q2 / (r * r);
	}
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// Unos podataka
		System.out.print("Unesite naelektrisanje prve cestice : ");
		double q1 = sc.nextDouble();
		System.out.print("Unesite naelektrisanje druge cestice : ");
		double q2 = sc.nextDouble();
		System.out.print("Unesite rastojanje izmedju cestica : ");
		double r = sc.nextDouble();
		
		// Resenje i stampanje rezultata
		
		
		System.out.println("Sila privlacenja F = "+f(q1,q2,r));
		sc.close();

	}

}

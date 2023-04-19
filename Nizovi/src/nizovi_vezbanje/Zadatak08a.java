package nizovi_vezbanje;

import java.util.Scanner;

public class Zadatak08a {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj clanova niza n : ");
		int n = sc.nextInt();
		
		double x[]= new double [100];
		
		double suma = 0.0, suma1 = 0.0;
		System.out.println("Unesite clanove niza .");
		for (int i = 1 ; i <= n ; i++)
		{
			System.out.print("x["+i+"] = ");
			x[i] = sc.nextDouble();
			suma += x[i] * x[i];
			suma1 += x[i];
		}
		double sd = Math.sqrt((suma / n - Math.pow(suma1 / n,2)));
		System.out.println("Standardna devijacija iznosi "+sd);
		sc.close();
		// Koriscenjem profesorove formule dobio sam tacno resenje 
		// mislim resenje kao sto je i on dobio, mada da li je tacno meh nije ni bitno
		// bitno je da program radi kako treba
	}

}

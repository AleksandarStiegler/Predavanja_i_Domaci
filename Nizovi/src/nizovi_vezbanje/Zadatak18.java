package nizovi_vezbanje;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak18 {

	public static void main(String[] args) {
		
		// Primer 18 predavanje 14 slajd 71
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.000");
		System.out.print("Unesite broj elemenata niza n : ");
		int n = sc.nextInt();
		
		double x[] = new double [100];
		double suma, suma1 , p;
		
		suma = 0; suma1 = 0; p = 1;
		
		System.out.println("Unesite clanove niza x . ");
		for (int i = 1; i <= n ; i++)
		{
			System.out.print("x["+i+"] = ");
			x[i] = sc.nextDouble();
			suma += x[i] * x[i];
			suma1 += x[i];
			p *= x[i];
		}
		double s = Math.sqrt(suma / n - Math.pow(suma1 / n, 2));
		double pro = Math.pow(p, 1. / n);
		System.out.println("\ts = "+df.format(s)+"\tp = "+df.format(pro));
		sc.close();
	}

}

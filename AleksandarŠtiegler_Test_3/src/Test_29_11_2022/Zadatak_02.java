package Test_29_11_2022;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak_02 {

	public static void main(String[] args) {
		
		// Unos podataka
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.00");
		
		System.out.print("Uneti broj clanova niza : ");
		int n = sc.nextInt();
		
		double x[] = new double [100];
		double sigma ;
		
		System.out.println("Unesite clanove niza : ");
		for (int i = 1; i <= n; i ++)
		{
			System.out.print("x["+i+"] = ");
			x[i] = sc.nextDouble();
		}
		// Resavanje zadatka
		double sumakv = 0.0, suma = 0.0;
		
		for (int i = 1; i <= n; i++)
		{
			sumakv += x[i] * x[i];
			suma += x[i];
		}
		
		sigma = Math.sqrt((sumakv / n) - Math.pow((suma / n),2));
		// Stampanje resenja
		System.out.println("Standardna devijacija = "+df.format(sigma));
		sc.close();
	}

}

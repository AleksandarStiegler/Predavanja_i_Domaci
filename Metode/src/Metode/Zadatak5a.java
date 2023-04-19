package Metode;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak5a {
	static double suma(double x[], double y[], int n ,int k, int m) {
		double suma = 0;
		for (int i = 1; i <= n; i++)
		{
			suma += Math.pow(x[i], k) * Math.pow(y[i], m);
		}
		return suma;
	}

	public static void main(String[] args) {

		DecimalFormat df = new DecimalFormat("##0.000");
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite broj clanova nizova x i y : ");
		int n = sc.nextInt();
		
		double x[] = new double [50];
		double y[] = new double [50];
		
		System.out.println("Unesite clanove niza x : ");
		for (int i = 1; i <= n; i++)
		{
			System.out.print("x["+i+"] = ");
			x[i] = sc.nextDouble();
		}
		
		System.out.println("Unesite clanove niza y : ");
		for (int i = 1; i <= n; i++)
		{
			System.out.print("y["+i+"] = ");
			y[i] = sc.nextDouble();
		}
		
		double q = (n * suma(x,y,n,1,1) - suma(x,y,n,1,0) * suma(x,y,n,0,1)) / Math.sqrt( n* Math.abs(suma(x,y,n,2,0) * suma(x,y,n,0,2)));
		System.out.println("Vrednost izraza je "+df.format(q));
		sc.close();
	}

}

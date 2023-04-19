package Metode;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak_05 {
	
	static double suma(int n, double x[]) {
		double s = 0;
		for (int i = 1 ; i <= n; i++)
		{
			s += x[i];
		}
		return s;
	}
	static double sumakv(int n, double x[]) {
		double s2 = 0;
		for (int i = 1 ; i <= n; i++)
		{
			s2 += x[i]*x[i];
		}
		return s2;
	}
	static double sumapr(int n, double x[], double y[]) {
		double s = 0;
		for (int i = 1 ; i <= n; i++)
		{
			s += x[i]*y[i];
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		double q = (n*sumapr(n,x,y)-suma(n,x)*suma(n,y)) / Math.sqrt(n *Math.abs( sumakv(n,x)*sumakv(n,y)));
		
		System.out.println("Vrednost izraza je "+df.format(q));
		// Zadatak radi ali ima mnogo elegantije resenje i posto je kasno prekopiracu dobar deo zadatka
		sc.close();
	}

}

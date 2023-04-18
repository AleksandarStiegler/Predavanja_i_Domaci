package Petlje_i_Razgranate_strukture;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.000");
		double n , k, suma = 0.0;
		double fak = 1;
		System.out.print("Unesite konstantu k : ");
		k = sc.nextDouble();
		System.out.print("Uneiste broj n do kog se racuna suma : ");
		n = sc.nextDouble();
		sc.close();
		for (double i = 1; i <= n ; i++)
		{
			fak *= i;
			suma += fak / Math.pow(k,i);
			
		}
		System.out.println("Suma iznosi "+df.format(suma)+" a faktorijel "+fak);
	}

}

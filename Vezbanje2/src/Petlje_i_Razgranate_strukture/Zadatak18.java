package Petlje_i_Razgranate_strukture;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak18 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.00000");
		
		System.out.println("Unesite n : ");
		int n = sc.nextInt();
		
		System.out.println("Unesite a : ");
		double a = sc.nextDouble();
		System.out.println("Unesite zadatu tacnost : ");
		double eps = sc.nextDouble();
		
		sc.close();
		
		double x0 , x1;
		
		x0 = ( a + n - 1) / (double) n;
		x1 = (( (n - 1) * x0 + a )/ Math.pow(x0,n-1)) /  n;
		
		while ( Math.abs( x1 - x0 ) > eps)
		
		{
			x0 = x1;
			x1 = ( (n - 1) * x0 + a / Math.pow(x0,n-1)) /  n;
			
		}
	
		System.out.println("Dobijena vrednost x = "+df.format(x1));
	}

}

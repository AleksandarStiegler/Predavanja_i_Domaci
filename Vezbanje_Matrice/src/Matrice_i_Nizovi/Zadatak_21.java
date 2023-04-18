package Matrice_i_Nizovi;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak_21 {
	
	static double[] H(int n, double x)
	{
		double hermit [] = new double [10];
		hermit[0] = 1;
		hermit[1] = x;
		for (int i = 1; i <= n; i++)
		{
			hermit[i+1] = 2*(x*hermit[i]-n*hermit[i-1]);
		}
		return hermit;
			
	}

	public static void main(String[] args) {
		
		// Hermitov polinom Cas 19 slajd 37
		
		// H0 = 1
		// H1 = x
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.00");
		
		System.out.print("Unesite stepen polinoma n :");
		int n = sc.nextInt();
		System.out.print("Unesite vrednost promenljive x :");
		double x = sc.nextDouble();
		
		double hermit [] = new double[10];
		hermit = H(n,x);
		sc.close();
		System.out.println("Stepen\th[stepen]\n=============================");

		for (int i = 0 ; i <= n; i++)
			System.out.println(i+"\t"+df.format(hermit[i]));
	}

}

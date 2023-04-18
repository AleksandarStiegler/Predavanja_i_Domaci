package nizovi_2go_predavanje;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.000");
		// Polozaj tezista slozene povrsine
		double A, Xt, Yt;
		
		System.out.println("Unesite broj clanova nizova a, x i y.");
		int n = sc.nextInt();
		
		double a[] = new double [100];
		double x[] = new double [100];
		double y[] = new double [100];
		
		for (int i = 1 ; i <= n; i++)
		{
			System.out.print("a["+i+"] = ");
			a[i] = sc.nextDouble();
			
		}
		for (int i = 1 ; i <= n; i++)
		{
			System.out.print("x["+i+"] = ");
			x[i] = sc.nextDouble();
			
		}
		for (int i = 1 ; i <= n; i++)
		{
			System.out.print("y["+i+"] = ");
			y[i] = sc.nextDouble();
			
		}
		double sumaA = 0.0, sumaX = 0.0, sumaY = 0.0;
		for (int i = 1 ; i <= n ; i++)
		{
			sumaA += a[i];
			sumaX += a[i] * x[i];
			sumaY += a[i] * y[i];
		}
		
		A = sumaA;
		Xt = sumaX / A;
		Yt = sumaY / A;
		System.out.println("A = "+df.format(A)+"\tXt = "+df.format(Xt)+"\tYt = "+df.format(Yt));
		sc.close();
	}

}

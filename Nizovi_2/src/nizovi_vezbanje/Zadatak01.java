package nizovi_vezbanje;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {
		
		// 10.11.2022. Slajd 10
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.000");
		
		System.out.print("Unesite broj elemenata nizova : ");
		int n = sc.nextInt();
		
		double a[] = new double [100];
		double x[] = new double [100];
		double y[] = new double [100];
		
		System.out.println("Unesite clanove nizova .");
		for (int i = 1 ; i <= n ; i++ )
		{
			System.out.print("a["+i+"] = ");
			a[i] = sc.nextDouble();
			System.out.print("x["+i+"] = ");
			x[i] = sc.nextDouble();
			System.out.print("y["+i+"] = ");
			y[i] = sc.nextDouble();
		}
		double suma = 0.0 , sx = 0.0, sy = 0.0;
		
		for (int i = 1 ; i <= n ; i++)
		{
			suma += a[i];
			sx += a[i] * x[i];
			sy += a[i] * y[i];
		}
				double A = suma;
				double xt = sx / A;
				double yt = sy / A;
			System.out.println("A = "+df.format(A)+"\tXt = "+df.format(xt)+"\tYt = "+df.format(yt));
	sc.close();
	}

}

package nizovi_vezbanje;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak15 {

	public static void main(String[] args) {
		
		// Predavanje 14 primer 13 slajd 52
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.000");
		System.out.print("Unesite broj clanova za nizove x i y : ");
		int n = sc.nextInt();
		
		int x[] = new int [n];
		int y[] = new int [n];
		double f[] = new double [n];		
		System.out.println("Unesite clanove nizova x i y.");
		
		for (int i = 0 ; i < n; i++)
		{
			System.out.print("x["+i+"] = ");
			x[i] = sc.nextInt();
			System.out.print("y["+i+"] = ");
			y[i] = sc.nextInt();
			if ( x[i] >= y[i])
			{ 
				f[i] = Math.sqrt((double)(x[i] - 0.2) / (2 + y[i]));
			}
			else 
			{
				f[i] = Math.sqrt((double)(y[i] - 0.2) / (2 + x[i]));
			}
		}
			System.out.println("\tR.BR. \tX[i] \tY[] \tF[]");
			for (int i = 0 ; i < n ; i++)
				System.out.print("\t"+i+"\t"+x[i]+"\t"+y[i]+"\t"+df.format(f[i])+"\n");
			sc.close();
		}
	}



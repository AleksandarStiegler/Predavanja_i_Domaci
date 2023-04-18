package Petlje_i_Razgranate_strukture;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak17 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.000");
		
		System.out.println("Unesite n");
		double n = sc.nextDouble();
		sc.close();
		double pro = 1.0;
		
		for (double i = 1 ; i<=n ; i++)
		{
			pro *= (i + 2.5) / ( i*i + 1.2);
		}
		System.out.println(df.format(pro));
	}

}

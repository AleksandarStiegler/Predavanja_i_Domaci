package Petlje_i_Razgranate_strukture;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak14 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		double suma = 0  , suma1 = 0.0 , n;
		DecimalFormat df = new DecimalFormat("#0.000");
		System.out.print("Unesite broj do kog ce se racunati suma : ");
		n = sc.nextDouble();
		sc.close();
		
		for (double i = 1 ; i <= n ; i++)
		{
			suma = 0;
			for (double j = 1 ; j <= n ;j++)
			{
				if (j != 3)
					suma1 += (j +3.5 ) / (j - 3);
			}
			suma += suma1;
			
			
		}
		System.out.println(" Za uneto n "+n+" , suma iznosi "+df.format(suma));
	}

}

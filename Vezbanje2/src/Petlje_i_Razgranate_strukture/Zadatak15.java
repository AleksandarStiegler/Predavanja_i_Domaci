package Petlje_i_Razgranate_strukture;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double n, suma = 0, suma1 = 0;
		DecimalFormat df = new DecimalFormat("#0.000");
		System.out.print("Unesite broj n do kojeg ce se racunati suma : ");
		
		n = sc.nextDouble();
		sc.close();
		
		for ( double i = 1.0 ; i <= n ; i++)
		{
			suma = 0.0;
			for (double j = 1; j <= i; j++)
			if	(j != 3)
			{
				suma1 += (j + 2) / (j - 3);
			}
			suma += suma1;
				
		}
		
		System.out.println("Za unet broj n = "+n+" , suma iznosi "+df.format(suma));
	}

}

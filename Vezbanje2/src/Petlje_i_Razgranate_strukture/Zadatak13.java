package Petlje_i_Razgranate_strukture;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak13 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		double suma = 0.0,  n;
		DecimalFormat df = new DecimalFormat("#0.000");
		System.out.print("Unesite broj n do kojeg ce se racunati posmatrana suma : ");
		n = sc.nextDouble();
		sc.close();
		/*
		for ( i = 1; i <= n ; i++)
		{
			if (i != 3)
				suma += (i + 3.5) / ( i - 3);
		}  */
		
		double i = 1;
		
		while ( i <= n)
		{
			if (i != 3)
			suma += (i + 3.5) / (i - 3);
			i++;
			
		}
		
		System.out.println("Za unetu vrednost n "+n+" , suma iznosi "+df.format(suma));
	}

}

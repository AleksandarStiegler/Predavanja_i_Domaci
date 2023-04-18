package Petlje_i_Razgranate_strukture;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.000");
		System.out.println("Unesite x ");
		double x = sc.nextDouble();
		sc.close();
		
		double y ;
		
		if ( -2 < x && x <= 2)
		{
			y = 2 * x;
		}
		else if ( 5 <= x && x < 7)
		{
			y = 3 * x - 1;
		}
		else 
		{
			y = 1 / x;
		}
		System.out.println(df.format(y));
	}

}

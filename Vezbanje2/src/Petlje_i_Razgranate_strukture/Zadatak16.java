package Petlje_i_Razgranate_strukture;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Zadatak16 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#0.000");
		double x, y ;
		
		System.out.print("Unesite koliko ce se puta primeniti koren : ");
		x = sc.nextDouble();
		sc.close();
		y = 0;
		for ( double i = 1 ; i <= x ; i++)
		{
			y = Math.sqrt(6 + y);
		}
		System.out.println("Vrednost izraza kada se korenuje "+x+" puta , iznosi "+df.format(y));
		
	}
}
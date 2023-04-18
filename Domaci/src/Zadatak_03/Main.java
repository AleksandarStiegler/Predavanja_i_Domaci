package Zadatak_03;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
				
		double x , y;
		
		System.out.print("Unesite promenljivu x : ");
		x = sc.nextDouble();
		
		if ( x < 5) {
			y = Math.pow((x - 3), 2);
		}
		else if (x >= 5 && x <8) {
			y = x + 2;
		}
		else {
			y = x - 1;
		}
		
		System.out.println("Vrednost f-je y za x = "+x+" , iznosi "+df.format(y));
		
		sc.close();

	}

}

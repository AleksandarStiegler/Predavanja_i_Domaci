package RazgranateStrukture2;

import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite x ");
		double x, y;
		
		x = ulaz.nextDouble();
		
		if (x>-2 && x<=2)
		{
			y= 2*x;
		}
		else if (x >= 5 && x<7)
		{
			y = 3*x-1;
		}
		else 
		{
			y = 1/x;
		}
	ulaz.close();
		System.out.println("Vrednost izraza y = "+y);
		

	}

}

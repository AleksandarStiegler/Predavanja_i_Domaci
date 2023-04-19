package SwitchIfElseStrukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak03 {

	public static void main(String[] args) throws Exception {
		
		
		// Napisati naredbu uslovnog prelaska kojom se za dato x izracunava y po formuli
		// kaze ovako  :   x < 0 y= -5 ;  0<=x<1 y = x+2 ;  1<=x<=5  y= 3x-1 ;  x>=5 2x
		
		// Unos podataka
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		double x , y = 0;
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.print("Unesite vrednost za x : ");
		x = Double.parseDouble(bfr.readLine());
		
		// obrada podataka
		
		if ( x < 0)
		{
			y = -5;
		}
		else if ( x >= 0 && x < 1)
		{
			y = x + 2;
		}
		else if ( x >= 1 && x < 5)
		{
			y = 3*x - 1 ;
		}
		else if ( x >= 5)
		{
			y = 2*x;
		}
		
		// Spampanje rezultata
		
		System.out.println(" Za unetu vrednost x = "+x+" , vrednost funkcije y = "+df.format(y));
		

	}


}

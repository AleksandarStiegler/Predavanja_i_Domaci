package SwitchIfElseStrukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak05 {

	public static void main(String[] args) throws Exception {
		
		
		// Napisati naredbu uslovnog prelaska kojom se za dato x izracunava y po formuli
		// -2<x<=2 y=2x ;  5<=x<7  y = 3x-1 ;  y = 1/x za sve ostalo
		
		// Unos podataka
		
		BufferedReader bfr = new BufferedReader ( new InputStreamReader(System.in));
		double x, y;
		
		System.out.print("Unesite vrednost promenljive x : ");
		x = Double.parseDouble(bfr.readLine());
		DecimalFormat df = new DecimalFormat("#.###");
		// Resavanje problema
		
		if ( x > -2 && x <= 2)
		{
			y = 2 * x;
		}
		else if ( x >= 5 && x < 7)
		{
			y = 3 * x - 1;
		}
		else 
		{
			y = 1/x ;
		}
		
		// Stampanje rezultata
		System.out.println("Za unetu vrednost "+df.format(x)+" , vrednost funkcije y je "+df.format(y));
	}

}

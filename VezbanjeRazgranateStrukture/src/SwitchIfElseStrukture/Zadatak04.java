package SwitchIfElseStrukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak04 {

	public static void main(String[] args) throws Exception {
		
		// Napisati naredbu uslovnog prelaska kojom se za dato x y izracunava po formuli
		// x<0 y=-1;  x=0 y=0;  x>0 y=1;
		
		// Unos podataka
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		byte y = 0;
		System.out.println("Unesite vrednost promenjlive x ");
		double x = Double.parseDouble(bfr.readLine());
		
		if (x < 0)
		{
			y = -1;
		}
		else if ( x == 0)
		{
			y = 0;
		}
		else if ( x > 0)
		{
			y = 1;
		}
	
		System.out.println("Za unetu vrednost x : "+x+" , vrednost funkcije y je "+y);
	}
	

}

package SwitchIfElseStrukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak11 {

	public static void main(String[] args) throws Exception {
		
		// Napisati program za nalazenje ekvivalentnog kapaciteta dva kondenzatora C1 i C2 ako su vezana a) redno ; b) paralelno
		
		// Unos podataka
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		double c1, c2, ce = 0;
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.print("Unesite vrednost prvog kondenzatora C1 : ");
		c1 = Double.parseDouble(bfr.readLine());
		System.out.print("Unesite vrednost drugog kondenzatora C2 : ");
		c2 = Double.parseDouble(bfr.readLine());
		System.out.println("Izberite vezu kondenzatora, unesite 1 za rednu ili 2 za paralelnu vezu.");
		byte x = Byte.parseByte(bfr.readLine());
		
		// Resavanje problema
		
		switch (x)
		{
		case 1 : 
		{
			ce = c1 * c2 / (c1 + c2);
			break;
		}
		case 2 :
		{
			ce = c1 + c2 ;
			break;
		}
		default : 
		{
			System.out.println("Pogresan unos, izabrana nepostojeca veza.");
		}
		
		}
		
		System.out.println("Ekvivalentan kapacitet ce je "+df.format(ce));
	}
	

}

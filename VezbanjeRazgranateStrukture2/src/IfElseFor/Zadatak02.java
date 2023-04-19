package IfElseFor;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak02 {

	public static void main(String[] args) throws Exception {


		// Zadatak za vezbu 2 sa 11 predavanja slajd 78
		// u pitanju je izracunavanje sume ali je komplikovana za pisati ovde
		// mala prerada zadatka dodao sam mogucnost unosa
		// Unos podataka
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("###,##0.000000");
		double suma = 0.0 ;
		System.out.println("Unesite broj n : ");
		int n = Integer.parseInt(bfr.readLine());
		
		for (double i = 1.0; i <= n ; i++)
		{
			suma += Math.pow(-1, i-1) * i / (i + 1); 
		}
		System.out.println("Suma za uneto n = "+n+" , iznosi "+df.format(suma));

	}

}

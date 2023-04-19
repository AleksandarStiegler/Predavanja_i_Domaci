package SwitchIfElseStrukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak12 {

	public static void main(String[] args) throws Exception {
		
		// Napisati program kojim se ucita znak za operaciju ( +, -, *, / ) i dva realna 
		// operanda a zatim stampa rezultat
		
		// Unos podataka
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite prvi operand x : ");
		double x = Double.parseDouble(bfr.readLine());
		System.out.print("Unesite zeljeni operator : ");
		char k = bfr.readLine().charAt(0);
		System.out.print("Unesite drugi operand y : ");
		double y = Double.parseDouble(bfr.readLine());
		DecimalFormat df = new DecimalFormat("#.##");
		
		// Resavanje problema
		
		double rez = 0;
		switch (k)
		{
		case '*' :
		{
			rez = x * y;
			break;
		}
		case '+' :
		{
			rez = x + y;
			break;
		}
		case '-' :
		{
			rez = x - y;
			break;
		}
		case '/' :
		{
			rez = x / y ;
			break;
		}
		default :
		{
			System.out.println("Pogresan unos.");
		}
		}
		// Stampanje rezultata
		
		System.out.println("Za unete vrednosti x = "+x+" ,  y = "+y+" , i uneti operator "+k+" , rezultat je "+df.format(rez));

	}

}

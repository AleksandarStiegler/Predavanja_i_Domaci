package RazgranateStrukture2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Zadatak06 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
 
		// od 0 do 49 je ocena 1 od 50 do 60 je ocena 2
		// od 61 do 69 je ocena 3 od 70 do 89 je ocena 4?? od 90 do 100 je ocena 5
		// preko toga je greska
		
		
	BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite broj poena ");
		int x = Integer.parseInt(ulaz.readLine());
		byte y = 0;
		if (x>=0 && x<=49)
		{
			System.out.println("Dobijena ocena je 1");
			
		}
		else if (x>=50 && x<=60)
		{
			System.out.println("Dobijena ocena je 2");
		}
		else if (x>=61 && x<=69)
		{
			System.out.println("Dobijena ocena je 3");
		}
		else if (x>=70 && x<=89)
		{
			System.out.println("Dobijena ocena je 4");
		}
		else if (x>=90 && x<=100)
		{
			System.out.println("Dobijena ocena je 5");
		}
		
		else 
			System.out.println("Uneta je pogresna vrednost");
		
	}
	

}

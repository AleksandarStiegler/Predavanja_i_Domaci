package RazgranateStrukture2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primer04 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// Ispitati da li je broj paran
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		int a ;
		System.out.print("Unesite broj a : ");
		a = Integer.parseInt(ulaz.readLine());
		
		if (a % 2 == 0)
		{	System.out.println("Uneti broj a je paran "); }
		else
		{	System.out.println("Uneti broj a je neparan"); }

	}

}

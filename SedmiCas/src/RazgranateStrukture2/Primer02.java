package RazgranateStrukture2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primer02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// Za uneti broj ispitati da li je broj pozitivan, negativan ili jednak 0
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite vrednost za broj a ");
		double a = Double.parseDouble(input.readLine());
		
		if (a>0)
		{	System.out.println("Uneti broj je pozitivan"); }
		if (a<0)
		{	System.out.println("Uneti broj je negativan"); }
		if  (a==0)
		{	System.out.println("Uneti broj je 0 "); }

		
	}

}

package SwitchIfElseStrukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak07 {

	public static void main(String[] args) throws Exception {
		
		// Napisati naredbu case kojom se na osnovu brojnih ocena 5,4,3,2,1 isisuju ocene "odlican" "vrlo dobar"
		// "dobar" "dovoljan" "nedovoljan"
		
		// Unos podataka
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite ocenu : " );
		byte ocena = Byte.parseByte(bfr.readLine());
		
		switch ( ocena )
		{
		case 1 :
		{
			System.out.println("Nedovoljan");
			break;
		}
		case 2 : 
		{
			System.out.println("Dovoljan");
			break;
		}
		case 3:
		{
			System.out.println("Dobar");
			break;
		}
		case 4:
		{
			System.out.println("Vrlo Dobar");
			break;
		}
		case 5 : 
		{
			System.out.println("Odlican");
			break;
		}
		default :
		{
			System.out.println("Uneli ste broj izvan posmatranog opsega ocena");
		}
		}
		
	}

}

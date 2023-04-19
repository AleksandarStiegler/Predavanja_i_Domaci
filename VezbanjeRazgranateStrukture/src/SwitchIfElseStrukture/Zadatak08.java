package SwitchIfElseStrukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak08 {

	public static void main(String[] args) throws Exception {
		
		// Napisati program koji za dati redni broj dana u nedelji stampa ime dana.
		
		// Unos podataka
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite redni broj dana u nedelji");
		byte dan = Byte.parseByte(bfr.readLine());
		
		switch (dan)
		{
		case 1:
		{
			System.out.println("Ponedeljak");
			break;
		}
		case 2 :
		{
			System.out.println("Utorak");
			break;
		}
		case 3 :
		{
			System.out.println("Sreda");
			break;
		}
		case 4:
		{
			System.out.println("Cetvrtak");
			break;
		}
		case 5 :
		{
			System.out.println("Petak");
			break;
		}
		case 6 :
		{
			System.out.println("Subota");
			break ; 
		}
		case 7 :
		{
			System.out.println("Nedelja");
			break;
		}
		default :
		{
			System.out.println("Unos izvan posmatranog opsega unesite od 1 do 7");
		}
		}
		

	}

}

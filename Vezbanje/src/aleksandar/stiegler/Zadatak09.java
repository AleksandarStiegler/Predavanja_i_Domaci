package aleksandar.stiegler;

import java.util.Scanner;

public class Zadatak09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Napisati program za izdvajanje dvocifrenog broja i ispisivanje unazad
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite dvocifren broj ");
		
		byte x = input.nextByte();

		byte d = (byte) (x/10);
		byte j = (byte) (x%10);
		
		System.out.println("Broj napisan unazad je "+j+d);
		input.close();
		
		
	}

}

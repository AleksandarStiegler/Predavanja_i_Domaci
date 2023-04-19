package RazgranateStrukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primer07 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// Napisati program kojim se izracunava z tako sto je z = a + b ako je a deljivo sa 2 a b deljivo sa 3
		// u ostalim slucajevima z = a - b
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		int a , b , z;
		
		System.out.println("Unesite vrednost za a = ");
		a = Integer.parseInt(input.readLine());
		System.out.println("Unesite vrednost za b = ");
		b = Integer.parseInt(input.readLine());
		/*
		if (a%2==0 && b%3==0)
			z = a + b;
		else 
			z = a - b;*/
		
		 z = ( a%2==0  &&  b%3==0) ? a+b : a-b;
		
		System.out.println("Vrednost izraza z = "+z);
		
		
		
		
	}

}

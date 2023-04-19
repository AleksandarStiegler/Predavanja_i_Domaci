package RazgranateStrukture;

import java.util.Scanner;

public class Primer08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ako je a neparno a be parno z = a+b ostali slucajevi z=ab
		
		Scanner input = new Scanner(System.in);
		int a, b, z;
		
		System.out.println("Unesite vrednosti za a i b");
		a = input.nextInt();
		b = input.nextInt();
		
		if (a%2!=0 && b%2==0)
			z = a+b;
		else
			z = a*b;
		
		System.out.println("Vrednost izraza z = "+z);
			
input.close();
	}

}

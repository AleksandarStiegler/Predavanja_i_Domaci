package Izuzetak_01;

import java.util.Scanner;
import static java.lang.Math.*;

import java.text.DecimalFormat;
public class Try_Catch_Block {

	public static void main(String[] args) {
		
		// Jedan od najosnovnijih primera za try catch blokove
		// Matematicki problemi koren broja <0 i recimo deljenje nulom
		// Ajde da probam ovo ovde
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("##0.0##");
		System.out.println("Unesite vrednost za x");
		
		try {
			int x = sc.nextInt();
			
			double y =  (sqrt(x) + (13 +x * 2)/ (x * (x - 2)));
			double c = sqrt(x);
			System.out.println("Vrednost izraza y iznosi "+df.format(y));
		}catch(ArithmeticException e) {
			
			System.out.println("Uhvacen je izuzetak :"+e.getLocalizedMessage()+". Unesite ponovo.");
		}

	}
	// Ok ne znam kako java gleda negativan koren pa ne znam kako da postavim izuzetak, ali izuzetak
	// deljenja sa nulom je uhvacen u oba slucaja i kada je x = 0  i kada je x = 2.

}

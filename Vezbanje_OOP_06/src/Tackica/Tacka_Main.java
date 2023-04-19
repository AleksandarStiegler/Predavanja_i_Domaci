package Tackica;

import java.util.Scanner;

public class Tacka_Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite koordinatu x tacke .");
		double x = sc.nextDouble();
		System.out.println("Unesite koordinatu y tacke .");
		double y = sc.nextDouble();
		
		
		Tacka A = new Tacka();
		Tacka B = new Tacka(3.15);
		Tacka C = new Tacka(x, y);
		
		System.out.println("Tacka A ima "+A.opisook());
		System.out.println("Tacka B ima "+B.opisook());
		System.out.println("Tacka C ima "+C.opisook());
		
		System.out.println("Rastojanje izmedju tacke A i C "+A.opisr2t(C));
		System.out.println("Rastojanje izmedju tacke A i B "+A.opisr2t(B));
		System.out.println("Rastojanje izmedju tacke B i C "+B.opisr2t(C));
		
	sc.close();
	}

}

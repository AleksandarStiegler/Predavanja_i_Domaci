package Zadatak_01;

import java.util.Scanner;

public class Tacka_Glavni {

	public static void main(String[] args) {
		
		Tacka A = new Tacka();
		Tacka B = new Tacka(3.5,-1.4);
		
		System.out.println(A.getx()+" "+B.getx());
		System.out.println(A.gety()+ " "+ B.gety());
		
		System.out.println(B.prikaz());
		System.out.println(A.prikaz());
		Scanner sc = new Scanner(System.in);
		
		double k, i;
		System.out.print("Unesite x koordinatu tacke : ");
		k = sc.nextDouble();
		System.out.print("Unesite y koordinatu tacke : ");
		i = sc.nextDouble();
		Tacka C = new Tacka(k,i);
		System.out.println(C.prikaz());
		
		System.out.println(C.gety());
		sc.close();
	}

}

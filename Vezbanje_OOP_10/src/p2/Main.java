package p2;

import java.util.Scanner;
import p1.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite broj");
		double a = sc.nextDouble();
		sc.close();
		
		ApsolutnaVrednost A = new ApsolutnaVrednost(0);
		ApsolutnaVrednost B = new ApsolutnaVrednost(-5.14);
		ApsolutnaVrednost C = new ApsolutnaVrednost(a);
		
		System.out.println(A.opis()+A.aps(A));
		System.out.println(A.opis()+A.abso());
		System.out.println(B.opis()+B.aps(B));
		System.out.println(B.opis()+B.abso());
		System.out.println(C.opis()+C.aps(C));
		System.out.println(C.opis()+C.abso());

	}

}

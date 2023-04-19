package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Kvadar.*;
public class Kvadar_Main {

	public static void main(String[] args) throws IOException{
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		double a = 0, b = 0, c = 0;
		do {
			try {
			System.out.print("Unesite stranicu a : ");
			 a = Double.parseDouble(bfr.readLine());
			
		}catch(Exception e) {
			System.out.println("Pogresan unos."+e.getLocalizedMessage());
		}
		}while (a <= 0);
		
		do {
			try {
			System.out.print("Unesite stranicu b : ");
			 b = Double.parseDouble(bfr.readLine());
			
		}catch(Exception e) {
			System.out.println("Pogresan unos."+e.getLocalizedMessage());
			}
		}while (b <= 0);
		
		do {
			try {
			System.out.print("Unesite stranicu c : ");
			 c = Double.parseDouble(bfr.readLine());
			
		}catch(Exception e) {
			System.out.println("Pogresan unos."+e.getLocalizedMessage());
			}
		}while (c <= 0);
		
		Kvadar A = new Kvadar();
		Kvadar B = new Kvadar(a, b, c);
		
		System.out.println("Stranica b kvadra A, b = "+A.getB());
		System.out.println();
		System.out.println("Kvadrat A : "+A.toString());
		System.out.println();
		System.out.println("Kvadrat B : "+B.toString());
		System.out.println("Razlika 2 kvadra A i B = "+ Math.abs(A.zap()-B.zap()));
		
	}

}

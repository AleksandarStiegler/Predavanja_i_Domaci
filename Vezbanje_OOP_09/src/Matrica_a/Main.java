package Matrica_a;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import Matrica.*;


public class Main {

	public static void main(String[] args) throws Exception{
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Unesite broj redova matrice : ");
		int r = Integer.parseInt(bfr.readLine());
		System.out.print("Unesite broj kolona matrice : ");
		int k = Integer.parseInt(bfr.readLine());
		
		Matrica A =new Matrica(r,k);
		System.out.println("Unesite elemente matrice : ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < k; j++) {
				System.out.print("A["+i+","+j+"] = ");
				double c = Double.parseDouble(bfr.readLine());
				A.setElement(i, j, c);
			}
		}
		System.out.println("Matrica A");
		A.prikaz();
		
		// Zamena elemenata
		System.out.println("Zamena elemenata na glavnoj dijagonali");
		A.zameni();
		A.prikaz();
		System.out.println(A.getElement(2, 2));
		
		
		

	}

}

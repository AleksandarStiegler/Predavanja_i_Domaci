package nizovi_vezbanje;

import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {
		
		int cifra, temp = 0;
		int suma = 0, proiz = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj clanova niza n : ");
		int n = sc.nextInt();
		
		int x[] = new int [n];
		int max []=new int [n];
		for ( int i = 0; i < x.length ; i++)
		{
			System.out.print("x["+i+"] = ");
			x [i] = sc.nextInt();
	
			temp = x[i];
			max [i]= -9;
			while (temp != 0)
			{
				cifra = temp % 10;
				if (max[i] < cifra)
				{
					max [i] = cifra;
				}
				temp /= 10;
			}
			 suma += max[i];
			 proiz *= max[i];
		}
		for (int i = 0 ; i < x.length ; i++) {
		System.out.println("Za broj "+i+" , najveca cifra je "+max[i]);}
		System.out.println("Suma najvecih cifara je "+suma+" a proizvod "+proiz);
		sc.close();
	}

}

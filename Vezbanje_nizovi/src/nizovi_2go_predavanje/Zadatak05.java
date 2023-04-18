package nizovi_2go_predavanje;

import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {
		
		// Ispisati program koji ce za uneta 3 odsecka proveriti da
		// li one predstavljaju stranice trougla.
		
		// Uslov x+y > z i |x-y| < z
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite koliko groupa odsecaka ispitujemo.");
		int n = sc.nextInt();
		
		double a[] = new double[100];
		double b[] = new double[100];
		double c[] = new double[100];
		
		System.out.println("Unesite odsecke");
		for (int i = 1 ; i <= n ; i++)
		{
			System.out.print("a["+i+"] = ");
			a[i] = sc.nextDouble();
			System.out.print("b["+i+"] = ");
			b[i] = sc.nextDouble();
			System.out.print("c["+i+"] = ");
			c[i] = sc.nextDouble();
			System.out.println();
		}
		// Resavanje
		System.out.println("Str a \tStr b \tStr c \tTrougao");
		for (int i = 1 ; i <= n; i++)
		{
			if (a[i]+b[i] > c[i] && Math.abs(a[i] - b[i]) < c[i])
			{
				System.out.println(a[i]+"\t"+b[i]+"\t"+c[i]+"\tDA");
			}
			else
				System.out.println(a[i]+"\t"+b[i]+"\t"+c[i]+"\tNE");
		}
		sc.close();
	}

}

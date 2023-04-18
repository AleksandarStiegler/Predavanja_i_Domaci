package nizovi_2go_predavanje;

import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) {
		
		// Bubble Sort
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj clanova niza n : ");
		int n = sc.nextInt();
		
		int x[] = new int [100];
		
		System.out.println("Unesite elemente niza.");
		
		for (int i = 1 ; i <= n ; i++)
		{
			System.out.print("x["+i+"] = ");
			x[i] = sc.nextInt();
		}
		
		System.out.println("Nesortiran niz : ");
		for (int i = 1 ; i <=n ; i++)
		{
			System.out.print(x[i]+" ");
		}
		
		System.out.println("\nSortiran niz : ");
		
		int temp;
		for (int i = 1; i <= n ; i++)
		{
			 
			 for (int j = 1; j <= n - 1 ; j++)
			 {
				 if (x[j] > x[j+1])
				 {
					 temp = x[j+1];
					 x[j+1] = x[j];
					 x[j] = temp;
				 }
			 }
		}
		for (int i = 1 ; i <=n ; i++)
		{
			System.out.print(x[i]+" ");
		}
		sc.close();
	}

}

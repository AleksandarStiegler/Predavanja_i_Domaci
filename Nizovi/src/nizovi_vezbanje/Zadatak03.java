package nizovi_vezbanje;

import java.util.Scanner;

public class Zadatak03 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj clanova niza n : ");
		int n = sc.nextInt();
		
		int x[] = new int [n];
		
		System.out.println("Unesite clanove niza :");
		for ( int i = 0 ; i < x.length ; i++)
		{
			System.out.print("x["+i+"] = ");
			x[i] = sc.nextInt();
			
		}
		int suma = 0;
		for ( int i = 1 ; i < x.length ; i++)
		{
			 if ( (x[i-1] + x[i]) % 2 == 0 )
			 {
				System.out.println(x[i-1] +"  "+ x[i]);
				suma +=( x[i-1] + x[1] );
			
			 }
			 
		}
		System.out.println(suma);
		sc.close();
 // Ne mogu da resim sumu kako treba fali mi znanje u ovom trenutku ali koliko vidim on brlja koje 
	}  // treba da sabere pa se dobijaju pogresni rezultati
	} // Ostavicu ga ovako mozda mi padne na pamet kako da ga resim posle nekog vremena


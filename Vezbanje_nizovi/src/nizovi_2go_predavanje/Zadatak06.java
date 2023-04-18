package nizovi_2go_predavanje;

import java.util.Scanner;

public class Zadatak06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Unesite koliko brojeva posmatramo.");
		int n = sc.nextInt();
		
		int bj[] = new int [100];
		int bd[] = new int [100];
		int broj, j , d;
		for (int i = 0 ; i <= 9; i++)
		{
			bj[i] = 0;
			bd[i] = 0;
		}
		
		System.out.println("Unesite brojeve izmedju 0 i 99.");
		for (int i = 0 ; i < n ; i++)
		{
			System.out.print("broj["+i+"] = ");
			broj = sc.nextInt();
			
			if ( broj >= 0 && broj < 100)
			{
				if (broj < 10)
					j = broj;
				else
				{
					d = broj / 10;
					bd[d] ++;
					j = broj - 10 * d;
				}
				bj[j]++;
			}
				
		}
		System.out.println("\tCifra\tKao J-ca\tKao D-ica ");
		for (int i = 0; i <= 9 ; i++) {
			System.out.println("\t"+i+"\t"+bj[i]+"\t\t"+bd[i]);
		}
		sc.close();
		
	}

}

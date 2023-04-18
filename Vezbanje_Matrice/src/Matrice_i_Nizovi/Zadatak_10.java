package Matrice_i_Nizovi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Zadatak_10 {

	public static void main(String[] args) throws Exception{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite vrednost boda : ");
		double bod = sc.nextDouble();
		System.out.print("Unesite broj radnika : ");
		int radnik = sc.nextInt();
		
		String ime [] = new String [100];
		double brojbod[] = new double [100];
		double kredit[] = new double [100];
		double clanarina[] = new double [100];
		double suma = 0;
		double isplata[] = new double[100];
		System.out.println("Unesite podatke : ");
		for (int i = 1; i <= radnik; i++)
		{
			System.out.print("Ime i prezime : ");
			ime[i]=bfr.readLine();
			System.out.print("\nBroj bodova : ");
			brojbod[i] = sc.nextDouble();
			System.out.print("\nKredit : ");
			kredit[i] = sc.nextDouble();
			System.out.print("\nClanarina : ");
			clanarina[i] = sc.nextDouble();
			
			isplata[i] = bod*brojbod[i] - kredit[i] - clanarina[i];
			suma += isplata[i];
		}
		
		System.out.println("\tR.BR. \tIme_Prez. \tBroj_bodova \tKredit \t Clanarina \tIsplata");
		System.out.println("===============================================================================");
		for (int i = 1; i <= radnik; i++ )
		{
			System.out.println("\t"+i+"\t"+ime[i]+"\t\t"+brojbod[i]+"\t\t"+kredit[i]+"\t   "+clanarina[i]+"\t "+isplata[i]);
		}
		System.out.println("===============================================================================");
		System.out.println("Ukupno za isplatu \t"+suma);
		
		sc.close();
	}

}

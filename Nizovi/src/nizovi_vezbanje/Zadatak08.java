package nizovi_vezbanje;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak08 {

	public static void main(String[] args) throws Exception {
		
		// Algoritam za izracunavanje standardne devijacije
		
		BufferedReader bfr = new BufferedReader (new InputStreamReader(System.in));
		
		System.out.print("Unesite broj clanova niza n : ");
		int n = Integer.parseInt(bfr.readLine());
		double x[] = new double [100];
		
		System.out.println("Unesite clanove niza .");
		for (int i = 1 ; i <= n ; i++)
		{
			System.out.print("x["+i+"] = ");
			x[i] = Double.parseDouble(bfr.readLine());
		}
		/* za izracunavanje standardne devijacije potrebne su nam dve vrednosti suma clanova
		 i suma aritmeticka za posmatran opseg ( ne znam kako bolje da napisem)*/
		
		int konsuma = 0;
		
		for (int i = 1 ; i <= n ; i++)
		{
			
			
			konsuma += Math.pow ((x[i] -(x[i] / n)),2);
			
		}
		double sd ;
		sd = Math.sqrt(konsuma / n);
		System.out.println("Standardna devijacija iznosi "+sd);
		// Dobijeno resenje se razlikuje od profesorovog posto se i formule razlikuju
		// koristio sam neku koju sam nasao na netu ali se razlikuju. Ostavicu ovo ovako i uradicu
		// iznova sa njegovom formulom iz knjige
	}
}
		
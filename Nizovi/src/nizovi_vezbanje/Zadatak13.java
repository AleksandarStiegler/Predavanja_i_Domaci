package nizovi_vezbanje;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Zadatak13 {

	public static void main(String[] args) throws Exception {
	
		// Sastaviti algoritam i napisati program za izracunavanje
		// i stampanje vrednosti prvih 10 Lazandrovih polinoma koristeci
		// rekurentne formule
		// P0(x) = 1 ;  P1(x) = x ; Pn+1 (x) = (2n+1)/(n+1)Pn(x)-n/(n+1)Pn-1(x)
		
		BufferedReader bfr = new BufferedReader( new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#0.000");
		
		System.out.println("Unesite vrednost promenljive x .");
		double x = Double.parseDouble(bfr.readLine());
		
		double L [] = new double [100];
		L[0] = 1;
		L[1] = x;
		
		for (int i = 2; i <= 9 ; i++)
		{
			L[i] = (2 * (i-1) + 1) * L[i-1] / i - (i - 1) * L[i-2] / i;
		}
		
		System.out.println("\tR.BR. \tVred.Pol.");
		for (int i = 0 ; i <= 9 ; i++)
		{
			System.out.println("\t"+i+" \t"+df.format(L[i]));
		}
	}

}

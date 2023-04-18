package Kupa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.DecimalFormat;
import java.util.Scanner;

public class KupaGlavni {

	public static void main(String[] args) throws Exception{
		
		
		// Nisam uspeo da namestim da mi se dimenzije ucitavaju iz fajla pa sam preskocio
		// taj deo, samo cu rezultate da upisem na izlazu
		// Dakle i ulazni i izlazni podatci ce biti upisani u rezultatima
		
		Scanner sc = new Scanner(System.in);
		
		BufferedWriter bfwrite = new BufferedWriter(new FileWriter("rezultat1.txt"));
		
		StringBuilder sb = new StringBuilder();
		DecimalFormat df = new DecimalFormat("#0.00#");
		
		
		String ulaz;
		String izlaz;
		
		System.out.println("Koliko kupa zelite da napravite .");
		int n = sc.nextInt();
		NizKupa nk = new NizKupa(n);
		int i = 0;
		while (i < n) {
			System.out.print("Unesite donji poluprecnik : ");
			double r1 = sc.nextDouble();
			System.out.print("\nUnesite gornji poluprecnik : ");
			double r2 = sc.nextDouble();
			System.out.print("\nUnesite visinu kupe : ");
			double h = sc.nextDouble();
			Kupa k = new Kupa(r1, r2, h);
			nk.dodaj(k);
			
			sb.append("=================================================\n");
			sb.append("              Kupa "+(i+1)+" : \n");
			ulaz = "K("+r1+","+r2+","+h+")\n";
			izlaz = "Zapremina kupe : "+df.format(k.zapremina());
			sb.append(ulaz);
			sb.append(izlaz);
			sb.append("\n\n");
			
			i++;
		}
		
		
		sb.append("Da li je niz kupa popunjen?  => ");
		sb.append(nk.popunjenIliNe());
		sb.append("\n");
		sb.append("Kupa sa najmanjom zapreminom se nalazi na "+(nk.najmanjaZapremina()+1)+" mestu.");
		System.out.println(sb.toString());
		bfwrite.write(sb.toString());
	
	bfwrite.close();
	sc.close();
	// Ovako mi deluje ok radi ono sto zelim, ostaje mi u nekom trenutku da vidim jos
	// kako da uzima vrednosti posteno iz fajla a da ne brlja. Verovatno bi trebao da napravim 
	// fajl i jasno definisem vrednosti za sada oko tog dela odustajem.

	}

}

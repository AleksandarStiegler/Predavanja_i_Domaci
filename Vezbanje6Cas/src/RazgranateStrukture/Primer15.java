package RazgranateStrukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Primer15 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// Zadati su odsecci sa duzinama a, b, c. Sastaviti algoritam i napisati program za ispitivanje da li zadati
		// odseci mogu konstruisati trougao i ako mogu izracunati povrsinu trougla
		
		// E sada bitno je znati da trougao mozemo konstruisati samo ako je ispunjen uslov da je zbir dve strane veci od preostale
		// 3 strane. Ako je to ispunjeno trougao mozemo konstruisati i izracunati njegovu povrsinu preko Heronovog obrasca
		
		double a, b, c, s = 0.0;
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.##");
		
		System.out.println("Unesite vrednosti stranica a , b i c ");
		
		a = Double.parseDouble(bfr.readLine());
		b = Double.parseDouble(bfr.readLine());
		c = Double.parseDouble(bfr.readLine());
		
		if ((a+b>c) && (a+c>b) && (b+c>a))
		{
			s = (a+b+c)/2;
		double p = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Povrsina trougla p = "+ df.format(p));
		}
		else
			System.out.println("Nije moguce konstruisati trougao, samim tim nije moguce izracunati povrsinu istog");
		
		

	}

}

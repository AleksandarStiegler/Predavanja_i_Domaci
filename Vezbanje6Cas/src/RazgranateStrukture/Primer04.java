package RazgranateStrukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Primer04 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		// U odnosu na Scanner input = new Scanner(System.in);
		// Ima dosta vise da se kuca ali je Buffered bolji
		double a , b , y;
		System.out.print("Unesite vrednost a = ");
		a = Double.parseDouble(input.readLine());
		System.out.print("Unesite vrednost b = ");
		b = Double.parseDouble(input.readLine());
		/*
		if (a<0)
			y = Math.min(a,b)/(Math.min(a*a,b* b)+3);
		else 
			y = (1-Math.min(a, b))/(1+Math.max(a,b));*/
		
		// Sada da probamo preko ternarnog izraza da vidim da li sam shvatio to
		
		y = (a<0) ? Math.min(a, b)/(Math.min(a*a,b*b)+3) : (1 - Math.min(a, b))/(1+Math.max(a, b));
		
		DecimalFormat df = new DecimalFormat("#.####");
		System.out.println("Vrednost izraza y = "+df.format(y));
	
		// dakle ? je ternarni operator koji zapravo zamenjuje if odnosno drugim recima ako je uslov ispunjen koristi ovaj izraz
		// dok : je ternarni operator koji menja else tako da je kaze ako prvi uslov nije ispunjen koristi ovaj drugi izraz
	}
	

}

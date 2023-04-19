package RazgranateStrukture;

import java.util.Scanner;

public class Primer18 {

	public static void main(String[] args) {
		
		// y (q,r,s) = min(q,max(r,s)) dakle bez koriscenja Math funkcija
		
		double r, q, s, y;
		Scanner ulaz = new Scanner(System.in);
		System.out.print("Unesite r : ");
		r = ulaz.nextDouble();
		System.out.print("Unesite q : ");
		q = ulaz.nextDouble();
		System.out.print("Unesite s : ");
		s = ulaz.nextDouble();
		ulaz.close();
		
		if (r>s)
			y = r;
		else 
			y = s;
		if (q<y)
			y=q;
		System.out.println("Vrednost funkcije y je "+y);
		
		// Moglo je da se iskoristi i ternarni operator
		// y = (r > s) ? r : s pa onda da se postavi uslov  q<y i da se zavrsi ali je isto !!!
		
		
	}

}

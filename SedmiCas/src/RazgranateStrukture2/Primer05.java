package RazgranateStrukture2;

import java.util.Scanner;

public class Primer05 {
	public static void main(String[] args)  {
		// Ispitati da li je broj pozitivan negativan ili jednak nuli

	
		Scanner sc = new Scanner(System.in);
		int broj;

		System.out.print("Unesite broj :");
		broj = sc.nextInt();
        
		if (broj>0)
		{	System.out.println("Broj je pozitivan !");  }
		else if (broj<0)
		{   System.out.println("Broj je negativan !");   }
		else if(broj==0)
		{   System.out.println("Broj je nula !");  }
		else
		{	System.out.println("Pogresan unos !");  }
		sc.close();

}

}

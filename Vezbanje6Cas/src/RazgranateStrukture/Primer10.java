package RazgranateStrukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primer10 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// Napisati program kojim se od 3 ucitana broja a, b i c nalazi najveci broj
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite vrednost broja a, b i c");
		double a = 0.0, b = 0.0, c = 0.0, temp;
		a = Double.parseDouble(ulaz.readLine());
		b = Double.parseDouble(ulaz.readLine());
		c = Double.parseDouble(ulaz.readLine());
		
		// Resavanje (obrada) problema
		
		 if (a == b && b == c )
		{
			System.out.println("Uneli ste pogresne vrednosti sva tri broja su jednaka");
		}
		
		temp = a ;
		
	    if (b > a && b >= c)
			{temp = b;}
		else if (c>a && c>=b)
		{
			temp = c;
		}
		else if (b>a && b<=c)
		{
			temp = c;
		}
		else if (c> a && b >= c)
		{
			temp = b;
		}
		/*else if (a == b && b == c )
		{
			System.out.println("Uneli ste pogresne vrednosti sva tri broja su jednaka");
		}*/
			
		System.out.println("Najveci broj je "+temp);	
		
		// Ne znam kako da ga sprecim da mi stampa i drugi deo kad su 3 ista broja hteo bih da mi samo pokaze da je pogresan unos
		// mada ni ovako nije lose, meh saznacu u nekom trenutku
		
		// Ali ovo resenje je dosta komplikovano doduse ispravno ali previse ispitivanja moze mnogo elegantnije to cu da uradim
		// u pimeru 10a

	}

}

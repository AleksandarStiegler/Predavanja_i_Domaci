package RazgranateStrukture;

import java.util.Scanner;

public class Primer10a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Za unete brojeve a , b i c odrediti koji je najveci
		Scanner ulaz = new Scanner(System.in);
		
		double a, b, c, max ;
		
		System.out.println("Unesite vrednosti za brojeve a, b i c ");
		a = ulaz.nextDouble();
		b = ulaz.nextDouble();
		c = ulaz.nextDouble();
		
		// Obrada resenja
		max = a;
		
		if (a==b && b==c)
		{
			System.out.println("Sva tri broja su jednaka");
		}
	
			
		else if (b>max)
		{
			max = b;
		}
		else if (c>max)
		{
			max = c;
		}
		
		System.out.println("Najveci broj je "+max);
		// Mnogo elegantnije manje linija koda i naravno brze ce da radi zadatak ali dobro ovako se i uci
		// Svaki zadatak nesto novo i to je to. E sad nije bitno da samo prekucamo sta se desava nego i kako
		// Ovde fali malo znanja ali bismo mi sigurno mogli da vratimo korisnika da ponovo unese brojeve
		// Ali necu da gubim vreme iskreno ovako je zanimljivo pratim i razmisljam sta mogu da uradim
		ulaz.close();
	}

}

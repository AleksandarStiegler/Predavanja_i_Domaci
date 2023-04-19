package IfElseFor;

import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {
		
		
		// Napisati program kojim se za uneti datum i mesec ispisuje horoskopski znak
		
		Scanner ulaz = new Scanner(System.in);
		String mesec ;
		int dan ;
		System.out.println("Unesite mesec ");
		mesec = ulaz.nextLine();
		System.out.println("Unesite dan rodjenja");
		dan = ulaz.nextInt();
		ulaz.close();
		
		if (mesec.equals("Januar"))
		{
			if(dan >= 1 && dan <= 20)
				System.out.println("Jarac");
			else if (dan > 20)
				System.out.println("Vodolija");
		}
		if (mesec.equals("Februar"))
		{
			if (dan >= 1 && dan <= 19)
				System.out.println("Vodolija");
			else if (dan > 19)
				System.out.println("Riba");
				
		}
		if (mesec.equals("Mart"))
		{
			if(dan >= 1 && dan <= 20)
				System.out.println("Riba");
			else if (dan > 20)
				System.out.println("Ovan");
		}
		if (mesec.equals("April"))
		{
			if(dan >= 1 && dan <= 20)
				System.out.println("Ovan");
			else if (dan > 20)
				System.out.println("Bik");
		}
		if (mesec.equals("Maj"))
		{
			if(dan >= 1 && dan <= 21)
				System.out.println("Bik");
			else if (dan > 21)
				System.out.println("Blizanci");
		}
		if (mesec.equals("Jun"))
		{
			if(dan >= 1 && dan <= 21)
				System.out.println("Blizanci");
			else if (dan > 21)
				System.out.println("Rak");
		}
		if (mesec.equals("Jul"))
		{
			if(dan >= 1 && dan <= 22)
				System.out.println("Rak");
			else if (dan > 22)
				System.out.println("Lav");
		}
		if (mesec.equals("Avgust"))
		{
			if(dan >= 1 && dan <= 23)
				System.out.println("Lav");
			else if (dan > 23)
				System.out.println("Devica");
		}
		if (mesec.equals("Septembar"))
		{
			if(dan >= 1 && dan <= 23)
				System.out.println("Devica");
			else if (dan > 23)
				System.out.println("Vaga");
		}
		if (mesec.equals("Oktobar"))
		{
			if(dan >= 1 && dan <= 23)
				System.out.println("Vaga");
			else if (dan > 23)
				System.out.println("Skorpija");
		}
		if (mesec.equals("Novembar"))
		{
			if(dan >= 1 && dan <= 22)
				System.out.println("Skorpija");
			else if (dan > 22)
				System.out.println("Strelac");
		}
		if (mesec.equals("Decembar"))
		{
			if(dan >= 1 && dan <= 21)
				System.out.println("Strelac");
			else if (dan > 21)
				System.out.println("Jarac");
		}
		/* Kao sto mogu da vidim kroz rezultate ovde ima mnogo mnogo mesta za gresku, kad koristimo string ukoliko unos
		 * odudara od naseg posmatranog nece se nista desiti, morali bi da naglasimo da je prvo slovo veliko pa onda mala....
		 */
	}

}

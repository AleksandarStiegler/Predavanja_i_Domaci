package CaseSwitch;

import java.util.Scanner;

public class Zadatak01 {

	public static void main(String[] args) {

		// Switch Case .... pocinje sa
		// switch ( uslov )
		// {
		// case 1: {
		// break ;
		// }
		// case 2 :
		// {
		// obrada
		// break ;
		// }
		// default : --- tu smestamo sve sto nije obuhvaceno prethodnim uslovima ( case
		// )

		int ocena;
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite ocenu ");
		ocena = input.nextInt();
		input.close();
		/*
		 * switch (ocena) 
		 * { case 5: 
		 * { 
		 * System.out.print("Odlican. ");
		 *  break; 
		 *  } 
		 *  case 4:
		 *   {
		 * System.out.print("Vrlo dobar. "); 
		 * break;
		 *  } 
		 *  case 3: 
		 *  {
		 * System.out.print("Dobar. ");
		 *  break;
		 *   } 
		 *   case 2:
		 *    {
		 * System.out.print("Dovoljan. ");
		 *  break;
		 *   } 
		 *   case 1:
		 *    {
		 * System.out.print("Nedovoljan. "); 
		 * break; 
		 * } 
		 * default: 
		 * {
		 * System.out.print("Unesena vrednost je izvan posmatranog opsega");
		 * 
		 * } }
		 */
		// Drugi nacin if i else if

		if (ocena == 5) 
		{
			System.out.print("Odlican. ");
		} 
		else if (ocena == 4)
		{
			System.out.print("Vrlo dobar . ");
		} 
		else if (ocena == 3)
		{
			System.out.print("Dobar . ");
		} 
		else if (ocena == 2) 
		{
			System.out.print("Dovoljan. ");
		} 
		else if (ocena == 1) 
		{
			System.out.print("Nedovoljan . ");
		} 
		else {
			System.out.print("Pogresan unos . ");
		}
 // case juri samo uslov a if ispituje svako ispitivanje dok ne dodje do pravog resenja
 // if else je jedan blok a ako idemo if pa if pa if to je svaki poseban blok
	}
	}

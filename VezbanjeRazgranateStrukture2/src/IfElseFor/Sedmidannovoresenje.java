package IfElseFor;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sedmidannovoresenje {

	public static void main(String[] args) throws Exception{
		
		// 7-mi dan
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int d, m, g;
		
		System.out.print("Unesite redni broj dana u mesecu :");
		d = Integer.parseInt(bfr.readLine());
		System.out.print("Unesite mesec 1 - 12 :");
		m = Integer.parseInt(bfr.readLine());
		System.out.print("Unesite godinu :");
		g = Integer.parseInt(bfr.readLine());
		
		int nd = d + 7;
		
		if ( d < 1 || m < 1 || m > 12 || g < 0 )
			System.out.println("Pogresan unos , dan >= 1 ; mesec ide od 1 do 12 ; god > 0. Pokusajte ponovo");
		
		else 
			switch (m)
			{
			case 1, 3, 5, 7, 8, 10, 12:
			{
				if ( d <= 31 && nd > 31 )
				{
					nd = nd - 31;
					m ++;
					System.out.println("Novi datum je "+nd+"."+m+"."+g+".");
				}
					if ( m > 12)
					{
						m = 1;
						g++;
						System.out.println("Novi datum je "+nd+"."+m+"."+g+".");
					}
				
				 if ( d > 31)
					System.out.println(" Pogresan unos uneti mesec nema vise od 31 dan , unesite ponovo.");
				
			break;
				}	
			case 4, 6, 9, 11:
			{
				if ( d <= 30 && nd > 30)
				{
					nd = nd - 30;
					m ++;
					System.out.println("Novi datum je "+nd+"."+m+"."+g+".");
				}
				 if ( d > 30)
					System.out.println(" Pogresan unos uneti mesec nema vise od 30 dana , unesite ponovo.");
				
				break;
			}
			case 2 :
			{
				if ((g % 400 == 0 || g % 4 == 0 && g % 100 != 0 ) && d <= 29 && nd > 29)
				{
					nd = nd - 29;
					m++;
					System.out.println("Novi datum je "+nd+"."+m+"."+g+".");
				}
				 if ( g % 4 != 0 && d <= 28 && nd > 28)
				 {
					nd = nd - 28;
					m++;
					System.out.println("Novi datum je "+nd+"."+m+"."+g+".");
				}
				 if ( d > 29)
					System.out.println(" Pogresan unos uneti mesec nema vise od 28 dana u regularnoj godini ili 29 u prestupnoj , unesite ponovo.");
				
				break;
			}
			
			}
		
		System.out.println("Novi datum je "+nd+"."+m+"."+g+".");
		
	} // Program radi kako treba dok se unose pravilne vrednosti, kad izadjemo iz njih dobijamo
	// neke budalastine, koje ne bi trebao da stampa posto on pokaze gresku prvo, meh kad budem imao
}	// vise znanja znacu kako da zaobidjem to, ali van toga bitno je da program radi mada je prvo resenje bolje mada je slozenjije
/// AAAAAA to sam imao kao problem i u prethodnom resio sam tako sto sam stampanje uradio u uslovima
// Gledajuci oba zadatka video sam par propusta koji nisu veliki sad mogu da uradim zadatak bez problema tako da cu to da uradim
// kao novi zadatak a ove cu da ostavim kao primere da vidim gde sam pogresio mada van toga 
// logika je bila solidna i mozda ne bih uzeo 100 poena na zadatku ali 85-90 sigurno.
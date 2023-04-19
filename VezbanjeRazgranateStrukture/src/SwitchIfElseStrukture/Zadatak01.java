package SwitchIfElseStrukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak01 {

	public static void main(String[] args) throws Exception {

		// Zadatak 4 Predavanje 9

		// Unos podataka

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int d, m, g;

		System.out.print("Unesite broj dana : ");
		d = Integer.parseInt(bfr.readLine());
		System.out.print("Unesite mesec : ");
		m = Integer.parseInt(bfr.readLine());
		System.out.print("Unesite godinu : ");
		g = Integer.parseInt(bfr.readLine());

		// Obrada problema
		int nd = d + 7;

		if (d>=1 && d<=31 && m>=1 && m<=12 &&  (g % 400 == 0 || g % 4 == 0 && g % 100 !=0))
		{
			switch (m)
			{
			case 1, 3, 5, 7, 8, 10:
			{
				if (nd > 31)
				{
					nd = nd - 31;
					m = m+1;
					break;
				}
			}
			case 4, 6, 9, 11:
			{
				if (nd > 30)
				{
					nd = nd - 30;
					m = m + 1 ;
					break;
				}
			}
			case 2:
			{
				if (nd > 29)
				{
					nd = nd - 29;
					m = m + 1;
					break;
				}
			}
			case 12:
			{
				if (nd > 31)
				{
					nd = nd - 31;
					m = 1;
					g = g + 1;
				}
			}
			default :
	
			}
		}
		else if (d>=1 && d<=31 && m>=1 && m<=12 && g % 4 != 0)
		{
			switch (m)
			{
			case 1, 3, 5, 7, 8, 10:
			{
				if (nd > 31)
				{
					nd = nd - 31;
					m = m + 1;
					break;
				}
			}
			case 4, 6, 9, 11:
			{
				if (nd > 30)
				{
					nd = nd - 30;
					m = m + 1;
					break;
				}
			}
			case 2:
			{
				if (nd > 28)
				{
					nd = nd - 28;
					m = m + 1;
					break;
				}
			}
			case 12:
			{
				if (nd > 31)
				{
					nd = nd - 31;
					m = 1;
					g = g + 1;
				}
			}
			default :
			
		
			
		
				}
		
	}
		System.out.println("Novi datum je "+nd+"."+m+"."+g+".");
	}}
// Uspeo sam da ga resim ali problem je sto ne zna da radi ako idemo van parametara i program ne radi
// ne znam sta je problem, iskreno nemam dovoljno znanja ali napredujem. Zadatak radi kako treba unutar parametara
// osim februara nije dobro ogranicenje hmm moracu ponovo na drugi nacin


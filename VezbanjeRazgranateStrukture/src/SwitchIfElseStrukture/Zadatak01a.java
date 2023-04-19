package SwitchIfElseStrukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak01a {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		int d, m, g;

		System.out.print("Unesite broj dana : ");
		d = Integer.parseInt(bfr.readLine());
		System.out.print("Unesite mesec : ");
		m = Integer.parseInt(bfr.readLine());
		System.out.print("Unesite godinu : ");
		g = Integer.parseInt(bfr.readLine());
		
		int nd = d + 7;
		if (d<1 || d>31 || m<1 || m>12 || g<0)
		{
			System.out.println("Pogresan unos");
		}
		else if ((g % 400 == 0 || (g % 4 == 0 && g % 100 != 0)) && d >=1 && d <= 31 && m>=1 && m <=12 && g>=0)
		{
			switch (m)
			{
			case 1, 3, 5, 7, 8, 10:
			{
				if (nd>31)
				{
					nd = nd - 31;
					m = m + 1;
					System.out.println("Novi datum je "+nd+"."+m+"."+g+".");
					break;
				}
			}
			case 4, 6, 9, 11 :
			{
				if (d<=30 && nd > 30)
				{
					nd = nd - 30;
					m = m +1 ;
					System.out.println("Novi datum je "+nd+"."+m+"."+g+".");
				}
				else
					System.out.println("Pogresan unos");
				break;
			}
			case 2:
			{
				if (d<=29 && nd>29)
				{
					nd = nd - 29;
					m = m+ 1;
					System.out.println("Novi datum je "+nd+"."+m+"."+g+".");
				}
				else
					System.out.println("Pogresan unos");
				break;
			}
			case 12:
			{
				if (nd > 31)
				{
					nd = nd - 31;
					m = 1;
					g = g + 1;
					System.out.println("Novi datum je "+nd+"."+m+"."+g+".");
				}
				else
					System.out.println("Novi datum je "+nd+"."+m+"."+g+".");
				break;
			}
			
			}
		
		}
		
		else if (g % 4 != 0 && d >=1 && d <= 31 && m>=1 && m <=12 && g>=0 )
		{
			switch (m)
			{
			case 1, 3, 5, 7, 8, 10:
			{
				if (nd>31)
				{
					nd = nd - 31;
					m = m + 1;
					System.out.println("Novi datum je "+nd+"."+m+"."+g+".");
					break;
				}
			}
			case 4, 6, 9, 11 :
			{
				if (d<=30 && nd > 30)
				{
					nd = nd - 30;
					m = m + 1;
					System.out.println("Novi datum je "+nd+"."+m+"."+g+".");
				}
				else
					System.out.println("Pogresan unos");
				break;
			}
			case 2:
			{
				if (d<=28 && nd>28)
				{
					nd = nd - 28;
					m = m + 1;
					System.out.println("Novi datum je "+nd+"."+m+"."+g+".");
				}
				else
					System.out.println("Pogresan unos");
				break;
			}
			case 12:
			{
				if (nd > 31)
				{
					nd = nd - 31;
					m = 1;
					g = g + 1 ;
					System.out.println("Novi datum je "+nd+"."+m+"."+g+".");
			
				}
				else
					System.out.println("Novi datum je "+nd+"."+m+"."+g+".");
				break;
			}
			
			}
		}
		
		

	}

}
// Ovaj zadatak sad radi u fulu svaka greska samo izbaci pogresan unos i bas sam zadovoljan kako sam ga uradio
// Pogledacu neki primer koje su kolege uradile pa da vidim mozda dobijem jos jednu ideju. Doduse ovo je ideja koju sam vukao od
// pocetka ( dobro lazem  posto je ovo nadogradnja na prvobitnu ideju posto su uslovi bili losi zato i nije radilo kako treba )
// Necu brisati Zadatak01 neka ostane kao primer za secanje
// Jos samo kako da se izvucem da ne pisem u svakom pod delu stampanje ali iz nekog razloga on mi pokaze pogresan unos i pogresno
// resenje ako ne idem ovako. Treba jos znanja ali za sada SUPER HAPPY

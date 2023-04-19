package RazgranateStrukture;

import java.util.Scanner;

public class Primer13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Napisati program kojim se za uneti trocifreni broj dobija najveci moguci broj sastavljen
		// od te 3 cifre
		
		
		// Unost podataka
		
		Scanner ulaz = new Scanner(System.in);
		int x, s = 0 , d = 0 , j = 0 , t ;
		System.out.print("Unesite trocifren broj :");
		x = ulaz.nextInt();
		ulaz.close();
		
		// Obrada problema\
		// Ajde da probamo da zaobidjemo glupe greske kao sto su vise ili manje cifara
		
		if (x<100 || x>999)
		{
			System.out.println("Uneli ste pogresan broj");
		}
			else
			{	
				s = x / 100;
				d = (x % 100) / 10;
				j = x % 10 ;
			}
			int max = 0;
			
			if (d > s)
			{
				max = d ;
				d = s ;
				s = max ;
			}
			if (j > s)
			{
				max = j ;
			    j = s ;
			    s = max ;
			}
			if ( j > d)
			{
				t = d;
				d = j ;
				j = t;
			}
			System.out.println("Novi broj je "+(s*100 + d*10 + j));
			System.out.println("Proizvod cifara je "+ s*d*j+ " a zbir "+ (s+d+j));
			
			// Moracu da prodjem jos neke zadatke sa zamenom mesta pa cemo da se igramo sa nesto vise cifara
			// Razlog je jednostavan hocu da malo shvatim razmisljanje kako i sta se desava
		}
			
		
		}



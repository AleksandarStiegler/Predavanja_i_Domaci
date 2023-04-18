package VisestrukogrananjeIFUIFu;

import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {

		// Zadatak 4 SEDMIDAN

		Scanner sc = new Scanner(System.in);
		int d, m, g = 0 ;
		System.out.print("Unesite redni broj dan-a u mesecu :");
		d = sc.nextInt();
		System.out.print("Unesite redni broj meseca : ");
		m = sc.nextInt();
		System.out.print("Unesite broj godine : ");
		g = sc.nextInt();
		sc.close();
		
		
		d=d+7;
		if (g % 400 == 0 || d%4==0 && g%100!=0) 
		{
			if (m == 1 || m == 3 || m == 5 || m == 7 || m==8 || m == 10 && d>31)
				
				{
					d = d - 31;
					m = m + 1;
				}
				
			if (m == 12 && d>31)
			{
				
					d = d  - 31;
					m =  1;
					g = g + 1;
			}
			  
				if ( m == 4 || m == 6 || m == 9 || m == 11 && d>30)
			{
				
				{
					d = d - 30;
					m = m + 1 ;
				}
			}
			
				if (m==2 && d>29)		
			{
				
				{
					d = d-29;
					m = m +1;
				}
			}
			else
			{
				if (m == 1 || m == 3 || m == 5 || m == 7 || m==8 || m == 10 && d>31)
					
					{
						d = d - 31;
						m = m + 1;
					}
					
				 if (m == 12 && d>31)
				{
					
						d = d  - 31;
						m =  1;
						g = g + 1;
				}
				  
					if ( m == 4 || m == 6 || m == 9 || m == 11 && d>30)
				{
					
					{
						d = d - 30;
						m = m + 1 ;
					}
				}
				
				if (m==2 && d > 28)		
				{
					
					{
						d = d-28;
						m = m +1;
					}
				}
		
			
		}
			}
		System.out.println("Nov datum je "+d+"."+m+"."+g+".");
		}
	}

// Uraditi ovaj zadatak na ovaj nacin na svaki nacin mora da proverimo zasto je problem

// Poceti ispocetka pa videti gde je problem
		

		
		
		


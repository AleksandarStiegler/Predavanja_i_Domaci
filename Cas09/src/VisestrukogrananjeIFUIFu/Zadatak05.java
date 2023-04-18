package VisestrukogrananjeIFUIFu;

import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {
		
		
		// Zadatak 5
		
		Scanner sc = new Scanner(System.in);
		int d, m;
		
		System.out.println("Unesite dan u mesecu");
		d = sc.nextInt();
		System.out.println("Unesite mesec");
		m = sc.nextInt();
		sc.close();
		if (m==1 && d >=21 && d<=31|| m==2 && d>=1 && d <= 19 )	
		{
			System.out.println("Vodolija");
		}
		else if (m==2 && d >= 20 && d <= 29 || m == 3 && d >= 1 && d <= 20)
		{
			System.out.println("Riba");
		}
		else if (m==3 && d >= 21 && d<= 31 || m==4 && d>= 1 && d<=20 )
		{
			System.out.println("Ovan");
		}
		else if (m==4 && d>=21 && d<=30 || m==5 && d>=1 && d<=21)
		{
			System.out.println("Bik");
		}
		else if (m==5 && d>=22 && d<=31 || m==6 && d>=1 && d<= 21)
		{
			System.out.println("Blizanci");
		}
		else if (m==6 && d>=22 && d<=30 || m==7 && d>=1 && d<=22)
		{
			System.out.println("Rak");
		}
		else if (m==7 && d>=23 && d<=31 || m==8 && d>=1 && d<=22)
		{
			System.out.println("Lav");
		}
		else if (m==8 && d>=23 && d<=31 || m==9 && d>=1 && d<=22)
		{
			System.out.println("Devica");
		}
		else if (m==9 && d>=23 && d<=30 || m==10 && d>=1 && d<=23)
		{
			System.out.println("Vaga");
		}
		else if (m==10 && d>=24 && d<=31 || m==11 && d>=1 && d<=22)
		{
			System.out.println("Škorpija");
		}
		else if (m==11 && d>=23 && d<=30 || m==12 && d>=1 && d<=21)
		{
			System.out.println("Strelac");
		}
		else if (m==12 && d>=22 && d<=31 || m==1 && d>=1&& d<=20)
		{
			System.out.println("Jarac");
		}
		else 
			System.out.println("Nije dobar unos");
	}

}

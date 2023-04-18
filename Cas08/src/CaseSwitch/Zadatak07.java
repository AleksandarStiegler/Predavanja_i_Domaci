package CaseSwitch;

import java.util.Scanner;

public class Zadatak07 {

	public static void main(String[] args) {
		
		// Ako se sa ulaza ucitavaju tri prirodna broja k1, k2 i k3 koji oznacavaju redni
		// broj dana u godini, ispitati da li oznacavanju isti dan u nedelji
		
		Scanner ulaz = new Scanner (System.in);
		int k1, k2, k3;
		
		System.out.println("Unesite tri broja k1, k2 i k3 od 1 do 365");
		k1 = ulaz.nextInt();
		k2 = ulaz.nextInt();
		k3 = ulaz.nextInt();
		
		ulaz.close();
		
		if (k1%7==1 && k2%7==1 && k3%7==1)
		{
			System.out.println("Izabrani dani oznacavaju isti dan u nedelji ");
		}
		else if (k1%7==2 && k2%7==2 && k3%7==2)
		{
			System.out.println("Izabrani dani oznacavaju isti dan u nedelji ");
		}
		else if (k1%7==3 && k2%7==3 && k3%7==3)
		{
			System.out.println("Izabrani dani oznacavaju isti dan u nedelji");
		}
		else if (k1%7==4 && k2%7==4 && k3%7==4)
		{
			System.out.println("Izabrani dani oznacavaju isti dan u nedelji");
		}
		else if (k1%7==5 && k2%7==5 && k3%7==5)
		{
			System.out.println("Izabrani dani oznacavaju isti dan u nedelji");
		}
		else if (k1%7==6 && k2%7==6 && k3%7==6)
		{
			System.out.println("Izabrani dani oznacavaju isti dan u nedelji, subota");
		}
		else if (k1%7==0 && k2%7==0 && k3%7==0)
		{
			System.out.println("Izabrani dani oznacavaju isti dan u nedelji ");
		}
		else
			System.out.println("Izabrani dani oznacavaju nisu isti dan u nedelji");
	
	
	    
	
	
	}
	
	
		
	}



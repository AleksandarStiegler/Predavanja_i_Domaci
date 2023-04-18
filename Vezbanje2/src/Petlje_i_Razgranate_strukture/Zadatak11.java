package Petlje_i_Razgranate_strukture;

import java.util.Scanner;

public class Zadatak11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char x;
		System.out.println("Unesite slovo ");
		x = sc.next().charAt(0);
		
		if ( x >= '0' && x <= '9')
		{
			System.out.println("Uneli ste cifru "+x);
		}
		else if (x>= 'a' && x <= 'z' || x >= 'A' && x <= 'Z')
	
		{
			switch (x)
			{
			case 'a' , 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U' :
			{
				System.out.println("Uneli ste samoglasnik "+x);
				break;
			}
			
			default :
			
				System.out.println("Uneli ste suglasnik "+x);
			
		}

	}
		else
		{
			System.out.println("Uneli ste specijalan znak "+x);
		}
		sc.close();
}}

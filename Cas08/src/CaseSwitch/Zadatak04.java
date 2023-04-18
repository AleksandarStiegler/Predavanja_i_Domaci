package CaseSwitch;

import java.util.Scanner;

public class Zadatak04 {

	public static void main(String[] args) {
		
		// na osnovu unesenog kvadranta ispisati vrednosti za x i y

		byte kvadrant;
		
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite kvadrant");
		kvadrant = ulaz.nextByte();
		ulaz.close();
	/*	
		switch (kvadrant)
		{
		case 1:
		{
			System.out.println("Vrednosti su od 0 do 90");
			break;
		}
		case 2:
		{
			System.out.println("Vrednosti su od 90 do 180");
			break;
		}
		case 3:
		{
			System.out.println("Vrednosti su od 180 do 270");
			break;
		}
		case 4:
		{
			System.out.println("Vrednosti su od 270 do 360");
			break;
		}
	    default :
	    	System.out.println("Pogresan unos");
		} */
	
	  if (kvadrant == 1)
	  {
		  System.out.println("Vrednosti su od 0 do 90");
	  }
	  else if (kvadrant == 2)
	  {
		  System.out.println("Vrednosti su od 90 do 180");
	  }
	  else if (kvadrant == 3)
	  {
		  System.out.println("Vrednosti su od 180 do 270");
	  }
	  else if (kvadrant == 4)
	  {
		  System.out.println("Vrednosti su od 270 do 360");
	  }
	  else 
		  System.out.println("Pogresan unos");
	// unutar switch case strukture ne mozemo da koristimo uslove za opsege
	
	}
	  
	
}	


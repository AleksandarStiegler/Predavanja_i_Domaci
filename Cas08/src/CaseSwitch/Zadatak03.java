package CaseSwitch;

import java.util.Scanner;

public class Zadatak03 {

	public static void main(String[] args) {
		// napisati program kojim se odredjuje da li je suglasnik ili
		// samoglasnik

		char x;
		Scanner ulaz = new Scanner(System.in);
		System.out.println("Unesite slovo");
		x = ulaz.next().charAt(0);
		ulaz.close();
/*
		switch (x) {
		
		case 'a': {
			System.out.println("Samoglasnik");
			break;
		}
		case 'A': {
			System.out.println("Samoglasnik");// moze case malo i veliko zajedno
			break;
		}
		case 'e': case 'E':{
			System.out.println("Samoglasnik");
			break;
		}
		
		
		case 'i': case 'I':{
			System.out.println("Samoglasnik");
			break;
		}
		
		case 'o': case 'O':{
			System.out.println("Samoglasnik");
			break;
		
		}
		case 'u': case 'U':{
			System.out.println("Samoglasnik");
			break;
		}
		
		default:
			System.out.println("Suglasnik");
		
		}
	*/
		if (x== 'a'||x=='A'||x=='e'||x=='E'||x=='o'||x=='O'||x=='u'||x=='U'||x=='i'||x=='I')
		{
			System.out.println("Samoglasnik");
		}
		else
			System.out.println("Suglasnik");
			
		
	}
	
}


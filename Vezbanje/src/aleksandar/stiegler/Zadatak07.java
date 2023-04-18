package aleksandar.stiegler;

import java.util.Scanner;

public class Zadatak07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Program za pretvaranje kilobajta u bajte
		
		Scanner input= new Scanner(System.in);
		System.out.println("Unesite velicinu fajla u kB ");
		int kB = input.nextInt();
		
		System.out.println("Velicina fajla u bajtima je "+ 1024*kB);
		input.close();
				
		
		

	}

}
 
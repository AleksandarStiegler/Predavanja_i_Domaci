package Nastavak;

import java.util.Scanner;

public class Primer03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite broj x ");
		int x = input.nextInt();
		
		if (x % 2== 0 && x % 3== 0)
			
		{	System.out.println("Broj je deljiv sa brojevima 2 i 3");  }
		else // Moze i bez ovoga nije trazeno ali ko ga sisa
			System.out.println("Uneti broj nije deljiv sa brojevima 2 i 3");
		
    input.close();
	}

}

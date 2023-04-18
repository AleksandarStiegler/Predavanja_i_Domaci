package aleksandar.stiegler;

import java.util.Scanner;

public class Primer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite vrednost a ");
        int a = input.nextInt();
        System.out.println("Unesite vrednost b ");
        int b = input.nextInt();
        
        if(b!=0)
        	System.out.println("Resenje je "+a/b);
        else
        	System.out.println("Deljenje nulom ");
		
	}

}

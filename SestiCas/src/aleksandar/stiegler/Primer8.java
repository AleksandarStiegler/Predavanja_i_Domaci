package aleksandar.stiegler;

import java.util.Scanner;

public class Primer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesite vrednost a ");
        int a = input.nextInt();
        System.out.println("Unesite vrednost b ");
        int b = input.nextInt();
        int z;
        
        if (a%2!=0 && b%2==0)
        	z = a + b;
        else
        	z = a*b;
        	
        	System.out.println("z = "+z);
        	
	}

}

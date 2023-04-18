package aleksandar.stiegler;

import java.util.Scanner;

public class IzdvajanjeCifara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner input = new Scanner(System.in);
     
     System.out.println("Unesite dvocifren broj ");
     int b = input.nextInt();
     
     int d , j ;
      d = b / 10;
      j = b % 10;
      System.out.println("broj = " + b + " " + "cifra jedinica = " + j +" " + "cifra desetica = " + d);
     
	}

}

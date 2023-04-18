package aleksandar.stiegler;

import java.util.Scanner;

public class Zadatak12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Izdvojiti cifre upisanog trocifrenog broja
		
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite trocifren broj x = ");
		int x = input.nextInt();
		
		int s, d, j;
		s = x / 100;
		d = (x%100)/10;
		j = x % 10;
		
		System.out.println("Za uneseni broj x cifra stotina je "+s+" desetica je "+d+" a jedinica je "+j);
		input.close();

	}

}

package RazgranateStrukture2;

import java.util.Scanner;

public class Primer06cifraznakilispecijalniznak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite karakter ");
		char znak = sc.next().charAt(0);
					
		if (znak>='A' && znak<='Z' )
		{	System.out.println("Unesen karakter je veliko slovo "); }
		else if ( znak >='a'&& znak<='z')
		{	System.out.println("Unesen karakter je malo slovo"); }
		else if (znak >='0' && znak<='9')
		{	System.out.println("Unesen karakter je cifra"); }
		else
		{	System.out.println("Unesen karakter je specijalan simbol"); }

		sc.close();
		
			}

}
// Iskreno veoma bitno posto nisam imao pojma kako se koriste char komande
// Pored toga kako smo mogli da odredimo opseg za karaktere
// Koristimo alfabet i cifre pa smo mogli da idemo od 0 do 9
// a za male i velike znakove je onako
// charAt(0) uzima prvi karakter i to samo 1
// zato koristimo charAt zbog poziciji



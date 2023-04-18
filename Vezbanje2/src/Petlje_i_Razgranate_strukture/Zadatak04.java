package Petlje_i_Razgranate_strukture;

public class Zadatak04 {
	

	public static void main(String[] args) {
		
		// Napsiati program za ispisivanje malih i velikih slova pomocu for, while i do while petlji
		// Aj da probamo
		
		// For petlja
	/*	
		System.out.println("Velika slova");
		for ( char i = 'A'; i <= 'Z'; i++)
		{
			
			System.out.print("\t"+i);
		}
		System.out.println("\nMala slova");
		for ( char k = 'a'; k <= 'z'; k++)
		{
			
			System.out.print("\t"+k);
		}  */
		// While petlja
	 /* 
		char i = 'A'; char k = 'a';
		System.out.println("Velika slova");
		while ( i <= 'Z')
		{
			System.out.print("\t"+i);
			i++;
		}
		System.out.println("\nMala slova");
		while ( k <= 'z' )
		{
			System.out.print("\t"+k);
			k++;
		}   */
		
		// Do while petlja
		
		char i = 'A'; char k = 'a';
		System.out.println("Velika slova");
		do
		{
			System.out.print("\t"+i);
			i++;
		}
		while (i <= 'Z');
		System.out.println("\nMala slova");
		do 
		{
			System.out.print("\t"+k);
			k++;
		}
		while (k <= 'z');
		
	}
}
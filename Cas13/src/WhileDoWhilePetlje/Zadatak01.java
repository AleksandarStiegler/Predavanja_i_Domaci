package WhileDoWhilePetlje;

public class Zadatak01 {

	public static void main(String[] args) {
		
		// Napisati program kojim se stampaju prvih 10 prirodnih brojeva
		
		// Pomocu for petlje
	//	for (int i=1 ; i <= 10 ; i++)
	//		System.out.println(i);
		
		// Pomocu while petlje
		
		int i = 1;  // moze i obrnuto i = 10  while ( i >= 1 ) pa posle stampanja i--
		while ( i <= 10 ) {
			System.out.println(i);
			i++;
		}
		
	}

}

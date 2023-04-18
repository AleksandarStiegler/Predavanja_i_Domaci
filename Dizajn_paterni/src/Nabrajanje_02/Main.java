package Nabrajanje_02;

public class Main {

	public static void main(String[] args) {

	/* Sva nabrajanja imaju 2 unapred definisane metode :
	 * 1. values() - vraca niz koji sadrzi listu konstanti definisanih u nabrajanju
	 * 2. valuesOf() - vraca konstantu iz nabrajanja cija vrednost odgovara
	 * znakovnom nizu prosledjenom u argumentu
	 */
		
		Boja b;
		
		System.out.println("Boje : ");
		
		Boja nizBoja[] = Boja.values();
		
		for (Boja c : nizBoja) {
			System.out.print(c+" ");
		}
		
		Boja c1;
		c1 = Boja.valueOf("Zuta"); // vvraca vrednost iz nabrajanja koja
		// odgovara imenu zadate konstante
		
		System.out.println("\nBoja : "+c1);
	

	}

}

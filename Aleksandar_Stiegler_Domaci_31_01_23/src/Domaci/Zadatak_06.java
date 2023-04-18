package Domaci;

public class Zadatak_06 {

	public static void main(String[] args) {
		
		// Napisati program koji pretvara dekadni broj {0,1,2,3,4,5,6,7,8,9} u binarni{0,1}
		
		int i = 0;
		while (i < 10) {
			String s = Integer.toBinaryString(i);
			System.out.println("Broj "+ i +", u binarnom obliku izgleda "+s);
			i++;
		}

	}

}

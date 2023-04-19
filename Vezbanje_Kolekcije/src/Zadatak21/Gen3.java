package Zadatak21;

public class Gen3 {
	
	public static <T> void stampajNiz(T[]pocetniNiz) {
		for (T element : pocetniNiz) {
			System.out.print(element + " ");
		}
	}

	public static void main(String[] args) {
		
		Integer i [] = { 1, 2, 3, 5, 7, 8, 9};
		Double d [] = { 1.15, 2.54, 3.14, 5.17, 6.87};
		Character c [] = {'A', 'b', 'C', 'd', 'E'};
		System.out.print("Sadrzaj celobrojnog niza : ");
		stampajNiz(i);
		System.out.println("\n");
		System.out.print("Sadrzaj niza realnih brojeva : ");
		stampajNiz(d);
		System.out.println("\n");
		System.out.print("Sadrzaj niza karaktera : ");
		stampajNiz(c);
		System.out.println();
		
		
		
		
		
	}

}

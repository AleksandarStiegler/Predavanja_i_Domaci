package Petlje;

public class Zadatak3 {

	public static void main(String[] args) {

		// napisati program za racunanje brojeva od 1 do 10

		int zbir = 0; // 0 predstavlja neutral prilikom sabiranja

		for (int broj = 1; broj <= 10; broj++) {
			zbir = zbir + broj; // zbir += i;
		}
		System.out.println("Zbir brojeva iznosi :  " + zbir);
	}

}

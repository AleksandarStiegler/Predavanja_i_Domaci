package Zadatak10;

import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		String imena[] = {"Mika", "Zika", "Fica"};
		List<String> limena = new LinkedList<String>();
		
		for(String s : imena) {
			limena.add(s);
		}
		
		String imena1[] = {"Ana", "Lena", "Hana", "Una"};
		List<String> limena1 = new LinkedList<String>();
		for (String i : imena1) {
			limena1.add(i);
		}
		System.out.println("Imena prve liste");
		for(int i = 0 ; i < limena.size(); i++) {
			System.out.print(limena.get(i) + " ");
		}
		System.out.println("\nImena druge liste");
		for (String s : limena1) {
			System.out.print(s + " ");
		}
		
		// ako hocemo da dodamo sva imena iz druge liste u prvu listu mozemo da koristimo addall metodu
		
		limena.addAll(limena1);
		System.out.println("\nNova lista imena : "+ limena);
		
		limena.subList(1, 3).clear();
		System.out.println("Lista nakon brisanja od 2 do 3 elementa "+limena);
		// Pomocu subListe ( od indeksa (ukljucuje i njega) , do indeksa (ne ukljucuje i njega))
		

	}

}

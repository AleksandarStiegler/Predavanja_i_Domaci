
package Zadatak18;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ParniKarakteri pk = (s) -> {
			String par = "";
			for (int i = 0; i < s.length(); i++) {
				if( (i + 1) % 2 == 0) {
					par += s.charAt(i);
				}
			}
			return par;
		};
		
		NeparniKarakteri nk = (st) -> {
			String nep = "";
			for (int i = 0; i < st.length() ; i += 2) {
				nep += st.charAt(i);
			}
			return nep;
		};
		
		// Preko konzole cemo uneti neki string i onda pogledati sta dobijamo
		// kad izdvojimo parne a sta neparne indekse
		String nesto = sc.nextLine();
		sc.close();
		System.out.println("Parni indexi "+ pk.parni(nesto));
		System.out.println("Neparni indexi "+ nk.nepar(nesto));
	}
}

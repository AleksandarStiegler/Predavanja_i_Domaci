package WhileIForPetlja;

public class Zadatak05 {
	public static void main(String[] args) {
		// m - trocifreni broj
		// s - cifra stotice broja
		// d - cifra desetice broja
		// j - cifra jedinice broja
		int m, s, d, j;
		System.out.println("Brojevi od 100 do 999 deljivi sa 2 i 3 su: ");
		for (s = 1; s <= 9; s++)
			for (d = 0; d <= 9; d++)
				for (j = 0; j <= 9; j++) {
					m = s * 100 + d * 10 + j;
					if (m % 2 == 0 && m % 3 == 0)
						System.out.println(m);

				}
	}
}
// 2 nacin
/*	
		for (int i = 100 ; i < 1000; i++)
			if (i % 3 == 0 && i % 2 == 0)
				System.out.println(i); */
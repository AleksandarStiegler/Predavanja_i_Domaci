package Pocetak_OOP;

public class This {

	public static void main(String[] args) {
		
		/* This * 
		 *  Kljucna rec this ili referenca this pruza nacin da metoda 
		 *  zna koji tacno objekat je pozvao metodu, tj sa cijim podacima radi. *
		 *  Takodje, moze se koristiti za pristup podacima
		 *  objekta koji su sakriveni lokalnim promenljivama ili parametrima
		 *  metode. 
		 *       
		 *  Takodje, odnosi se na trenutni objekat u metodi ili konstruktoru.
		 */
		
		Krug k1 = new Krug(10);
		System.out.println("Povrsina : "+k1.area());

	}

}

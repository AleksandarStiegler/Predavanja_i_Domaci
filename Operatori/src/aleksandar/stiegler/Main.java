package aleksandar.stiegler;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		/*Binarni operatori
		 * 5 + 10  operatori imaju levu i desnu stranu
		 * operator dodele = sa desna na levo
		 * sa desne strane znaka = dodeljuje se promenljivoj
		 * koja se nalazi sa leve strane znaka =
		 */
		int a = 5;//asocijativnost je sa desna na levo
		int b = 50;
		int zbir = a + b;
		System.out.println("Vrednost promenljive zbir je: "+zbir);
		// + je binarni operator
		// -,*,/,%
		int razlika = a - b;
		System.out.println("Vrednost promenljive razlika je: "+razlika);
		
		int proizvod = a * b;
		System.out.println("proizvod je = "+proizvod);
		
		int kolicnik = a / b; // je celobrojno deljenje, decimalni deo se odbacuje
	                   // tako da ostaje samo ceo broj	
		System.out.println("kolicnik je = "+kolicnik);
		
		int kol = 10 / 3;
		System.out.println(kol);
		// deljenje sa ostatkom, koristi se % prikazuje samo ostatak prilikom deljenja
		
		int ostatak = 17 % 3;
		System.out.println(ostatak);
		
		float tacnodeljenje = 17f / 3f;
		System.out.println(tacnodeljenje);
		
		double provera = (double)50/3;
		System.out.println(provera);
		// eksplicitna konverzija podataka
		
		
		
	}

}

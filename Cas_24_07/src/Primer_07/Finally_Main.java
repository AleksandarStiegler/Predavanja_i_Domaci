package Primer_07;

public class Finally_Main {

	public static void main(String[] args) {
		
		FinalBlock fm = new FinalBlock();
		
		try {
			fm.procA();
		}catch(Exception e) {
			System.out.println("Izuzetak uhvacen");
			
		}
		fm.procB();
		fm.procC();
		/*Blok finally se koristi zajedno sa blokom try kako bi se osiguralo
		 *  da se određeni deo koda izvršava bez obzira 
		 *  na to da li je izbačen izuzetak ili ne.
		 *  Ovo je korisno za situacije u kojima želimo da budemo sigurni 
		 *  da su određeni resursi pravilno očišćeni ili zatvoreni,
		 *   čak i ako dođe do greške tokom izvršavanja programa.
		 */



	}

}

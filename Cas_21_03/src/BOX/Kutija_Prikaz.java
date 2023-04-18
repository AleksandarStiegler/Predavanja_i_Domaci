package BOX;

public class Kutija_Prikaz {

	public static void main(String[] args) {

		Kutija b1 = new Kutija();
		double zapremina;
		
		b1.sirina = 10;
		b1.visina = 15;
		b1.dubina = 20;
		
		zapremina = b1.sirina * b1.visina * b1.dubina;
		
		System.out.println("Zapremina : "+ zapremina);

	}

}

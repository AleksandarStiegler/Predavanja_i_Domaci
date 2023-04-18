package Primer5;

public class BoxPrikaz {

	public static void main(String[] args) {
		
		Box b1 = new Box();
		Box b2 = new Box();
		
		b1.visina = 10;
		b1.sirina = 15;
		b1.dubina = 20;
		
		b2.visina = 5;
		b2.sirina = 6;
		b2.dubina = 7;
		
		b1.zapremina();
		b2.zapremina();

	}

}

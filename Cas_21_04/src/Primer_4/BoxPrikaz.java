package Primer_4;

public class BoxPrikaz {

	public static void main(String[] args) {

		Box b1 = new Box();
		Box b2 = new Box();

		double zapremina;

		b1.sirina = 10;
		b1.visina = 15;
		b1.dubina = 20;

		b2.visina = 5;
		b2.sirina = 6;
		b2.dubina = 7;

		zapremina = b1.visina * b1.sirina * b1.dubina;
		System.out.println("Zapremina " + zapremina);

		zapremina = b2.visina * b2.sirina * b2.dubina;
		System.out.println("Zapremina " + zapremina);

	}

}

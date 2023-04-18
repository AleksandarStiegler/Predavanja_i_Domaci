package Primer6;

public class BoxPrikaz {

	public static void main(String[] args) {

		
		Box b1 = new Box(); // nema konstruktor tako da u trenutku kreiranja
		// objekta pozvace se podrazumevani konstruktor
		
		Box b2 = new Box();
		
		b1.initBox(10, 15, 20);
		b2.initBox(5, 6, 7);
		
		System.out.println("Zapremina "+b1.volume());
		System.out.println("Zapremina "+b2.volume());
		

	}

}

package Primer10;

public class BoxGlavonja {

	public static void main(String[] args) {
		
		Box b1 = new Box ();
		Box b2 = new Box (10, 15, 20);
		Box b3 = new Box (10);
		Box b4 = new Box (b2);
		
		System.out.println(b1.volume());
		System.out.println(b2.volume());
		System.out.println(b3.volume());
		System.out.println(b4.volume());
	}

}

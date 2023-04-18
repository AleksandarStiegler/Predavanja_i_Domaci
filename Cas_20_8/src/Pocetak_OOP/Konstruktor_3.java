package Pocetak_OOP;

public class Konstruktor_3 {

	public static void main(String[] args) {
		
		Krug k1 = new Krug(20);
		Krug k2 = new Krug(15);
		calcArea(k1);
		calcArea(k2);
		
	}
	
	public static void calcArea(Krug c) {
		System.out.println("Povrsina kruga : "+c.area());
	}

}

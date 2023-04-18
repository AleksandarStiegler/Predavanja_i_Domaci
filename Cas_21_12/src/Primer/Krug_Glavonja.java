package Primer;

public class Krug_Glavonja {

	public static void main(String[] args) {
		
		Krug k1 = new Krug(10);
		Krug k2 = new Krug(k1);
		
		System.out.println("Povrsina kruga : "+ k2.area());

	}

}

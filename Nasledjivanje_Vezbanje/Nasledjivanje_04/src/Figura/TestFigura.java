package Figura;

public class TestFigura {

	public static void main(String[] args) {
		
		Pravougaonik p = new Pravougaonik(3.2, 4.1);
		
		System.out.println("Obim pravouganika je "+ p.obim());
		System.out.println("Povrsina pravougaonika je "+p.povrsina());
	}

}

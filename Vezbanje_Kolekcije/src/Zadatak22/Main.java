package Zadatak22;

public class Main {

	public static void main(String[] args) {
		
		Gen4P<Integer, Character> obj1 = new Gen4P<Integer, Character>(15, 'C');
		
		obj1.prikaziTip();
		
		int a = obj1.getO1();
		System.out.println("Vrednost : "+a);
		System.out.println("Karakter : "+ obj1.getO2());
		
		obj1.setO2('K');
		System.out.println("Novi karakter " + obj1.getO2());
		
		Gen4P<String, Integer> obj2 = new Gen4P<String, Integer>("Shogun", 956);
		obj2.prikaziTip();
		int b = obj2.getO2();
		System.out.println("Naziv knjige : " + obj2.getO1());
		
		Gen4P<Double, String> obj3 = new Gen4P<Double, String>(1687.55, "Cena");
		
		System.out.println("Knjiga " + obj2.getO1()+" ima "+ obj2.getO2()+" strana.\n"
				+obj3.getO2()+" knjige je "+obj3.getO1() + " dinara.");
		System.out.println();
		obj3.prikaziTip();
		double c1 = obj3.getO1();
		int c = (int )c1;
		System.out.println(c);
		
		Poredjenje porO = (x, y, z) -> (x > y) ? ((x > z) ? x : ((z > y) ? z : y)) : (y > z)? y : z;
		
		System.out.println("Najveci broj izmedje "+a+" , "+b+" , "+c+" je "+porO.por(a, b, c));
	
	}

}

package Zadatak20;

public class Main {

	public static void main(String[] args) {
		
		
		Gen2P <Integer, String> obj1= new Gen2P<Integer, String>(60 , "Lebac");
		
		obj1.ispisiTip();
		int vr = obj1.getOt1();
		String str = obj1.getOt2();
		
		System.out.println("Vrednost : "+ vr);
		System.out.println("Vrednost : "+ str);
		
		Gen2P <String, Double> obj2 = new Gen2P<String, Double>("Neki tekst", 145.917);
		
		obj2.ispisiTip();
		
		System.out.println("Vrednost 1 : " + obj2.getOt1());
		System.out.println("Vrednost 2 : "+ obj2.getOt2());
		
		obj2.setOt1("Sestro Slatka");
		
		System.out.println("Vrednost 1 posle promene : "+ obj2.getOt1());
		
		Gen2P<Boolean, Integer> obj3 =new Gen2P<Boolean, Integer>(true, 101);
		System.out.println();
		obj3.ispisiTip();
		
		Boolean b3 = obj3.getOt1();
		System.out.println("Vrednost 1 : "+ b3);
		System.out.println("Vrednost 2 : " + obj3.getOt2());
	}

}

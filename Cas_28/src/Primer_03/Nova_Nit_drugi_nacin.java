package Primer_03;

public class Nova_Nit_drugi_nacin {

	public static void main(String[] args) {
	
		A a1 = new A("Nit1");
		A a2 = new A("Nit2");
		A a3 = new A("Nit3");
		
		a1.start(); // Zapocinje izvrsavanje niti pozivanjem njene metode run()
		a2.start();
		a3.start();
		
		
	}

}

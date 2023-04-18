package Niti;

public class Main {

	public static void main(String[] args) {
		
		NitA A = new NitA("Prva Nit.");
		System.out.println("Prva nit se izvrsava -> "+A.t.isAlive());
		NitB B = new NitB("Druga Nit.");
		System.out.println("Druga nit se izvrsava - > "+B.currentThread().isAlive());
		try {
			
			B.start();
		
		
		
		
		System.out.println("Prva nit se izvrsava -> "+A.t.isAlive());
		System.out.println("Druga nit se izvrsava - > "+B.currentThread().isAlive());
	}catch (Exception e) {
		e.printStackTrace();
	}
		System.out.println("Prva nit se izvrsava -> "+A.t.isAlive());
		System.out.println("Druga nit se izvrsava - > "+B.currentThread().isAlive());
	}
}

package Niti;

public class Main {

	public static void main(String[] args) {
		
		NitA A = new NitA();
		Thread tA = new Thread(A, "Prva nit ");
		NitB B = new NitB("Druga nit");
		tA.setPriority(10);
		B.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("Prva nit se izvrsava -> "+tA.isAlive());
		System.out.println("Druga nit se izvrsava -> "+B.isAlive());
		tA.start();
		B.start();
		
		System.out.println("Prva nit se izvrsava -> "+tA.isAlive());
		System.out.println("Druga nit se izvrsava -> "+B.isAlive());
		
		
	}

}

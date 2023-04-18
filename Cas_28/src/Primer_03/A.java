package Primer_03;

// Nit se moze napraviti i kada klasu Thread prosirimo novom nalsedjenom klasom
// a zatim napravite instancu te klase.

// Nova potklasa mora da redefinise metodu run()

public class A extends Thread{

	A (String s){
		super(s); // Vezano za nasledjivanje , poziva konstruktor Thread sledeceg oblika :
				  // public Thread(String imeNiti)
	}
	
	
	public void run() {
		for(int i = 1; i <= 10; i++) {
			System.out.println(getName());
		}
	}
}

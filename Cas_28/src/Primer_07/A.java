package Primer_07;

public class A implements Runnable{
	
	String ime;
	Thread t;
	
	A(String name){ //  A nova nit
		ime = name;
		t = new Thread(this, ime);
		t.start();
	// konstruktor da kreira unutar klase nas objekat
	}
	
	public void run() {
		try {
		for (int i = 1 ; i <= 5; i++) {
			System.out.println(ime + " = "+i );
			Thread.sleep(500);
		}
		}catch(Exception e) {
			
		}
		
	}

}

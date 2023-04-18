package Niti;

public class NitB implements Runnable {

	
	public void run() {
		for (int j = 1; j <= 15; j++){
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println("Kraj izvrsavanja niti NitB.");
		
	}
	

}

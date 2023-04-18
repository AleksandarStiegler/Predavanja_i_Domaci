package Niti;

public class NitA extends Thread{
	
	NitA (String s){
		super (s);
	}
	public void run() {
		for (int i = 1; i <= 10; i++){
			System.out.println(Thread.currentThread().getName());
		
		}
		System.out.println("Kraj izvrsavanja niti NitA.");
		
	}

}

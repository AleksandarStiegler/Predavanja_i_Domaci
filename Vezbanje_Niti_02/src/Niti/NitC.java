package Niti;

public class NitC extends Thread{
	
	NitC(String str){
		super(str);
	}
	
	public void run() {
		for(int k = 1; k <= 6; k++) {
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println("Kraj izvrsavanja niti NitC.");
	}

}

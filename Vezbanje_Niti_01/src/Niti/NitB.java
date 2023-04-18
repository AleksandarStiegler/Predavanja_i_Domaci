package Niti;

public class NitB implements Runnable{

	
	public void run() {
		int k = 0;
		while (k < 10) {
			System.out.println(Thread.currentThread().getName());
			k++;
		}
		
	}

}

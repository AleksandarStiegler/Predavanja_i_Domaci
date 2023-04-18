package Niti;

public class NitC extends Thread{
	
	NitC (String s){
		super(s);
		// mora da ima metodu run
	}
		public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	}


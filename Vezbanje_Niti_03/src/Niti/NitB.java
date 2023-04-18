package Niti;

public class NitB extends Thread{

	NitB(String str){
		super(str);
	}
	
	public void run() {
		try {
			for (int i = 1; i <= 5; i++ ) {
				System.out.println(Thread.currentThread().getName()+" = "+i);
				Thread.sleep(500);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}

package Niti;

public class NitB extends Thread{
	
	NitB(String str){
		super(str);
	}
	
	public void run() {
		for (int i = 1; i <= 6 ; i++) {
			try {
				System.out.println(Thread.currentThread().getName()+" = "+i );
				Thread.sleep(600);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

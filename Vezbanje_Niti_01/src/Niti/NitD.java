package Niti;

public class NitD extends Thread{
	
	NitD (String ime ){
		super(ime);
	}
	public void run() {
		int k = 0;
		do {
			System.out.println(Thread.currentThread().getName());
			k++;
		}while(k < 15);
	}

}

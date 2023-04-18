package Primer_04;

public class B extends Thread{
	
	B(String y){
		super(y);
	}
	
	public void run() {
		int i = 1;
		while (i <= 5) {
			System.out.println(getName());
			i++;
			
		}
	}

}

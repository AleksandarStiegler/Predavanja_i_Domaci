package Primer_04;

public class C extends Thread{
	
	C (String s){
		super (s);
	}
	
	public void run() {
		for(int i = 1; i <= 7; i++) {
			System.out.println(getName());
		}
	}

}

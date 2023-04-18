package Primer_04;

public class A extends Thread{
	
	A(String x){
		super(x);
	}
	
	public void run() {
		int i = 1;
		
		do {
			System.out.println(getName());
			i++;
		}while(i<=5);
	}

}

package Niti;

public class NIT {

	public static void main(String[] args) {
		
		NitA a = new NitA();
		Thread ta = new Thread(a,"NitA");
		
		NitB b = new NitB();
		Thread tb = new Thread(b, "NitB");
		
		NitC c = new NitC("NitC");
		NitD d = new NitD("NitD");
		
		ta.start();
		c.start();
		tb.start();
		d.start();
		
	}

}

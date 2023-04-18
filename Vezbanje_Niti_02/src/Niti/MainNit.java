package Niti;

public class MainNit {

	public static void main(String[] args) {
		
		NitA A = new NitA("Prva nit.");
		NitB B = new NitB();
		Thread tB = new Thread(B,"Druga nit.");
		NitC C = new NitC("Treca nit.");
		
		// Ovde cemo da iskoristimo par metoda da vidimo kako to radi zapravo i kao vezbu
		
		A.setPriority(9);
		try {
			A.start();
		A.sleep(50);
		tB.setPriority(6);
		tB.start();
		}catch (Exception e ) {
			e.printStackTrace();
		}
		C.setPriority(4);
		C.start();
	}

}

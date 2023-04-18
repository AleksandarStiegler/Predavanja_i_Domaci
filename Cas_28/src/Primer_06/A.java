package Primer_06;

public class A extends Thread {
	
	public void run() {
		
		int i = 1;
		while (i <= 10) {
			System.out.println("i : "+i);
			// sleep() argument izrazen u ms.
			// Privremeno zaustavlja (suspenduje) izvrsavanje niti
			
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			// Metoda sleep() u klasi Thread moze da izazove izuzetak InterruptedException
			}
			i++;
		}
	}

}

package Primer_02;

// Nit se moze napraviti za svaki objekat koji implementira interfejs Runnable **
// Da bi klasa implementirala interfejs Runnable, potrebno je samo da ima metodu
// koja se zove run(), koja je deklarisana u sledecem obliku :
// public void run()
// U metodi run() zadajete kod koji treba da se izvrsava u novoj niti.
// Kada se izvrsi metoda run() nit se unistava.

public class A implements Runnable {
	
	public void run() {
		
		for(int i = 1; i <= 10; i ++) {
			System.out.println(Thread.currentThread().getName());
			
		}
	}

}

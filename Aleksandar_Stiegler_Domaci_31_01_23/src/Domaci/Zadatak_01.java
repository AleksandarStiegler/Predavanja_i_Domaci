package Domaci;

import java.util.Random;

public class Zadatak_01 {

	public static void main(String[] args) {
		
		//Napisati  program  koji će generisatii  ispisati 
		//po jedan broj sledećih tipova:Int,  Float,  Boolean, Double, Byte
		
		Random ran = new Random();
		
		int x = ran.nextInt();
		double y = ran.nextDouble()*100;// konstantno izbacuje manje od 1 pa ajde da pomnozimo sa 100
		short z = (short) ran.nextInt(); // izgleda da short nije trebalo ali neka ostane
		boolean b = ran.nextBoolean();
		float f = ran.nextFloat();/* isto kao i za double izbacuje brojeve ispod 1 
									* ali cu ostaviti ovako da se razlikuje od double slucaja*/
		int min = -128;
		int max = 127;
		byte k =(byte) (ran.nextInt(max - min +1) + min);
		/* Mogao sam da castujem i ovde iz integer tipa ili double tipa u byte ali sam 
		 * naleteo da mozemo da koristimo zeljene opsege za Random pa sam probao sa time
		 * posto nam je opseg relativno mali od -128 do 127. Delovalo je zanimljivo
		 */
		
		System.out.println("Generisan broj tipa integer : "+x);
		System.out.println();
		System.out.println("Generisan broj tipa double : "+y);
		System.out.println();
		System.out.println("Generisan broj tipa float : "+f);
		System.out.println();
		System.out.println("Generisan broj tipa short : "+z);
		System.out.println();
		System.out.println("Generisana logicka vrednost : "+b);
		System.out.println();
		System.out.println("Generisan broj tipa byte : "+k);
		
		
		
	}

}

package Zadatak01;

import java.text.DecimalFormat;

public class TackaMain {

	public static void main(String[] args) throws Exception {
		
		DecimalFormat df = new DecimalFormat("##0.000");
		
		Tacka A = new Tacka();
		
		Tacka B = new Tacka(7.14 , 5.25);
		
		A.opisTacke();
		
		B.opisTacke();
		
		A.setX();
		A.setY();
		System.out.println("Nove koordinate tacke A ("+A.getX()+","+A.getY()+").");
		System.out.println("Rastojanje tacke A od koordinatnog pocetka iznosi: "+df.format(A.rastojanje()));
		
		System.out.println("Rastojanje izmedju tacaka A i B iznosi : "+df.format(B.rastojanjeIzmedju2Tacke(A)));

	}

}

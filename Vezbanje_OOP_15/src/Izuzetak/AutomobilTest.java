package Izuzetak;

import java.io.*;

public class AutomobilTest {

	public static void main(String[] args) throws IOException{
		
		Automobil A = new Automobil();
		
		A.unetiNazivAutomobila();
		A.unetiProizvodjacaAutomobila();
		A.unetiGodisteAutomobila();
		A.unetiPotrosnjuAutomobila();
		System.out.println(A.opis());

	}

}

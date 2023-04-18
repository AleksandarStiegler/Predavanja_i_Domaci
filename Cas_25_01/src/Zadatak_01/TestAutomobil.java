package Zadatak_01;

import java.io.*;

public class TestAutomobil {

	public static void main(String[] args) throws IOException {
		
		Automobil auto = new Automobil();
		
		auto.unetiNazivAutomobila();
		auto.unetiProizvodjacaAutomobila();
		auto.unetiGodisteAutomobila();
		auto.unetiPotrosnjuAutomobila();
		
		System.out.println("\nUneti podaci o automobilu su: ");
		System.out.println(auto.toString());

	}

}

package Zadatak_01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Automobil {
	
	public String naziv;
	public String proizvodjac;
	public int godiste;
	public double potrosnja;
	
	void unetiNazivAutomobila() throws IOException{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite naziv automobila :");
		naziv = bfr.readLine();
		
	}
	
	public void unetiProizvodjacaAutomobila()throws IOException{
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Unesite naziv proizvodjaca automobila :");
		proizvodjac = bfr.readLine();
	}
	void unetiGodisteAutomobila() {
		try { 
			BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in)); 
			System.out.println("Unesite godište automobila: ");
			godiste = Integer.parseInt(ulaz.readLine()); 
			} catch (Exception e) { 
				System.out.println("Niste dobro uneli broj"); 
				unetiGodisteAutomobila();
				}
		} 
	// Metoda za unos potrošnje automobila 
	void unetiPotrosnjuAutomobila() {
		while (true) { 
			try { 
				BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Unesite potrošnju automobila na 100 km: ");
				potrosnja = Double.parseDouble(ulaz.readLine());
				break;
				} catch (Exception e) { 
					System.out.println("Niste ispravno uneli potrošnju automobila"); 
					}
			} 
		} 
	// Redefinisana metoda 
	public String toString(){
		return "Naziv: " + naziv + "\nProizvodjač: " + proizvodjac + "\nGodište: " + godiste + "\nPotrošnja: " + potrosnja;
		}
	}



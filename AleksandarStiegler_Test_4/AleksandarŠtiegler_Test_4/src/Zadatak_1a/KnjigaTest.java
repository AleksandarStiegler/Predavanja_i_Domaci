package Zadatak_1a;

import Zadatak_1.*;


	public class KnjigaTest {

		public static void main(String[] args) {
			
			String naslov;
			String autor;
			String opis;
			double cena;
			boolean stanje;
			
			Knjiga K = new Knjiga();
			K.setNaslov("Na Drini Cuprija");
			K.setAutor("Ivo Andric");
			K.setOpis("Roman pripoveda o gradjenju mosta preko Drine u bosanskom mestu Visegrad.");
			K.setCena(1200.0);
			K.setStanje(1);
			
			System.out.println("Podaci o knjizi : ");
			System.out.println("Naslov: "+K.getNaslov()+"\nAutor: "+K.getAutor()+"\nKratak opis: "+K.getOpis()+"\nCena: "+K.getCena()+"\nNa stanju: "+K.getStanje());
			

		}

	}
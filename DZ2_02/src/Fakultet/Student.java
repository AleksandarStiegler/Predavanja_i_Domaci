package Fakultet;

import java.util.ArrayList;

public class Student {
	
	private String ime;
	private int indeks;
	private ArrayList<Ispit> ispiti; 
	public int kapacitet;
	
	public int godinaUpisa() {
		return indeks / 10000;
	}
	
	public int registarskiBroj() {
		return indeks % 10000;
	}
	
	public int vratiIndeks() {
		return indeks;
	}
	
	public Student (String ime , int in, int k){
		this.ime = ime;
		this.indeks = in;
		this.ispiti = new ArrayList<>(kapacitet = k);
	}
	
	public Student() {
		this.kapacitet = 40; // podrazumevana vrednost
	}
	
	// Dodavanje ispita
	
	public String dodajIspit(Ispit i) {
		if (ispiti.size() == kapacitet) {
			return "Nije dodat ispit ";
		}else {
			ispiti.add(i);
			return "Ispit je uspesno dodat";
		}
		
	}
	
	public double srednjaOcena() {
		double sr = 0.0;
		int bris = 0;
		for (Ispit i : ispiti) {
			sr += i.dohvatiOcenu(i);
			bris ++;
		}
		return sr / bris;
	}
	
	// Student, godina upisa, registarski broj i srednja ocena 
	
	public void studentProsek() {
		
		System.out.println(ime + "["+godinaUpisa()+"/"+registarskiBroj()+" : "+srednjaOcena()+"]");
	}
	
	
	

}

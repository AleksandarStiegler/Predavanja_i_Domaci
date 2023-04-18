package Zadatak_03;

import java.util.ArrayList;
import java.util.List;

public class Array_List {

	public static void main(String[] args) {
		
		// interfejst <T> ime = new ArrayList<T>();
		// T predstavlja tip promenljive
		
		List<Integer> kolekcijaAL = new ArrayList<Integer>();
		
		// add - za dodavanje vrednosti unutar kolekcije
		
		kolekcijaAL.add(5);
		kolekcijaAL.add(4);
		kolekcijaAL.add(9);
		kolekcijaAL.add(7);
		kolekcijaAL.add(12);
		
		System.out.println(kolekcijaAL);
		
		// Razlika u odnosu na niz je - dinamicka velicina (nije fiksna velicina na pocektu)
		// Koristite ArrayList kada ne znate unapred velicinu niza!!!!!!
	}

}

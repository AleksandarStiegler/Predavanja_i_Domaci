package Zadatak11;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {
		
		
		// Rad sa listIteratorom
		
		List<String> ll = new LinkedList<String>();
		
		ll.add("1");
		ll.add(1, "2");
		ll.add("3");
		ll.add("4");
		ll.add("5");
		System.out.println("Elementi povezane kolekcije : "+ll);
		// ListIterator nam omogucava da se krecemo kroz listu u oba smera
		// od prvog do poslednjeg elementa i obrnuto
		
		ListIterator litr = ll.listIterator();
		System.out.println();
		System.out.println("Kretanje kroz listu od prvog to poslednjeg elementa");
		while(litr.hasNext()) { // ide od 0....n
			System.out.print(litr.next() + " ");
		}
		System.out.println();
		System.out.println("Kretanje od poslednjeg ka prvom elementu");
		while(litr.hasPrevious()) { // od n ... 0 elementa
			System.out.print(litr.previous() + " ");
		}
		
		
		

	}

}

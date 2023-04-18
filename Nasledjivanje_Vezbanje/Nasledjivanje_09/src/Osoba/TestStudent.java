package Osoba;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestStudent {

	public static void main(String[] args) throws Exception {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		Student s1 = new Student();
		
		s1.setIme();
		s1.setPrezime();
		s1.setStarost();
		System.out.println("Unesite koji predmet student polaze");
		String is = bfr.readLine();
		s1.setIspit(is);
		
		System.out.println("Podatci o studentu : ");
		System.out.println("IME : "+s1.getIme()+"\nPREZIME: "+s1.getPrezime()+"\n"
				+ "Godine : "+s1.getStarost()+"\nIspit : "+s1.getIspit());

	}

}

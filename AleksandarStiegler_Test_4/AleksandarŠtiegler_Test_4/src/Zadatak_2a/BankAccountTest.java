package Zadatak_2a;

import java.io.*;
import Zadatak_2.*;

public class BankAccountTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		double stanje;
		double uplata;
		
		BankAccount A = new BankAccount();
		
		A.setStanje();
		A.setUplata();
		
		System.out.println("Vase trenutno stanje : "+A.getStanje());
		System.out.println();
		System.out.println("Iznos uplate : "+A.getUplata());
		System.out.println();
		System.out.println("Trenutno stanje na racunu posle uplate : "+(A.getStanje()+A.getUplata()));
		
	}

}

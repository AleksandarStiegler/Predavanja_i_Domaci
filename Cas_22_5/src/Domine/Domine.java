package Domine;

public class Domine {
	
	private int a;
	private int b;
	
	Domine(int aa , int bb){
	a = aa;
	b = bb;
		
	}
	
	public int getA() {
		return a;
	}
	public int getB() {
		return b;
	}
	
	public  Domine  zamena () {
		int temp;
		temp = a;
		a = b;
		b = temp;
		return this;
	}
	public boolean iste (Domine d) {
		return a == d.a && b == d.b || b == d.a && a == d.b; 
	}
	
	public String opis() {
		return "(" + a+ ","+b+")";
	}
	

}

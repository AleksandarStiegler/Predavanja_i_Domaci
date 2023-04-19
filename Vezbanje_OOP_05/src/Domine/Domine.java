package Domine;

public class Domine {
	
	
	private int x;
	private int y;
	
	
	Domine(){
		x = 0;
		y = 1;
		
	
	}
	Domine (int xx, int yy){
		this.x = xx;
		this.y = yy;
		
	}
	public int getx() {
		return x;
	}
	public int gety() {
		return y;
	}
	public Domine zamena() {
		int temp;
		temp = x;
		x = y;
		y = temp;
		return this;
}
	
	public boolean  ispitivanje(Domine a) {
		
		return x == a.x && y == a.y || x == a.y && y == a.x;
		
		}
	public void opis() {
		System.out.println("Domina : "+getx()+" / "+gety());
	}
		
	
	
	
	
	
	
	

}

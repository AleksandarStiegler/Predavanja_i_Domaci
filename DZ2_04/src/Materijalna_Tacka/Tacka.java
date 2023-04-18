package Materijalna_Tacka;

public class Tacka {
	
	public double x, y , z;
	public double realnaMasa;
	
	Tacka(){
		this.x = 0;
		this.y = 0;
		this.z = 0;
		this.realnaMasa = 1;
	}
	
	Tacka(double a, double b, double c, double mm){
		this.x = a;
		this.y = b;
		this.z = c;
		this.realnaMasa = mm;
	}
	
	public double rastojanjeIzmedjuTacaka(Tacka A) {
		double rastojanje = Math.sqrt(Math.pow((this.x - A.x),2) + Math.pow((this.y - A.y),2) + Math.pow((this.z - A.y),2) );
		return rastojanje;
	}
	
	public double privlacnaSila(Tacka A) {
		double prSila = Math.pow(6.67,Math.pow(10, -11) ) * realnaMasa * A.realnaMasa / Math.pow(rastojanjeIzmedjuTacaka(A), 2);
		return prSila;
	}
	
	public String ispisiTacku() {
		return "Tacka ima koordinate : \nX : "+x+"\nY : "+y
				+"\nZ : "+z+"\nRealnu masu : "+realnaMasa;
	}

}

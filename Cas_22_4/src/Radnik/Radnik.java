package Radnik;

public class Radnik {
	
	private String ime;
	private double prihod;
	private double procenat;
	
	Radnik (String i, double pr, double pc){
		this.ime = i;
		this.prihod = pr;
		this.procenat = pc;
	}
	public double getPrihod() {
		return this.prihod;
	}
	
	double plata() {
		return prihod * procenat / 100;
	}
	
	public String opis() {
		return ime + "/ "+plata();
	}
	

}

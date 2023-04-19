package Plata;

public class Plata {
	
	// Radnik u trgovackoj firmi ima platu kao zadati procenat od ostvarenog prihoda
	// Moze se odrediti vrednost ostvarenog prihoda, da se izracuna  visina plate
	// i da se sastavi tekstualni opis u obliku ime / plata.
	
	private String ime ;
	private double prihod;
	private double procenat;
	
	Plata (String i, double pro, double pri){
		ime = i;
		prihod = pri;
		procenat = pro;
		
	}
	
	public double zarada() {
		return prihod * procenat / 100;
	}
	
	public String opis() {
		return ime + " / "+ zarada();
	}
	
	
}

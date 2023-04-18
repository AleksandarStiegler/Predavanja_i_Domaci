package Kartica;

public class Kartica {
	
	protected String tipKartice;
	protected String imeVlasnika;
	
	Kartica(String t, String iv){
		this.tipKartice = t;
		this.imeVlasnika = iv;
	}
	
	public void ispisi() {
		System.out.println("Kartica je "+tipKartice+" .\nVlasnik kartice je "+imeVlasnika);
		
	}

}

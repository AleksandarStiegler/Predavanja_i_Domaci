package Proizvod;

public class PrehrambeniProzivod extends Proizvod{
	
	String vrsta;
	public PrehrambeniProzivod(String n, String p, double c, String rt) {
		super(n,p,c,rt);
		vrsta = "Nepoznata";
	}
	
	public void setVrsta(String v) {
		this.vrsta = v;
	}
	public String getVrsta() {
		return vrsta;
	}
	public void ispisi() {
		System.out.println("Naziv : "+naziv+"\nProizvodjac : "+proizvodjac+
				"\nCena : "+cena+"\nRok Trajanja : "+rokTrajanja+"\nVrsta : "+vrsta);
		
	}

}

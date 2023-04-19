package Zadatak22;

public class Gen4P<P1, P2> {
	
	// odradicu jos jedan zadatak sa dva parametra
	
	P1 objekat1;
	P2 objekat2;
	
	Gen4P(P1 t, P2 k){
		this.objekat1 = t;
		this.objekat2 = k;
	}
	
	public void prikaziTip() {
		System.out.println("Tip parametra 1 : " + objekat1.getClass().getName());
		System.out.println("Tip parametra 2 : " + objekat2.getClass().getName());
	}
	
	public void setO1(P1 nv) {
		objekat1 = nv;
	}
	public void setO2(P2 nnv) {
		objekat2 = nnv;
	}
	
	public P1 getO1() {
		return objekat1;
	}
	P2 getO2() {
		return objekat2;
	}
	

}

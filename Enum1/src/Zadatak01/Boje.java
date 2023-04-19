package Zadatak01;

public enum Boje {
	
	Crna(124), Zelena(25), Bela(150), Plava(100), Crvena(200), Zuta (250);
	
	private int udeo;
	
	Boje(int u){
		udeo = u;
	}
	
	public int getUdeo() {
		return udeo;
	}

}

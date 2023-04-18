package Primer;

public class Knjiga {
	
	public String naslov;
	int brojstrana;
	
	Knjiga (String n, int bs){
		
		naslov = n;
		brojstrana = bs;
	}
	
	void  prikazi() {
		
		System.out.println(naslov+" ima "+brojstrana+" strana");
	}

}

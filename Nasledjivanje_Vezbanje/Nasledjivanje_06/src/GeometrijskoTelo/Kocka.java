package GeometrijskoTelo;

public class Kocka extends GeometrijskoTelo {
	
	double stranica;
	Kocka(double a){
		if (a <= 0.0) {
			System.out.println("Greska, stranica kocke mora biti veca od 0");
		}
		else {
			this.stranica = a;
		}
	}

	
	public double izracunajPovrsinu() {
		
		return stranica * stranica * 6;
	}

	
	public double izracunajZapreminu() {
		
		return Math.pow(stranica, 3);
	}

}

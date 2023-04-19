package p1;

import static java.lang.Math.*;

public class ApsolutnaVrednost {

	private double broj;

	public ApsolutnaVrednost(double b) {
		this.broj = b;
	}

	public double aps(ApsolutnaVrednost a) {
		if (broj < 0) {
			return -broj;
		} else if (broj == 0) {
			return 0;
		} else {
			return broj;
		}
	}

	public double abso() {
		return abs(broj);
	}
	
	public String opis() {
		return "Apsolutna vrednost broja " + broj+" je : ";
	}
}
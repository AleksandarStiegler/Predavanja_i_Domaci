package Fakultet;

public class Ocena {
	
	public int ocena;
	
	Ocena(int o){
		if (o > 10) {
			this.ocena = 10;
		}
		else if (o < 5) {
			this.ocena = 5;
		}
		else {
			this.ocena = o;
		}
	}
	
	public int ocenaBroj() {
		return ocena;
	}
	
	public String ocenaOpis(int ocena) {
		if (ocena <= 5) {
			return "(pet)";
		}
		else if (ocena == 6) {
			return "(sest)";
		}
		else if (ocena == 7) {
			return "(sedam)";
		}
		else if (ocena == 8) {
			return "(osam)";
		}
		else if (ocena == 9) {
			return "(devet)";
		}
		else  {
			return "(deset)";
		}
	}
	
	public String ocenaToString(Ocena oc) {
		return ""+ oc.ocenaBroj()+oc.ocenaOpis(oc.ocenaBroj());
	}

}

package Proizvod;

public class Proizvod {
	
	String naziv;
	String proizvodjac;
	double cena;
	String rokTrajanja;
	
	Proizvod(){
		naziv = "Nepoznat";
		proizvodjac = "Nepoznat";
		cena = 0.0;
		rokTrajanja = "29.12.2022.";
	}
	
	Proizvod (String n, String p, double c, String rt){
		
		if (n.isBlank() || n.isEmpty() ) {
			System.out.println("Greska! Morate uneti naziv proizvoda.");
		}else {
			this.naziv = n ;
		}
		if (p.isBlank() || p.isEmpty()) {
			System.out.println("Greska! Morate uneti naziv prozivodjaca.");
		}
		else {
			this.proizvodjac = p;
		}
		if ( c <= 0.0) {
			System.out.println("Greska! Cena mora biti veca od 0.");
		}else
		{
			this.cena = c;
		}
		if (rt.isBlank() || rt.isEmpty()) {
			System.out.println("Greska. Morate uneti rok trajanja");
		}
		else {
			this.rokTrajanja = rt;
		}
	}

}

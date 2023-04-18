package Osoba;

public class TestOsoba {

	public static void main(String[] args) throws Exception {
		
		
		Osoba A = new Osoba();
		
		
		A.setIme();
		A.setPrezime();
		A.setMaticniBroj();
		
		Zaposleni B = new Zaposleni();
		B.setIme();
		B.setPrezime();
		B.setProsZarada();
		B.setMaticniBroj();
		
		System.out.println("Uneti podatci osobe su");
		
		System.out.println("IME: "+A.getIme()+"\tPREZIME: "+A.getPrezime()+"\tMATICNIBROJ: "+A.getMaticniBroj());
		
		System.out.println("Podatci zaposlenog");
		System.out.println("IME: "+B.getIme()+"\tPREZIME: "+B.getPrezime()+"\tMATICNIBROJ: "+B.getMaticniBroj()+"\tPROSECNAZARADA: "+B.getProsZarada());
		
	}

}

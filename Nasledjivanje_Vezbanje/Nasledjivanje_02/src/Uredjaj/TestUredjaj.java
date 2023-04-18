package Uredjaj;

public class TestUredjaj {

	public static void main(String[] args) {
		
		
		Uredjaj U = new Uredjaj("Samsung", true);
		
		KlimaUredjaj KMU = new KlimaUredjaj("Gorenje", false, 25);
		
		U.iskljuci();
		KMU.ukljuci();
		KMU.povecajTemperaturu();
		
		System.out.println(U.ispisi());
		System.out.println(KMU.ispisiKlimaUredjaj());

	}

}

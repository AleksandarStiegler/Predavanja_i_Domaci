package Zadatak_02;

public class Lambda_Izraz {

	public static void main(String[] args) {
		
		// TestiraBroj paran = /* ovde dolazi lambda izraz */
		
		// LevaStranaLambdaIzraza -> DesnaStranaLambdaIzraza

	//	() -> 123.45
	// double nekaMetoda ()	{return 123.45}
		
		TestiraBroj paranBroj = (n) -> (n % 2) != 0;
		
		if(paranBroj.test(12)) {
			System.out.println("Broj je paran broj.");
		}
		else {
			System.out.println("Broj nije paran.");
		}
		
	}

}

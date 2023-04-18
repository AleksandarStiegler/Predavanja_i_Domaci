package Primer_07;

public class FinalBlock {
	
	static void procA() {
		try {
			System.out.println("Inside procA");
			throw new RuntimeException("demo"); // "mi" bacamo izuzetak
			// throws je u zaglavlju
			// throw se koristi za bacanje izuzetka u telu metode
		}finally { // finally blok se izvrsava bez obzira da li je ili nije 
			// doslo do izuzetka
			System.out.println("procA");
		}
	}
	
	// Return from within a try block
	
	static void procB() {
		try {
			System.out.println("procB");
			return; // break , continue, System.exit(0)
		}finally {
			System.out.println("procB's finally");
		}
	}
	
	// Execute a try block normally
	
	static void procC() {
		try {
			System.out.println("Inside procC");
		}finally {
			System.out.println("procC's finally");
		}
	}

}

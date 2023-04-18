package Zadatak_03;

public class Deljenje {

	public static void main(String[] args) {
		
		// Testiranje pomocu lambda izraza
		
		ProveraDeljivosti deljenje = (a, b) -> (a % b) == 0;
		
		if(deljenje.deljiv(10, 3)) {
			System.out.println("Deljiv  brojem");
		}
		else {
			System.out.println("Nije deljiv brojem");
		}
		

	}

}

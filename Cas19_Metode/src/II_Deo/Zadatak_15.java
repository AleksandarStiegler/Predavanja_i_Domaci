package II_Deo;

public class Zadatak_15 {
// Metoda za prevođenje Celzijusovih u Farenthajtove stepene

public static double CuF(double celsius){
	return (1.8 * celsius + 32);
	}
public static void main(String[] args) throws Exception {
	// Izmerena temperatura
	double temp = 25;
	// Štampanje rezultata 
	System.out.println("Temperatura prevedena u Farenthajte iznosi: " + CuF(temp));
	} 
}


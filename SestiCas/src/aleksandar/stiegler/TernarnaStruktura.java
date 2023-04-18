package aleksandar.stiegler;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TernarnaStruktura {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		// Deklarisanje podataka 
		double x, y;  
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));  
	
		// Unos podatka x 
		System.out.print("Unesite vrednost za x: "); 
		
		x = Double.parseDouble(ulaz.readLine());
		
		// Primena uslovnog operatora 
	
		y = (x >= 0) ? x : -x;  // Ternarni iliti uslovni operator  ?  :  
	
		// Štampanje rezultata 
	
		System.out.println("Za uneto X = " + x + " dobija se Y = " + y);

	}

}

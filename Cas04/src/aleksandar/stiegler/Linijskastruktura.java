package aleksandar.stiegler;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Linijskastruktura {

	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub
    
		
			double x, y, z, f;  
		// Unos podataka 
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.print("Unesite vrednost za x: "); 
		x = Double.parseDouble(ulaz.readLine());
		System.out.print("Unesite vrednost za y: "); 
		y = Double.parseDouble(ulaz.readLine()); 
		System.out.print("Unesite vrednost za z: "); 
		z = Double.parseDouble(ulaz.readLine()); 
		// Izračunavanje vrednosti funkcije f
		f = Math.pow((x + 3 * z + y) / (2 * x), 4) - x / (x + 3 * z - y); 
		// Štampanje rezultata 
		System.out.println("Vrednost funkcije f je " + f); 
		}
		
	}



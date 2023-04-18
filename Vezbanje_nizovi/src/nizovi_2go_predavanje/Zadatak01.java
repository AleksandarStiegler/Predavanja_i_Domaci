package nizovi_2go_predavanje;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak01 {

	public static void main(String[] args) throws Exception {
	
		
		// Primer 1 predavanje 10.11.2022. slajd 2
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite koliko tacaka poligon ima . n : ");
		int n = Integer.parseInt(bfr.readLine());
		
		double x[] = new double [100];
		double y[] = new double [100];
		
		System.out.println("Unesite koordinate tacaka x i y.");
		for (int i = 1 ; i <= n ; i++ )
		{
			System.out.print("x["+i+"] = ");
			x[i] = Double.parseDouble(bfr.readLine());
			System.out.print("y["+i+"] = ");
			y[i] = Double.parseDouble(bfr.readLine());
		}
		x[0] = x[n];
		x[n+1] = x[1];
		y[0] = y[n+1];
		y[n+1] = y[1];
		
		double suma = 0;
		for (int i = 1; i <= n ; i++) {
			suma += y[i]*(x[i-1]-x[i+1]);}
		double p = 0.5*suma;
		System.out.println("Povrsina poligona je "+p);
	}

}

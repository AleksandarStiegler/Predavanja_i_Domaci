package Zadatak16;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception{
		
		// Ucitati dva realna broja naci njihovu sumu, proizvod i naci koji je veci
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite prvi broj");
		double prvi = Double.parseDouble(bfr.readLine());
		System.out.println("Unesite drugi broj");
		double drugi = Double.parseDouble(bfr.readLine());
		
		SumaBrojeva sb = (x, y) -> x + y;
		ProizvodBrojeva pb = (x , y) -> x * y;
		PoredjenjeBrojeva porbr = (x , y) -> x > y;
		
		System.out.println("Suma brojeva "+ prvi + " i "+drugi+" iznosi "+sb.suma(prvi, drugi) );
		System.out.println("Proizvod brojeva "+ prvi+ " i "+drugi+ " iznosi "+ pb.probr(prvi, drugi));
		if(porbr.poredjenje((int)prvi,(int)drugi)){
			System.out.println("Prvi broj je veci od drugog broja");
		}else {
			System.out.println("Drugi broj je veci od prvog");
		}

	}

}

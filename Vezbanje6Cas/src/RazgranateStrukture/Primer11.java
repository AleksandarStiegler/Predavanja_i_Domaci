package RazgranateStrukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Primer11 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		// Od tri ucitana broja naci najmanji i ispisati njegovu reciprocnu vrednost a ako je najmanji broj nula onda je rezultat 3
		
		
		// Unos podataka
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		double a, b, c, min;
		System.out.println("Unesite vrednosti za brojeve a, b i c");
		a = Double.parseDouble(ulaz.readLine());
		b = Double.parseDouble(ulaz.readLine());
		c = Double.parseDouble(ulaz.readLine());
		
		// Obrada problema
		
		min = a;
		if (min > b)
		{
			min = b;
		}
		if (min > c)
		{
			min = c;
		}
		if (min == 0)
		{
			System.out.println("Najmanji broj je "+min+" a vrednost izraza je 3");
		}
		else
		{
			System.out.println("Najmanji broj je "+min+" a vrednost izraza je "+1/min);
		}
// Moze ovo i lepse da se podeli svaki unos posebno dosta lepse izgleda mogao sam izraz da deklarisem i inicijalizujem pa samo da stampam rezultat
// Mada mi se svidja kako sam ga odradio pa cu ostaviti ovako mislim da je skroz ok
		
		
	}

}

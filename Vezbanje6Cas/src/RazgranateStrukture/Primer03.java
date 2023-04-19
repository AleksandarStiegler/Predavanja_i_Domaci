package RazgranateStrukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Primer03 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		// Napisati program kojim se za unete vrednosti promenljivih a i b izracunava y prema sledecim uslovima
		// za a>=0 y = min(a,b),  za a<0  y = 2min(a,b)
		
		// uradicu ovo na 2 nacina pomocu Math funkcije min a drugi cu da koristim samo if i else tu cemo da se vrtimo u krug
		
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.print("Unesite vrednost za a = ");
		double a = Double.parseDouble(input.readLine());
		System.out.print("Unesite vrednost za b = ");
		double b = Double.parseDouble(input.readLine());
		double y;
		/*
		if (a<0)
			y = 2*Math.min(a, b);
		else
			y = Math.min(a, b);*/
		
		//System.out.println("Vrednost izraza y = "+df.format(y));
		
		// Ok ajde sada da vidimo kolika ce biti zajebancija bez Math funkcije
		
		if (a<0)
			if (a<=b)
				y = 2*a;
			else 
				y = 2* b;
		else
			if (a<=b)
				y = a;
			else
				y = b;
		
		System.out.println("Vrednost izraza y = "+df.format(y));
		
		// Meh kao sto se vidi dobicemo resenje ali ovo je mozda jedno od gorih resenja ali dok radi dobro je
		
		// U svakom slucaju kroz ova vezbanja trenutno je cilj da se upoznam i malo uvezbam sa koriscenjem
		// BufferedReadera i  if, else odnosno razgranate strukture 
		
		
		
		
		
		

	}

}

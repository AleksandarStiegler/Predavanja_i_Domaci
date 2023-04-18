package WhileIForPetlja;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak11 {

	public static void main(String[] args) throws Exception {

		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite vrednost za n : ");
		int n = Integer.parseInt(ulaz.readLine());
		double p = 1.0;
		for (double i = 1.0; i <= n; i++)
			p *= (1 - (1 / (i + 1)));

		System.out.println(p);
	}

}

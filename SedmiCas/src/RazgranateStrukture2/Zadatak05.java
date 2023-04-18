package RazgranateStrukture2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak05 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(ulaz.readLine());
		
		if (x%4==0 && x%100 != 0 || x%400 == 0)
			System.out.println(" Godina je prestupna");
		else
			System.out.println("Godina nije prestupna");

	}

}

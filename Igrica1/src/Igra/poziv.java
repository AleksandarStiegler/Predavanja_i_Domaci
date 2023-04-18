package Igra;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class poziv {
	
	public static int unosBroja() throws Exception {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite broj : ");
		int broj = Integer.parseInt(bfr.readLine());
		return broj;
	}
	

	}



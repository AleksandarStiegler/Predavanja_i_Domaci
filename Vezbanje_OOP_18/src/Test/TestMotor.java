package Test;

import java.io.*;
import Izuzetak.*;

public class TestMotor {

	public static void main(String[] args) throws Exception {

		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Unesite naziv motora");
		String mot = bfr.readLine();
		System.out.println("Unesite kubikazu motora");
		double kubi = Double.parseDouble(bfr.readLine());

		Motor m = new Motor();

		try {
			m.setMotor(mot);
			m.setKubikaza(kubi);
			System.out.println("Podaci o motoru : ");
			System.out.println(m.opis());
		} catch (Izuzetak e) {
			System.out.println("Greska : " + e.getLocalizedMessage());
		}

	}

}

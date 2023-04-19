package RazgranateStrukture;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Primer02 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		// Napisati program kojim se unosi prirodan broj a i ako je neparan ispisuje njegova reciprocna vrednost,
		// a ako je paran ispisuje kvadrat njegovog prethodnika
		
		// Unost podataka
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.println("Unesite prirodan broj a ");
		double a = Double.parseDouble(input.readLine());
		double y;
		
		if (a % 2 != 0)
			y = 1/a;
		else
			y = (a - 1)*(a - 1);
		
		System.out.println("Za unet broj a = " +a+ " dobijena vrednost po y je "+df.format(y));
			
		
		
	}

}

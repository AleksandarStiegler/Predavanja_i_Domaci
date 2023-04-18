package VisestrukogrananjeIFUIFu;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak01 {

	public static void main(String[] args) throws Exception {
		// Ugnjezdeni IF
		
		// Zadatak 1, za uneta 3 broja ispisati najveci broj
		
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Unesite prvi broj : ");
		int br1 = Integer.parseInt(bfr.readLine());
		System.out.println("Unesite drugi broj");
		int br2 = Integer.parseInt(bfr.readLine());
		System.out.println("Unesite treci broj");
		int br3 = Integer.parseInt(bfr.readLine());
		
		int max;
		if (br1>br2)
		{
			if (br1>br3)
			{	
			max = br1;
			}
		}
			else
			{
				max = br3;
			}
		
		{
			if (br2 > br3)
			{
				max = br2;
			}
			else 
			{
				max = br3;
			}
		}
		
		System.out.println("Najveci uneti broj je "+max);
		
	}
		
}

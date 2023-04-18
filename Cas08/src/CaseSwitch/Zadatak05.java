package CaseSwitch;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak05 {

	public static void main(String[] args) throws Exception {
		
		double C1, C2, Ce=0.0;
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Unesite kapacitete kondenzatora C1 i C2");
		C1 = Double.parseDouble(ulaz.readLine());
		C2 = Double.parseDouble(ulaz.readLine());
		System.out.println("Unesite tip veze. 1 za rednu ili 2 za paralelnu");
	
		byte x = Byte.parseByte(ulaz.readLine());
	/*	
		switch (x)
		{
		case 1:
		{
			Ce = C1*C2 / (C1+C2);
			System.out.println("Ekvivalentni kapacitet je Ce = "+Ce);
			break;
		}
		case 2:
		{
			Ce = C1 +C2;
			System.out.println("Ekvivalentni kapacitet je Ce = "+Ce);
			break;
		}
		default :
			System.out.println("Nije dobar znak");
		}
		*/

		if (x==1)
		{
			Ce = C1*C2/(C1+C2);
		
		System.out.println("Ekvivalentni kapacitet je Ce = "+Ce);
		}
		else if (x==2)
		{
			Ce = C1+C2;
			System.out.println("Ekvivalentni kapacitet je Ce = "+Ce);
			
		}
		else 
			System.out.println("Pogresan znak"); 
	}

}

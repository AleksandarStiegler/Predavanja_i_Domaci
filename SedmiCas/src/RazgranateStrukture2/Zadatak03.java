package RazgranateStrukture2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zadatak03 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader ulaz = new BufferedReader(new InputStreamReader(System.in));
		
		double x = Double.parseDouble(ulaz.readLine());
         int y ;
			if (x<0)
			{
				y = -1;
			}
				else if (x==0)
				{
				
					y = 0;
				}
				else
				{
					y = 1;
				}
			System.out.println("Vrednost y je "+y);
			
	}

}

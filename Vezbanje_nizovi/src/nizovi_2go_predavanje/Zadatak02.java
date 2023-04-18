package nizovi_2go_predavanje;

import java.util.Scanner;

public class Zadatak02 {

	public static void main(String[] args) {
		
		// Ispitati da li tacka pripada nekoj od oblasti 1 2 ili 3
		// 10.11.2022. slajd 6
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Unesite broj posmatranih tacaka : ");
		int n = sc.nextInt();
		
		double x[] = new double [100];
		double y[] = new double [100];
		char oblast [] = new char[100];
		
		System.out.println("Unesite koordinate posmatranih tacaka x i y.");
		for (int i = 0 ; i < n; i++)
		{
			System.out.print("x["+i+"] = ");
			x[i] = sc.nextDouble();
			System.out.print("y["+i+"] = ");
			y[i] = sc.nextDouble();
		}
		for (int i = 0; i < n ; i++)
		{
			boolean k1 =  (Math.pow((x[i]-1),2) + y[i]*y[i]) <= 1;
			boolean k2 = (x[i] - 2) * (x[i] - 2) + y[i] * y[i] <=1;
			if (k1 && !k2)
			{
				oblast[i] = '1';
			}
			else if (!k1 && k2)
			{
				oblast[i] = '3';
			}
			else if (k1 && k2)
			{
				oblast[i] = '2';
			}
			else
				oblast[i] = '*';
		}
		System.out.println("tR.BR,\tX\tY\tOblast");
		for (int i = 0; i < n ; i++)
		{
			System.out.println(i+"\t"+x[i]+"\t"+y[i]+"\t"+oblast[i]);
		}
		
		sc.close();
	}

}

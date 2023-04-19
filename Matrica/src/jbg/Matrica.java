package jbg;

public class Matrica {
	
	private int r;
	private int k;
	public double c[][] ;
	Matrica(int a, int b, double c[][]){
	r = a;
	k = b;
	double y = 0;
		for (int i = 0; i<r; i++) {
			for (int j = 0; j<k; j++) {
				c[i][j] = y;
			}
		}
	}

	public void prikaz(int a, int b, double c[][]) {
		for (int i = 0; i<a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.println(c[i][j]+" ");
			}
			System.out.println();
		}
		

	// Ostavicu za uporedjivanje
		
	}

}

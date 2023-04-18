package Matrica;

public class Matr {
	
	private int r;
	private int k;
	private double matr[][];
	
	Matr(int a , int b)
	{
		r = a;
		k = b;
		matr = new double [r][k]; 
		
		for (int i = 0; i < r; i++) { // matr.length
			for (int j = 0; j < k; j++) { // matr[0].length
				matr[i][j]= 1;
			}
		}
	}
	Matr(int u){
		r = k = u;
		matr = new double[r][r];
		matr [1][1] = 3; // Ubaceno da vidim da li matricu formira kako treba
	}
	public  void ispis(Matr A) {
		for (int i = 0; i < r; i++) {
			for (int j =0; j< k; j++) {
			System.out.print(matr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
	public String toString() {
		String s = "";
		for (int i = 0; i < matr.length; i++) {
			for (int j =0; j < matr[0].length; j++) {
				System.out.print(matr[i][j]+" ");
				
			}
			System.out.println();
		}
		return s;
	}
	
	public Matr setEl(int k, int l, double aa) {
		matr[k][l] = aa;
		return this;
	}
	public double getEl(int k, int l) {
		return matr[k][l];
	}

}

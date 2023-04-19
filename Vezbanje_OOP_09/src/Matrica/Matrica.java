package Matrica;

public class Matrica {
	
	private double mat [][];
	
	public Matrica(int v, int k){
		this.mat = new double[v][k];
	}
	public void setElement(int a, int b, double c) {
		mat[a][b]=c;
	}
	public double getElement(int a, int b ) {
		return mat[a][b];
	}
	public double temp;
	public void prikaz() {
		for (int i=0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public void zameni() {
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if (i == j) {
					temp = mat[i][mat.length - 1 -i];
				mat[i][mat.length - 1 -i] = mat[i][j];
				mat[i][j] = temp;}
					
			}
		}
	}

}

package Matrice_i_Nizovi;

public class Zadatak_19 {
	public static void matrica(int x[][], int r, int k) {
		for (int i = 0 ; i < r; i++)
		{
			for (int j = 0 ; j < k; j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		int x [][] = { {1,1,1,1}, {2,2,2,2}, {3,3,3,3}, {4,4,4,4}};
		
		matrica(x , 4, 4);
		
		// Samo bezvezno obnavljanje kad imamo gotov unos
	}

}

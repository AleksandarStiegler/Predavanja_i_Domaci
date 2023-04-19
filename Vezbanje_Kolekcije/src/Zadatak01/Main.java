package Zadatak01;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Unapredjena for petlja
		// i da vidim da li moze kroz matricu
		
		int x[] = {1,2,3,4,5,6,7};
		
		// obicna petlja
		
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
		
		// Unapredjena ista petlja
		// Tip parametra mora biti isti kao i tip niza
		System.out.println();
		for (int c : x) {
			System.out.print(c+" ");
		}
		// Kao sto vidimo dobili smo isto, e sad ajde da vidimo jel mozemo da iskoristimo
		// unapredjenu petlju za matricu
		
		int matra[][] = { {1,2,3} , { 3,4,5} , {4,8,6} , {7,8,9}};
		System.out.println();
		for (int i = 0; i < matra.length; i++) {
			for (int j = 0; j < matra[0].length; j++) {
				System.out.print(matra[i][j] + " ");
			}
			System.out.println();
		}
		
		for (int[] k : matra) {
			System.out.print(k+" "); // Izgleda da ne moze posto ne mozemo da prodjemo
		}						     // kroz obe petlje ostavicu ovako za podsetnik neka ga.
		
		
		
		
	}

}

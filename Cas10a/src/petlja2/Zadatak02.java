package petlja2;

public class Zadatak02 {

	public static void main(String[] args) {
		
		// napisati program koji ce napisati kvadrat i kub
		// brojeva od 1 do 5
		
		// %8d  poravnanje po desnoj strani sirine 8 karaktera
		
		System.out.printf("%8s%8s%8s \n"," Broj "," Kvadrat ", " Kub ");
		
		for(int i = 1; i <= 5 ; i++ )
		{
			System.out.printf("%8d%8d%8d \n",i, i*i, i*i*i);
		}
		
	}

}

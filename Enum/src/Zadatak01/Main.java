package Zadatak01;

public class Main {

	public static void main(String[] args) {
		
		Boje a;
		
		a = Boje.Bela;
		
		System.out.println("Boja : " +a);
		
		if (a == Boje.Zelena) {
			System.out.println("Zelena");
		}else {
			System.out.println("Nije Zelena");
		}
		a = Boje.Zuta;
		switch (a){
		case Crna :
			System.out.println("Crna");
			break;
		case Bela : 
			System.out.println("Bela");
			break;
		case Crvena :
			System.out.println("Crvena");
			break;
		case Zelena:
			System.out.println("Zelena");
			break;
		case Plava :
			System.out.println("Plava");
			break;
		case Zuta :
			System.out.println("Zuta");
			break;
		}
		

	}

}

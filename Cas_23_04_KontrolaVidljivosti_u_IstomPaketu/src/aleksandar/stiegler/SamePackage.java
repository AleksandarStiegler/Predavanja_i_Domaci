package aleksandar.stiegler;

public class SamePackage {
	
	SamePackage(){
		Base b = new Base();
		System.out.println("Konstruktor klase SamePackage");
		
		//System.out.println("n_pri = "+b.n_pri);
		System.out.println("Same package klasa : n_def = "+b.n_def);
		System.out.println("Same package klasa : n_pro = "+b.n_pro);
		System.out.println("Same package klasa : n_pub = "+b.n_pub);
	}

}

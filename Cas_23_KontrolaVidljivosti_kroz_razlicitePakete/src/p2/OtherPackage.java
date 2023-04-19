package p2;

public class OtherPackage {
	OtherPackage() { 
		p1.Base b = new p1.Base(); 
		System.out.println("Konstruktor klase OtherPackage."); 
	// System.out.println("SamePackage Klasa n_pri = "+b.n_pri);
		//System.out.println("SamePackage Klasa n_def = " + b.n_def); 
	//	System.out.println("SamePackage Klasa n_pro = " + b.n_pro);
		System.out.println("SamePackage Klasa n_pub = " + b.n_pub); 
		
	}

}

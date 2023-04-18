package Figura;

public abstract class Figura {
	
	protected double xRef;
	protected double yRef;
	
	Figura(double x, double y){
		if (x == 0.0 || y == 0.0) {
			System.out.println("Greska. Unete vrednosti moraju biti vece od 0 ");
		}
		else {
			this.xRef = x;
			this.yRef = y;
		}
	}
	
	public abstract double obim();
	
	public abstract double povrsina();

}

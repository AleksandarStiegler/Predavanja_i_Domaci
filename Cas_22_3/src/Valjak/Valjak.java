package Valjak;

public class Valjak {
	
	private double poluprecnik, visina;
	
	final double PI = 3.14;
	Valjak(double p, double v){
		poluprecnik = p;
		visina = v;
	}
	Valjak (){
		poluprecnik = 1;
		visina = 1;
	}
	
	 public double getPol() {
		return poluprecnik;
		
	}
	public double getVis() {
		return visina;
	}
	
	double zapremina() {
		return poluprecnik * poluprecnik * PI * visina;
	}
	double povrsina() {
		return 2 * poluprecnik * poluprecnik * PI + 2 * poluprecnik * PI * visina; 
	}
	
	public String prikaz() {
		return "Valjak formiran poluprecnikom "+getPol()+" i visinom "
				+getVis()+ " ima povrsinu "+povrsina()+" i zapreminu " + zapremina();
	}

}

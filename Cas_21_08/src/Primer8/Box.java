package Primer8;

public class Box {
	private double width;
	private double hight;
	private double depth;
	
	
	Box(double w, double h, double d){
		
		width = w;
		hight = h;
		depth = d;
	}
	
	double volume() {
		return width * hight * depth;
	}

}

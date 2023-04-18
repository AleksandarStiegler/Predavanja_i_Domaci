package Primer6;

public class Box {
	
	private double width;
	private double hight;
	private double depth;
	
	void initBox(double w, double h, double d) {
		
		width = d;
		hight = h;
		depth = d;
	}
	
	double volume() {
		return width * hight * depth;
	}

}

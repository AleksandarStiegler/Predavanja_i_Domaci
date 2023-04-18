package Primer9;

public class Box {
	private double width;
	private double hight;
	private double depth;
	
	Box (double width, double hight, double depth){
		this.width = width;
		this.hight = hight;
		this.depth = depth;
	}
	double volume() {
		return width * depth * hight;
	}

}

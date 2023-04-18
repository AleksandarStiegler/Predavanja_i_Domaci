package Primer10;

public class Box {
	
	private double width;
	private double hight;
	private double depth;
	
	Box(){
		width = 1;
		hight = 1;
		depth = 1;
	}
	
	Box (double w, double h, double d){
		width = w;
		hight = h;
		depth = d;
	}
	
	Box (double len){
		width = hight = depth = len;
	}
	
	Box (Box b){
		width = b.width;
		hight = b.hight;
		depth = b.depth;
	}
	
	
	double volume() {
		return width * depth * hight;
	}

}

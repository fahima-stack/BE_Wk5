
public class Rectangle {

	private double width;
	private double length; 
	private double area; 
	
	public Rectangle(double width, double length) {	//Constructor class, don't want area, will be calculated from width and length. 
		this.width = width;
		this.length = length;
		this.area = width * length; 
	}
		/*
		 * Getter and setters created automatically by clicking on yellow line on private classes
		 */
		
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
		area = width * length; //to update area
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length; 
		area = width * length;
	}

	public double getArea() {
		return area;
	}

//	public void setArea(double area) {
//		this.area = area;
// Don't want setter for area, just want get, don't want to provide rights for someone to set the area. Will be calculated form l&w. 

	}
		



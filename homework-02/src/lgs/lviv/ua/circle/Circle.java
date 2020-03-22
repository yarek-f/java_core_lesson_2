package lgs.lviv.ua.circle;

public class Circle {
	
	double radius = 2.3;
	double diameter = 4.6;
	
	Circle() {
		
	}
	
	Circle(double radius, double diameter) {
		this.radius = radius;
		this.diameter = diameter;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	public String Area_of_Circle () {
		return "The area of the circle = " + (3.14*(diameter*diameter))/4;
	}
	
	public String Length_of_Circle () {
		return "The length of the circle = " + 2 * 3.14 * radius;
	}
	
	
}

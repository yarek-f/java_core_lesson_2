package lgs.lviv.ua.rectangle;

public class Rectangle {
	
	private int length = 3;
	private int width = 4;
	
	Rectangle() {
		
	}
	
	
	Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}

	
	public String Area () {
		return "The area of the rectangle = " +length*width;
	}
	
	public String Perimeter () {
		return "The perimetr of the rectangle = " + (length + width) * 2;
	}

	
	
	
	
}

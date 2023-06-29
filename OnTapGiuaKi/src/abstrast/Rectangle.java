package abstrast;

public class Rectangle extends Shape {

	private double length;
	private double width;

	public Rectangle(Coordinates coordinates, double length, double width) {
		super(coordinates);
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return  width * length;
	}
	

}

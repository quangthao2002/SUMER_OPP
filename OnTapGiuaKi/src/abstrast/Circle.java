package abstrast;

public class Circle extends Shape {

	private double r;

	public Circle(Coordinates coordinates, double r) {
		super(coordinates);
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return  Math.PI * r*r;
	}

}

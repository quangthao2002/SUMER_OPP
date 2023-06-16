package bai7;

public class ToaDo extends HinhTron {

	private String ten;
	private float x;
	private float y;
	
	public ToaDo() {
		this(0,0);
	}

	public ToaDo(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	
}

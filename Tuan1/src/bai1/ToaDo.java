package bai1;

public class ToaDo {

	private int x;
	private int y;
	private String name;
	
	
	public ToaDo() {
		// TODO Auto-generated constructor stub
	}


	public ToaDo(int x, int y, String name) {
		super();
		this.x = x;
		this.y = y;
		this.name = name;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	

	@Override
	public String toString() {
		return "" +name+ "("+x+"," +y+ ")" +"";
	}


//	@Override
//	public String toString() {
//		return " name+ "(" + x + "," + y + ")"";
//	}
	
	
}

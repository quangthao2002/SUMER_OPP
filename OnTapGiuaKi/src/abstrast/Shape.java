package abstrast;

public abstract  class Shape {

	private Coordinates coordinates;

	public  abstract  double tinhDienTich();


	public Shape(Coordinates coordinates) {
		super();
		this.coordinates = coordinates;

	}

	public Coordinates getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

}

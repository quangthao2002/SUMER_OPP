package abstrast;

public class Test {
	
	public static void main(String[] args) {
		Coordinates coordinates = new Coordinates(5,6);
		
		
			Shape shape1 = new Rectangle(coordinates, 5, 10);
			Shape shape2 = new Circle(coordinates, 10);
			
			System.out.println(shape1.tinhDienTich());
			shape1.tinhDienTich();
			shape2.tinhDienTich();
	}
}

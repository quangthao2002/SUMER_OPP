package bai9;

public class Polygon extends Shape{

	@Override
    public void draw() {
        System.out.println("Drawing a Polygon");
    }
  
    @Override
    public void erase() {
        System.out.println("Erasing a Polygon");
    }
  
    @Override
    public void move(int x, int y) {
        System.out.println("Moving a Polygon to (" + x + ", " + y + ")");
    }

}

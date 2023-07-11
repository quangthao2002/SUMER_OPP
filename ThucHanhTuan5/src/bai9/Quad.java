package bai9;

public class Quad extends Shape {

	@Override
    public void draw() {
        System.out.println("Drawing a Quad");
    }
  
    @Override
    public void erase() {
        System.out.println("Erasing a Quad");
    }
  
    @Override
    public void move(int x, int y) {
        System.out.println("Moving a Quad to (" + x + ", " + y + ")");
    }

}

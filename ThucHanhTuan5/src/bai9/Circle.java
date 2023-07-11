package bai9;

public class Circle extends Shape {
	@Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
  
    @Override
    public void erase() {
        System.out.println("Erasing a Circle");
    }
  
    @Override
    public void move(int x, int y) {
        System.out.println("Moving a Circle to (" + x + ", " + y + ")");
    }

}

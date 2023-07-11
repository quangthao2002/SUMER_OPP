package bai9;

public class Test {
 public static void main(String[] args) {
	
	 Drawing drawing = new Drawing();
     
     // Tạo các đối tượng Shape
     Circle circle = new Circle();
     Quad quad = new Quad();
     Restangle rectangle = new Restangle();
     Triangle triangle = new Triangle();
     Polygon polygon = new Polygon();
     
     // Gọi phương thức drawShape() của đối tượng Drawing
     drawing.drawShape(circle);
     drawing.drawShape(quad);
     drawing.drawShape(rectangle);
     drawing.drawShape(triangle);
     drawing.drawShape(polygon);
 }
}


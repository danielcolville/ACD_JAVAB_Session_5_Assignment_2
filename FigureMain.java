package session5;

public class FigureMain {

	public static void main(String[] args) {
		Rectangle Rect=new Rectangle(5,6);
		Rect.findArea();
		Rect.findPerimeter();
		Triangle tri=new Triangle(4,5,6);
		tri.findArea();
		tri.findPerimeter();
		Circle ci=new Circle(5);
		ci.findArea();
		ci.findPerimeter();
	}

}

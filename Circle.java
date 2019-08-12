package session5;

public class Circle extends Figure {
	private double rad;
	Circle(double radius) {
		rad=radius;
	}
	@Override
	void findArea() {
		System.out.println("Circle area is "+Math.PI*rad*rad);
	}

	@Override
	void findPerimeter() {
		System.out.println("Circle circumfrence is "+2*Math.PI*rad);
	}

}

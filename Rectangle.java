package session5;

public class Rectangle extends Figure {
	double length;
	double width;
	Rectangle(double len,double wd) {
		length=len;
		width=wd;
	}
	@Override
	void findArea() {
		System.out.println("Rectangle area is "+length*width);
	}

	@Override
	void findPerimeter() {
		System.out.println("Rectangle perimeter is "+(2*length+2*width));
	}

}

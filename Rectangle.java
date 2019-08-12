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
		// TODO Auto-generated method stub
		System.out.println("Rectangle area is "+length*width);
	}

	@Override
	void findPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Rectangle perimeter is "+(2*length+2*width));
	}

}

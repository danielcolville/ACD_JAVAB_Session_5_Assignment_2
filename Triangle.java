package session5;

public class Triangle extends Figure {
	double a;
	double b;
	double c;
	Triangle(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	@Override
	void findArea() {
		// TODO Auto-generated method stub
		double s=(a+b+c)/2;
		
		System.out.println("Triangle area is "+Math.sqrt(s*(s-a)*(s-b)*(s-c)));
		
	}

	@Override
	void findPerimeter() {
		// TODO Auto-generated method stub
		System.out.println("Triangle perimeter is "+(a+b+c));
	}

}

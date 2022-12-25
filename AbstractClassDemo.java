package demos;

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rectangle = new Rectangle(3,4);
		System.out.println(rectangle.area());
		System.out.println(rectangle.perimeter());
		int r = 4;
		rectangle.getPrint(r);
		rectangle.hello();
		
		Shape circle = new Circle(4);
		System.out.println(circle.area());
		System.out.println(circle.perimeter());
		circle.hello();

	}

}

abstract class Shape{
	int r;
	void getPrint(int r) {
		System.out.println(r);
	}
	void hello() {
		System.out.println("this is a geometrical shape");
	}
	abstract double area();
	abstract double perimeter();
}

class Rectangle extends Shape{
	double l;
	double b;
	
	Rectangle(double l, double b){
		this.l = l;
		this.b= b;
	}
	
	public double area() {
		return (this.l*this.b);
	}
	
	public double perimeter() {
		return (2*(this.l+this.b));
	}
}

class Circle extends Shape{
	double radius;
	final double pi = 3.142;
	
	public Circle(double r) {
		this.radius = r;
	}
	
	public double area() {
		return (pi*radius*radius);
	}
	
	public double perimeter() {
		return (2*pi*radius);
	}
}



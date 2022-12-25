package demos;

public class InterfaceAndAbstractionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Drawable d = new Circle();
//		d.draw();
//		d.display();

	}

}

interface Drawable {
	final int a = 5;
	public void draw();
	default void display() {
		name();
		System.out.println("Drawable");
	}
	private void name() {
		System.out.println("Hello");
	}
}

//class Circle implements Drawable{
//	int radius = 8;
//	
//	public void draw() {
//		System.out.println("Draw a Circle with radius "+8+"cm");
//		System.out.println(a);
//	}
//
//}

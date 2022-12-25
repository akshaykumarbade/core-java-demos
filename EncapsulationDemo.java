package demos;

public class EncapsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle("Defender", 130,"Black");
		System.out.println(v);
		
		v.setName("Dust");
		v.setSpeed(120);
		v.setColor("White");
		System.out.println(v);

	}

}

class Vehicle{
	private String name;
	private double speed;
	private String color;
	
	Vehicle(String name, double speed, String color){
		this.name=name;
		this.speed=speed;
		this.color=color;
	}
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String str) {
		this.name=str;
	}
	
	public double getSpeed() {
		return this.speed;
	}
	
	public void setSpeed(double speed) {
		this.speed=speed;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public String toString() {
		return ("Vehicle Name: "+this.name+" Speed: "+this.speed+" Color: "+this.color);
	}
	
	
}

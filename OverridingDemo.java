package demos;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		Developer d = new Developer();
		Employee e1 = new Developer();
		e.getInfo();
		d.getInfo();
		e1.getInfo();
		d.get();
		e.get();
	}

}


class Employee{
	void getInfo() {
		System.out.println("Hello, I am employee");
	}
	Employee get() {
		System.out.println("Employee");
		return this;
	}
}

class Developer extends Employee{
	void getInfo() {
		System.out.println("Hello, I am Developer");
	}
	
	Developer get() {
		System.out.println("Developer");
		return this;
	}
}
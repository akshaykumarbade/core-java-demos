package demos;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 4;
		int b = 5;
		Adder demo = new Adder(a,b);
		System.out.println(demo.getSum(a, b));
		System.out.println(demo.getSum(3,6,4));
		

	}
	

}

class Adder{
	int a;
	int b;
	
	public Adder(int a, int b) {
		this.a = a;
		this.b= b;
	}
	public int getSum(int a , int b) {
		int sum = a +b;
		return sum;
	}
	
	public int getSum(int a, int b,int c) {
		int sum = a+b+c;
		return sum;
	}
}

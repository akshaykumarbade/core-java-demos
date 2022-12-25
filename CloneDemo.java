package demos;


public class CloneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			A a = new A(3,"Hello");
			A b = (A)a.clone();
			System.out.println("a"+a.toString());
			System.out.println("b"+b.toString());
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

class A implements Cloneable {
	int a;
	String str;
	A(int a, String str){
		this.a = a;
		this.str=str;
	}
	
	@Override
	public String toString() {
		return "[a=" + a + ", str=" + str + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

	    return super.clone();
	}
}

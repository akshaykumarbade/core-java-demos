package demos;

public class ExceptionHandlingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int i=10;
			System.out.println(i/0);
		}
		catch(Exception e) {
			System.out.println(e);
		}
//		catch (ArithmeticException e) {
//			System.out.println(e);
//		} 
		finally {
			System.out.println("Finally block executed...");
		}

	}

}

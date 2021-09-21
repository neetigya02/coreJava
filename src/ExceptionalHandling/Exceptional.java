package ExceptionalHandling;

public class Exceptional {

	public static void main(String args[]) {
		try {
			int a = 30, b = 0;
			int c = a / b;

			/*
			 * if (b == 0) { System.out.println("Can't divide a number by zero");
			 * 
			 * } else { c = a / b; }
			 */
			System.out.println("result =" + c);

		} catch (ArithmeticException e1) {

			System.out.println("In Exceptoion - Can't divide a number by zero");
		}
			try {
				try {
				int num = Integer.parseInt("Edureka");
				System.out.println(num);
				
			 }catch (NumberFormatException e2) {
				System.out.println("In Exceptoion - Number Format Exception");
			}
		
			}finally {
				System.out.println("Other Statement");
			}
	}
}

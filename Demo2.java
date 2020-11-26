
public class Demo2 {
	public final void display() {
		System.out.println("super class method");
	}
	
	public void test() {
		try {
			int number1=10/0;
			
		}
		catch(ArithmeticException e) {
			System.out.println("Exception is catched");
		}
		finally {
			System.out.println("Finally block is executed after catch block");
		}
	}
	

	//final method cannot be override
	
	/* public class Demo2 extends FinalDemo2{
		public final void display() {
			System.out.println("super class method is overridden");
	}
	*/
	
	public void finalize() {
		System.out.println("Finalize method is called");
	}
	
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
			final int var=100;
			//var=20 throws compile-time error
			System.out.println("var:"+var);
			}
			finally {
				System.out.println("Finally block is executed after try block");
			}
			
			Demo2 d= new Demo2();
			d.display();
			d.test();
			d.finalize();
			System.gc(); 
	        System.out.println("Main Completes"); 	
			
	}
}

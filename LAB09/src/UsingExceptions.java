
public class UsingExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			throwException();
		}
		catch(Exception exception) {
			System.out.println("Exception handled in main");
		}
		
		doesNotThrowException();

	}
	
	public static void throwException() throws Exception {
		try {
			System.out.println("Exception handled in method throwException");
			throw new Exception();
		}
		catch(Exception exception) {
			System.out.println("Exception handled in method throwException");
			throw exception;
		}
		
		finally {
			System.out.println("Finally executed in throw Exception");
		}
	}
	
	public static void doesNotThrowException() {
		try {
			System.out.println("Method doesNotThrowException");
			
		}
		
		catch(Exception exception) {
			System.err.println(exception);
		}
		finally {
			System.out.println("Finally executed in doesNotThrowException");
		}
		
		System.out.println("End of method doesNotTheowException");
	}
	

}

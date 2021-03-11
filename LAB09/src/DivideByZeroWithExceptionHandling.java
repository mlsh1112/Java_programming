import java.util.Scanner;
import java.util.InputMismatchException;

public class DivideByZeroWithExceptionHandling {

	public static int quotient(int numerator, int denominator) throws ArithmeticException {
		return numerator/denominator;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner (System.in);
		boolean continueLoop=true;
		
		do {
			try {
				System.out.println("Please enter an interger numerator: ");
				int numerator=scanner.nextInt();
				System.out.println("Please enter an interger denominator: ");
				int denominator=scanner.nextInt();				
				
				int result=quotient(numerator,denominator);
				System.out.printf("%nResult: %d / %d =%d%n",numerator, denominator, result);
				continueLoop=false;
				
			}
			
			catch (InputMismatchException inputMismatchException) {
				System.err.printf("%nException: %s%n",inputMismatchException);
				scanner.nextLine();
				System.out.printf("You must enter intergers. Please try again.%n%n");
				
			}
			
			catch(ArithmeticException arithmeticException) {
				System.out.printf("%nException: %s%n",arithmeticException);
				System.out.printf("Zero is an invalid denominator. Please try again.%n%n");
			}
			
			catch (RuntimeException re)
			{
			     System.err.printf("%nException: %s%n", re);
			 }
		}while(continueLoop);

	}
	

}

package T;

public class PayableInterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Payable[] payableObjects=new Payable[7];
		
		payableObjects[0]=new Invoice("01234","seat",2,375.00);
		payableObjects[1]=new Invoice("56789","tire",4,79.95);
		payableObjects[2]=new SalariedEmployee("Jonh","Smith","111-11-1111",800.00);
		payableObjects[3]=new SalariedEmployee("Lisa","Barnes","888-88-8888",200.00);
		payableObjects[4]=new HourlyEmployee("AAA", "aaa", "222-22-2222", 16.75, 60);
		payableObjects[5]=new CommissionEmployee("BBB", "bbb", "333-33-3333", 10300, .04);
		payableObjects[6]=new BasePlusCommissionEmployee("CCC", "ccc", "444-44-4444", 7000, .04, 300);
		
		System.out.println("Invoice and Employees processed polymorphically: ");
		
		for (Payable currentPayable:payableObjects)
		{
			System.out.printf("%n%s %n%s: $%,.2f%n", currentPayable.toString(),"payment due",currentPayable.getPaymentAmount());
		}

	}

}

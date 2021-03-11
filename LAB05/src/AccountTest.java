import java.util.Scanner;

public class AccountTest {
	public static void main(String[] account1rgs) {
		Account account1 = new Account("account1", 500);
		Account accont2 = new Account("Hong Kil-Dong");

		System.out.printf("%s Balance:$%.2f%n", account1.getName(), account1.getBalance());
		System.out.printf("%s Balance:$%.2f%n", accont2.getName(), accont2.getBalance());

		Scanner input = new Scanner(System.in);

		System.out.printf("Enter deposit amount for account1: ");
		double depositaccount1mount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 Balance%n%n", depositaccount1mount);
		account1.deposit(depositaccount1mount);

		System.out.printf("%s Balance: $%.2f%n", account1.getName(),
				account1.getBalance());
		System.out.printf("%s Balance: $%.2f%n", accont2.getName(), accont2.getBalance());

		System.out.print("Enter deposit amount for b: ");
		depositaccount1mount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 Balance%n%n", depositaccount1mount);
		accont2.deposit(depositaccount1mount);

		System.out.printf("%s Balance: $%.2f%n", account1.getName(),
				account1.getBalance());
		System.out.printf("%s Balance: $%.2f%n%n", accont2.getName(), accont2.getBalance());

	}
}

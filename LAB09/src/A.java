public class A {
	public static void main(String[] args) {
		try {
			System.out.println("A");
			 m();
			System.out.println("B");
		} catch (Exception e) {
			System.out.println("C");
		}  finally		{
			System.out.println("D");
		}
	}// end of main() method

	public static void m() throws Exception{
		System.out.println("E");
		if (true)
			throw new RuntimeException();
		System.out.println("F");
	}
}// end of class

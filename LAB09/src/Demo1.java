import java.io.FileInputStream;
import java.io.FileNotFoundException;

class Demo1 {
	public static FileInputStream CreateFile(String fileName) throws FileNotFoundException {
		FileInputStream fis2 = new FileInputStream(fileName);
		System.out.println("File input stream is created");
		return fis2;
	}

	public static void main(String args[]) throws FileNotFoundException {
		FileInputStream fis1 = null;
		String fileName = "foo.bar";

		System.out.println("File name is " + fileName);
		fis1 = CreateFile(fileName);
		System.out.println("End of the program");
	}
}

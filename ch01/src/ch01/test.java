package ch01;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child c =new child();
	}

}

class parent{
	parent(){
	System.out.println("parent");}
}

class child extends parent{
	child(){
	System.out.println("c");}
}

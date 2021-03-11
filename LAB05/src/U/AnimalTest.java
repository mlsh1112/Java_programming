package U;

public class AnimalTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("polymorphism");
		
		Animal[] animal=new Animal[3];
		animal[0]=new Dog();
		animal[1]=new Cat();
		animal[2]=new Sheep();
		
		animal[0].cry();
		animal[1].cry();
		animal[2].cry();
		
	}

}

abstract class Animal{
	abstract void cry();
}


class Dog extends Animal{
	void cry() {
		System.out.println("waw waw waw");
	}
}

class Cat extends Animal{
	void cry() {
		System.out.println("Miyaw Miyaw Miyaw");
	}
}

class Sheep extends Animal{
	void cry() {
		System.out.println("Ba Ba Ba");
	}
}
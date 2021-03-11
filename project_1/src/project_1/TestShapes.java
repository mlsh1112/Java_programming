package project_1;

public class TestShapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		System.out.println("=== Equilateral Triangle ===");
		EquilateralTriangle t2D= new EquilateralTriangle();
		System.out.println("\n\n=== Square ===");
		Square s2D = new Square();
		System.out.println("\n=== Equilateral Triangle Prism ===");
		EquilateralTriangularPrism ETP = new EquilateralTriangularPrism();
		System.out.println("\n=== Square Prism ===");
		SquarePrism SP=new SquarePrism();
		System.out.println("\n=== Equilateral Triangle Pyramid ===");
		EquilateralTriangularPyramid ETPy = new EquilateralTriangularPyramid();
		System.out.println("\n=== Square Pyramid ===");
		SquarePyramid SPY=new SquarePyramid();
		
		
		System.out.println(t2D);
		System.out.println(s2D);
		System.out.println(ETP);
		System.out.println(SP);
		System.out.println(ETPy);
		System.out.println(SPY);
	
	System.out.println("-> Polymorphism");		
	Shapes[] shape=new Shapes[6];
	System.out.println("=== Equilateral Triangle ===");
	shape[0]=new EquilateralTriangle();
	System.out.println("\n=== Square ===");
	shape[1]=new Square();
	System.out.println("\n=== Equilateral Triangle Prism ===");
	shape[2]=new EquilateralTriangularPrism();
	System.out.println("\n=== Square Prism ===");
	shape[3]=new SquarePrism();
	System.out.println("\n=== Equilateral Triangle Pyramid ===");
	shape[4]=new EquilateralTriangularPyramid();
	System.out.println("\n=== Square Pyramid ===");
	shape[5]=new SquarePyramid();

	
	for(Shapes s:shape) {
		if(s instanceof EquilateralTriangle) {
			EquilateralTriangle pt2D=(EquilateralTriangle) s;
			System.out.println(pt2D);
		}
		else if(s instanceof Square) {
			Square ps2D=(Square) s;
			System.out.println(ps2D);
		}
		else if(s instanceof EquilateralTriangularPrism) {
			EquilateralTriangularPrism pETP=(EquilateralTriangularPrism) s;
			System.out.println(pETP);
		}
		else if(s instanceof SquarePrism) {
			SquarePrism pSP=(SquarePrism) s;
			System.out.println(pSP);
		}
		else if(s instanceof EquilateralTriangularPyramid) {
			EquilateralTriangularPyramid pETPY=( EquilateralTriangularPyramid) s;
			System.out.println(pETPY);
		}
		else if(s instanceof SquarePyramid) {
			SquarePyramid pSPY =(SquarePyramid) s;
			System.out.println(pSPY);
		}

	}
	
	}

}

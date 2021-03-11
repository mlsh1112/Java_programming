package project_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EquilateralTriangularPrism extends EquilateralTriangle {

	private double normalheight;
	private double SATPR;
	private double VTPR;

	EquilateralTriangularPrism() {
		super();
		boolean k = true;

		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Please input Normal Height:");
			setNH(scan.nextDouble());
			setSATPR(getArea(super.getD1(),super.getD2(),super.getD3()));
			setVTPR(getArea(super.getD1(),super.getD2(),super.getD3()));
			
			if (normalheight <= 0)
				throw new missHeight();
			
		} catch (InputMismatchException iME) {
			System.err.printf("%nError:You must enter intergers. Please try again.%n%n");

		} catch (missHeight mH) {
			System.err.printf("%s\n\n", mH.toStirng());
		}

		if (normalheight <= 0) {
			while (k) {
				try {
					Scanner scan = new Scanner(System.in);
					System.out.print("Please enter positive value for height: ");
					setNH(scan.nextDouble());
					if (normalheight < 0) {
						throw new missHeight();
					}
					k = false;

				} catch (InputMismatchException iME) {
					System.err.printf("%nError:You must enter intergers. Please try again.%n%n");

				} catch (missHeight mH) {
					System.err.printf("%s\n\n", mH.toStirng());
				}
			} // while
		}

	}

	
	
	public String toString() {
		return "\nType of shape: Equilateral Triangular Prism \n" 
	            +"\t●coordinates of Vertex One :" + vertex1.getX()+ ", "+vertex1.getY() + "\n"
				+"\t● coordinates of Vertex Two :" + vertex2.getX() +", "+ vertex2.getY() + "\n"
				+"\t● coordinates of Vertex Three :" + vertex3.getX() +", "+ vertex3.getY() + "\n" 
				+"\t● Length of side 1:"+ super.getD1() + "\n" 
				+"\t● Length of side 2:" + super.getD2() + "\n" 
				+"\t● Length of side 3:"+ super.getD3() + "\n" 
				+"\t● Normal Height:" + getNH() + "\n" 
				+"\t● Surface Area:" + getSATPR() + "\n"
				+ "\t● Volume:" + getVTPR() + "\n"
				;

	}
	
	public void setSATPR(double SAT) {
		this.SATPR=SAT*2.0+ (super.getD2() + super.getD3() + super.getD1()) * getNH();
	}

	public double getSATPR() {
		return SATPR;
	}

	public void setNH(double NH) {
		this.normalheight = NH;
	}

	public double getNH() {
		return normalheight;
	}

	public void setVTPR(double SAT) {
		this.VTPR=SAT*getNH();
	}
	public double getVTPR() {
		return VTPR;
	}

	class missHeight extends Exception {

		public String toStirng() {
			return "Error: Normal height should be positive";
		}
	}

}



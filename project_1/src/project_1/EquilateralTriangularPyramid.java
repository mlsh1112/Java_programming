package project_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EquilateralTriangularPyramid extends EquilateralTriangle {


	private double Nh;
	private double Sh;
	private double SATPY;
	private double VTPY;

	EquilateralTriangularPyramid() {
		boolean k = true;

		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Please input Normal Height:");
			setNH(scan.nextDouble());
			setSATPY(getArea(super.getD1(),super.getD2(),super.getD3()));
			setVTPY(getArea(super.getD1(),super.getD2(),super.getD3()));
			
			if (Nh <= 0)
				throw new SmissHeight();
		} catch (InputMismatchException iME) {
			System.err.printf("%nError:You must enter intergers. Please try again.%n%n");

		} catch (SmissHeight mH) {
			System.err.printf("%s\n\n", mH.toStirng());
		}

		if (Nh <= 0) {
			while (k) {
				try {
					Scanner scan = new Scanner(System.in);
					System.out.print("Please input positive value for height: ");
					setNH(scan.nextDouble());
					setSATPY(getArea(super.getD1(),super.getD2(),super.getD3()));
					setVTPY(getArea(super.getD1(),super.getD2(),super.getD3()));
					if (Nh < 0) {
						throw new SmissHeight();
					}

					k = false;

				} catch (InputMismatchException iME) {
					System.err.printf("%nError:You must enter intergers. Please try again.%n%n");

				} catch (SmissHeight mH) {
					System.err.printf("%s\n\n", mH.toStirng());
				}
			} // while

		}

		k = true;

		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Please input Slant Height:");
			setSH(scan.nextDouble());
			setSATPY(getArea(super.getD1(),super.getD2(),super.getD3()));
			setVTPY(getArea(super.getD1(),super.getD2(),super.getD3()));
			if (getSH() <= getNH())
				throw new missSlantHeight();
		} catch (missSlantHeight mSH) {
			System.err.printf("%s\n\n", mSH.toString());
		}

		if (getSH() <= getNH()) {
			while (k) {
				try {
					Scanner scan = new Scanner(System.in);
					System.out.print("Please input correct Slant Height:");
					setSH(scan.nextDouble());
					setSATPY(getArea(super.getD1(),super.getD2(),super.getD3()));
					setVTPY(getArea(super.getD1(),super.getD2(),super.getD3()));
					if (getSH() < getNH()) {
						throw new missSlantHeight();
					}
					k = false;
				} catch (missSlantHeight msh) {
					System.err.printf("%s\n\n", msh.toString());
				}
			}
		}
	}

	public String toString() {
		return "\nType of shape: Equilateral Triangular Pyramid\n" + "	● coordinates of vertex One :" + vertex1.getX()
				+ vertex1.getY() + "\n" + "	● coordinates of vertex Two :" + vertex2.getX() + vertex2.getY() + "\n"
				+ "	● coordinates of vertex Three:" + vertex3.getX() + vertex3.getY() + "\n" + "	● Length of side 1:"
				+ super.getD1() + "\n" + "	● Length of side 2:" + super.getD2() + "\n" + "	● Length of side 3:"
				+ super.getD3() + "\n" + "	● Normal Height:" + getNH() + "\n" + "	● Slant Height:" + getSH() + "\n"
				+ "	● Surface Area:" + getSATPY() + "\n" + "	● Volume:" + getVTPY() + "\n";
	}

	public void setSATPY(double SAT) {
		this.SATPY=SAT + (super.getD2() + super.getD3() + super.getD1()) * getSH() * 0.5;
	}
	
	public double getSATPY() {
		return SATPY;
	}

	public void setVTPY(double SAT) {
		this.VTPY=SAT*getNH()/3;
	}
	
	public double getVTPY() {
		return VTPY;
	}

	public void setNH(double Nh) {
		// TODO Auto-generated method stub
		this.Nh = Nh;
	}

	public double getNH() {
		return Nh;
	}

	public void setSH(double sh) {
		this.Sh = sh;
	}

	public double getSH() {
		return Sh;
	}
	

class missSlantHeight extends Exception {

	public String toString() {
		return "Error: Slant Height should be larger than normal Height. ";
	}
}

class SmissHeight extends Exception{
	public String toStirng() {
		return "Error: Normal height should be positive";
	}
}

}




package project_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquarePyramid extends Square {


	private double NH;
	private double SH;

	SquarePyramid() {
		super();
		boolean k = true;

		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Please input Normal Height:");
			setNH(scan.nextDouble());
			if (getNH() <= 0)
				throw new SPYmissHeight();
		} catch (InputMismatchException iME) {
			System.err.printf("%nError:You must enter intergers. Please try again.%n%n");

		} catch (SPYmissHeight mH) {
			System.err.printf("%s\n\n", mH.toStirng());
		}

		if (getNH() <= 0) {
			while (k) {
				try {
					Scanner scan = new Scanner(System.in);
					System.out.print("Please input positive value for height: ");
					setNH(scan.nextDouble());
					if (getNH() < 0) {
						throw new SPYmissHeight();
					}

					k = false;

				} catch (InputMismatchException iME) {
					System.err.printf("%nError:You must enter intergers. Please try again.%n%n");

				} catch (SPYmissHeight mH) {
					System.err.printf("%s\n\n", mH.toStirng());
				}
			} // while

		}

		k = true;
		
			try {
				Scanner scan = new Scanner(System.in);
				System.out.print("Please input Slant Height:");
				setSH(scan.nextDouble());
				if (getSH() <= getNH())
				throw new SPYmissSlantHeight();
			} catch (SPYmissSlantHeight mSH) {
				System.err.printf("%s\n\n", mSH.toString());
			}
		

		if (getSH() <= getNH()) {
			while (k) {
				try {
					Scanner scan = new Scanner(System.in);
					System.out.print("Please input correct Slant Height:");
					setSH(scan.nextDouble());

					if (getSH() < getNH()) {
						throw new SPYmissSlantHeight();
					}
					k = false;
				} catch (SPYmissSlantHeight msh) {
					System.err.printf("%s\n\n", msh.toString());
				}
			}
		}

	}

	public String toString() {
		return "\nType of shape: Square Pyramid \n" + "	● coordinates of upper left vertex :" + getUL().getX()
				+ getUL().getY() + "\n" + "	● coordinates of lower right vertex:" + getLR().getX() + getLR().getY()
				+ "\n" + "	● Side of a square: 1.00 \n" + "	● normal height: 5.0 \n" + "	● Slant Height: 7.0 \n"
				+ "	● Surface Area: 15.00 \n" + "	● Volume: 1.67\n";
	}

	public double getSASPY() {
		return super.getSAS() + super.getDistance(super.getUL(), super.getLR()) * 4 * 0.5 * getSH();
	}

	public void setNH(double Nh) {
		// TODO Auto-generated method stub
		this.NH = Nh;
	}

	public double getNH() {
		return NH;
	}

	public void setSH(double sh) {
		this.SH = sh;
	}

	public double getSH() {
		return SH;
	}

class SPYmissSlantHeight extends Exception {

	public String toString() {
		return "Error: Slant Height should be larger than normal Height. ";
	}
}

class SPYmissHeight extends Exception{
	public String toStirng() {
		return "Error: Normal height should be positive";
	}
}
}




package project_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquarePrism extends Square {
	private double normalheight;
	

	SquarePrism() {
		super();
		boolean k = true;

		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("Please input Normal Height:");
			setNH(scan.nextDouble());
			if (normalheight <= 0)
				throw new SPmissHeight();
		} catch (InputMismatchException iME) {
			System.err.printf("%nError:You must enter intergers. Please try again.%n%n");

		} catch (SPmissHeight mH) {
			System.err.printf("%s\n\n", mH.toStirng());
		}

		if (normalheight <= 0) {
			while (k) {
				try {
					Scanner scan = new Scanner(System.in);
					System.out.print("Please input positive value for height: ");
					setNH(scan.nextDouble());
					if (normalheight <= 0) {
						throw new SPmissHeight();
					}
					k = false;

				} catch (InputMismatchException iME) {
					System.err.printf("%nError:You must enter intergers. Please try again.%n%n");

				} catch (SPmissHeight mH) {
					System.err.printf("%s\n\n", mH.toStirng());
				}
			} // while
		}
	}

	public String toString() {
		return "\nType of shape: Square Prism \n" + "\t●coordinates of upper left vertex:" + getUL().getX() + " "
				+ getUL().getY() + "\n" + "\t● coordinates of lower right vertex:" + getLR().getX() + " "
				+ getLR().getY() + "\n" + "\t● Side of a square:" + getDistance(getUL(), getLR()) + "\n"
				+ "\t● Normal Height:" + getNH() + "\n" + "\t● Lateral Surface Area:"
				+ getLSA(getDistance(getUL(), getLR())) + "\n" + "\t● Surface Area:"
				+ getSASPR(getDistance(getUL(), getLR())) + "\n" + "\t● Volume:"
				+ getVSPR(getArea(getDistance(getUL(), getLR()), 0, 0)) + "\n";

	}

	private void setNH(double NH) {
		// TODO Auto-generated method stub
		this.normalheight = NH;
	}

	public double getNH() {
		return normalheight;

	}

	public double getLSA(double d) {
		return 4 * d * getNH();
	}

	public double getVSPR(double SAS) {
		return SAS * getNH();
	}

	public double getSASPR(double d) {
		return 2 * getArea(d, 0, 0) + 4 * d * getNH();
	}
	
	
	class SPmissHeight extends Exception {

		public String toStirng() {
			return "Error: Normal height should be positive";
		}
	}
}

package project_1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Square implements Shapes {

	private Point2D UL = new Point2D(); // UL (x1, y1)
	private Point2D LR = new Point2D(); // LR (x4, y4)
	
	private double distance;

	public Square() {
		boolean k = true;

		while (k) {
					
			try {
				Scanner scan = new Scanner(System.in);
				System.out.print("Please input x-coordinate of the Upper Left of the Square :");
				UL.setX(scan.nextDouble());
				System.out.print("Please input y-coordinate of the Upper Left of the Square :");
				UL.setY(scan.nextDouble());
				System.out.print("Please input x-coordinate of the Lower Right of the Square :");
				LR.setX(scan.nextDouble());
				System.out.print("Please input y-coordinate of the Lower Right of the Square :");
				LR.setY(scan.nextDouble());
				if (getUL().getX() == getLR().getX() && getUL().getY() == getLR().getY()) {
					throw new samePoint();
				}
				if (getUL().getX() > getLR().getX()) {
					throw new SmisPointX();
				}
				if (getUL().getY() <getLR().getY()) {
					throw new SmisPointY();
				}
				
				k=false;
				
			}catch(InputMismatchException iME) {
				System.err.printf("%nError:You must enter intergers. Please try again.%n%n"); 	
			}catch(samePoint sP) {
				System.err.printf("%s\n\n",sP.toString());
			}catch(SmisPointX mPX) {
				System.err.printf("%s\n\n",mPX.toString());
			}catch(SmisPointY mPY) {
				System.err.printf("%s\n\n",mPY.toString());
			}
			
		}//while
	}

	public String toString() {
		return
		"\nType of shape: Square \n"+
		"\tCoordinates of upper left vertex : " + getUL().getX() + ", " + getUL().getY() + "\n"+
		"\tCoordinates of lower right vertex : " + getLR().getX() + ", " + getLR().getY() + "\n"+
		"\tSide of a square: " + getDistance(getUL(),getLR())+"\n"+
		"\tSurface Area: " + getArea(getDistance(getUL(),getLR()),0,0);
		
	}

	@Override
	public double getDistance(Point2D v1, Point2D v2) {
		// TODO Auto-generated method stub
		return v2.getX()-v1.getX();
	}

	@Override
	public double getArea(double distance1, double distance2, double distance3) {
		// TODO Auto-generated method stub
		return Math.pow(distance1, 2.0);
	}
	
	public double getSAS() {
		return getArea(getDistance(getUL(),getLR()),0,0);
	}

	public Point2D getUL() {
		return UL;
	}

	public void setUL(Point2D uL) {
		UL = uL;
	}

	public Point2D getLR() {
		return LR;
	}

	public void setLR(Point2D lR) {
		LR = lR;
	}
class samePoint extends Exception {

	public String toString() {
		return "Error: the upper left vertex UL(x1,y1) and lower right vertex LR(x4,y4) are the same\r\n"+ 
				"Please enter valid coordinates.\r\n";
	}

}


class SmisPointX extends Exception {

	public String toString() {
		return "Error: x-coordinate of upper left vertex should be less than x-coordinate of lower right vertex.\r\n" + 
				"Please enter valid coordinates.\r\n";
	}
	
}	

class SmisPointY extends Exception {
	public String toString() {
		return "Error: y-coordinate of upper left vertex should be less than y-coordinate of lower right vertex.\r\n" + 
				"Please enter valid coordinates\r\n";
	}
}
}



package project_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EquilateralTriangle implements Shapes {

	Point2D vertex1 = new Point2D();
	Point2D vertex2 = new Point2D();
	Point2D vertex3 = new Point2D();

	

	private double distance1 ;
	private double distance2 ;
	private double distance3;

	public EquilateralTriangle() {
		boolean k=true;
		while(k) {			
			
			try {
				Scanner scan = new Scanner(System.in);
				
				System.out.printf("Please input x-coordinate of the Vertex 1 of the triangle: ");
				vertex1.setX(scan.nextDouble());
				System.out.printf("Please input y-coordinate of the Vertex 1 of the triangle: ");
				vertex1.setY(scan.nextDouble());
				System.out.printf("Please input x-coordinate of the Vertex 2 of the triangle: ");
				vertex2.setX(scan.nextDouble());
				System.out.printf("Please input y-coordinate of the Vertex 2 of the triangle: ");
				vertex2.setY(scan.nextDouble());
				System.out.printf("Please input x-coordinate of the Vertex 3 of the triangle: ");
				vertex3.setX(scan.nextDouble());
				System.out.printf("Please input y-coordinate of the Vertex 3 of the triangle: ");
				vertex3.setY(scan.nextDouble());
				

				setD1(getDistance(vertex1,vertex2));
				setD2(getDistance(vertex1,vertex3));
				setD3(getDistance(vertex2,vertex3));
				
				
				if(calculateAngle(vertex1,vertex2,vertex3)) {
				
					throw new straightLineException ();
				}
				k=false;
				
				if(!(distance1==distance2&&distance1==distance3&&distance2==distance3)) {
			
				throw new notEquilateraltriangle();
					
				}

			}catch(InputMismatchException iME) {
				System.err.printf("%nError:You must enter intergers. Please try again.%n%n"); 
			}catch(straightLineException sLE) {
				System.err.printf("%s\n\n",sLE.toString());
			}catch(notEquilateraltriangle nE) {
				System.err.printf("%s\n\n",nE.toString());
			}
			
		}
	}

	boolean calculateAngle(Point2D v1, Point2D v2, Point2D v3) {
		double dx1=v2.getX()-v1.getX();
		double dy1=v2.getY()-v1.getY();
		 
		double dx2=v3.getX()-v1.getX();
		double dy2=v3.getY()-v1.getY();
		
		double dx3=v3.getX()-v2.getX();
		double dy3=v3.getY()-v2.getY();
		
		if(dx1==0||dx2==0||dx3==0) {
			if(dx1==0&&dx2==0&&dx3==0) return true;
			else return false;
		}
		else if(dy1/dx1==dy2/dx2||dy1/dx1==dy3/dx3||dy2/dx2==dy3/dx3) return true;
		
		return false;
	}

	public String toString() {
		return "\nType of shape: Equilateral Triangle "+
	           "\n\tCoordinates of Vertex One:"+vertex1.getX()+", "+vertex1.getY()+
	           "\n\tCoordinates of Vertex Two:"+vertex2.getX()+", "+vertex2.getY()+
	           "\n\tCoordinates of Vertex Three:"+vertex3.getX()+", "+vertex3.getY()+
	           "\n\tLength of side 1:"+getD1()+
	           "\n\tLength of side 2:"+getD2()+
	           "\n\tLength of side 3:"+getD3()+
	           "\n\tSurface Area:"+getArea(distance1,distance2, distance3); 
	}
	
	public double getD1() {
		return distance1;
	}
	public void setD1(double D1) {
		this.distance1=D1;
	}
	
	
	public double getD2() {
		return distance2;
	}
	public void setD2(double D2) {
		this.distance2=D2;
	}
	
	
	public double getD3() {
		return distance3;
	}
	
	public void setD3(double D3) {
		this.distance3=D3;
	}
	
	
	@Override
	public double getDistance(Point2D v1, Point2D v2) {
		// TODO Auto-generated method stub
		double distance = Math.sqrt(Math.pow(v1.getX() - v2.getX(), 2.0) + Math.pow(v1.getY() - v2.getY(), 2.0));
		return distance;
	}

	@Override
	public double getArea(double distance1, double distance2, double distance3) {
		// TODO Auto-generated method stub
		double p = (distance1 + distance2 + distance3) / 2;

		return Math.sqrt(p * (p - distance1) * (p - distance2) * (p - distance3));
	}
	


class notEquilateraltriangle extends Exception {

	public String toString() {
		return "Warning: the three sides are not equal, but continue your operation.";
	}
}

class straightLineException extends Exception {

public String toString() {
	return "Error: the three vertices are collinear. Please enter non-collinear vertices";
}

}
	
	
}

	


	
	

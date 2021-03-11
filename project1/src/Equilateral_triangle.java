import java.util.InputMismatchException;
import java.util.Scanner;

public class Equilateral_triangle<vertex1> implements shape {

	private point2D vertex1 = new point2D();
	private point2D vertex2 = new point2D();
	private point2D vertex3 = new point2D();

	Scanner scan = new Scanner(System.in);
	
	private double distanceA; //vertex1~vertex2
	private double distanceB; //vertex1~vertex3
	private double distanceC; //vertex2~vertex3
	
	
	public Equilateral_triangle() {
		boolean k=true;
		
		while(k) {
			try {
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
			
				setDA(getDistance(vertex1.getX(), vertex1.getY(),vertex2.getX(),vertex2.getY()));
				setDB(getDistance(vertex1.getX(),vertex1.getX(),vertex3.getX(),vertex3.getY()));
				setDC(getDistance(vertex2.getX(),vertex2.getY(),vertex3.getX(),vertex3.getY()));
				
				if(calAngle(vertex1,vertex2,vertex3)) {
					throw new straightLineException ();
				}
				
				k=false;
				
				if(distanceA!=distanceB||distanceA!=distanceC||distanceB!=distanceC) {
					throw new notEquilateraltriangle();
				}
				
			}catch(InputMismatchException IME) {
				System.err.printf("%nException: %s%n",IME);
			}
			}catch(straightLineException sL) {
				System.out.printf("%s\n\n",sL.toString());
			}catch(notEquilateraltriangle nE) {
				System.out.printf("%s\n\n", nE.toString());
			}
			
		}
		
	}
	boolean calAngle(point2D v1, point2D v2, point2D v3) {
		double dx1=v2.getX()-v1.getX();
		double dy1=v2.getY()-v1.getY();
		 
		double dx2=v3.getX()-v1.getX();
		double dy2=v3.getY()-v1.getY();
		
		double dx3=v3.getX()-v2.getX();
		double dy3=v3.getY()-v2.getY();
		
		if(dy1==0||dy2==0||dy3==0) {
			if(dy1==0&&dy2==0&&dy3==0) return true;
			else return false;
		}
		else if(dx1/dy1==dx2/dy2||dx1/dy1==dx3/dy3||dx2/dy2==dx3/dy3) return true;
		
		return false;
	}
	
	public String toString() {
		return "Type of shape: Equilateral Triangle "+
	           "\n\tCoordinates of Vertex One:"+vertex1.getX()+vertex1.getY()+
	           "\n\tCoordinates of Vertex Two:"+vertex2.getX()+vertex2.getY()+
	           "\n\tCoordinates of Vertex Three:"+vertex3.getX()+vertex3.getY()+
	           "\n\tLength of side 1:"+getDA()+
	           "\n\tLength of side 2:"+getDB()+
	           "\n\tLength of side 3:"+getDC()+
	           "\n\tSurface Area:"+getArea(); 
	}
	
	public double getDA() {
		return distanceA;
	}
	public void setDA(double dA) {
		this.distanceA=dA;
	}
	
	
	public double getDB() {
		return distanceB;
	}
	public void setDB(double dB) {
		this.distanceB=dB;
	}
	
	
	public double getDC() {
		return distanceC;
	}
	
	public void setDC(double dC) {
		this.distanceC=dC;
	}
	
/*	public double SAT(double dA,double dB, double dC) {
		double p=(dA+dB+dC)/2;
		double SAT=Math.sqrt(p*(p-dA)*(p-dB)*(p-dC));		
		
		return SAT;
	}*/
	
	@Override
	public double getDistance(double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		return Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0));
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
	double dA=this.getDA(); double dB=this.getDB(); double dC=this.getDC();
	double p=(dA+dB+dC)/2;
	
	return Math.sqrt(p*(p-dA)*(p-dB)*(p-dC));
	}

}

import java.util.Scanner;

public class square implements shape {

	private print2D UL = new print2D(); // UL (x1, y1)
	private print2D LR = new print2D(); // LR (x4, y4)

	Scanner scan = new Scanner(System.in);

	private double distance;
	boolean k = true;

	public square() {
		while (k) {
			try {
				System.out.print("Please input x-coordinate of the Upper Left of the Square :");
				UL.setX(scan.nextDouble());
				System.out.print("Please input y-coordinate of the Upper Left of the Square :");
				UL.setY(scan.nextDouble());
				System.out.print("Please input x-coordinate of the Lower Right of the Square :");
				LR.setX(scan.nextDouble());
				System.out.print("Please input y-coordinate of the Lower Right of the Square :");
				LR.setY(scan.nextDouble());

				if (UL.getX() == LR.getX() && UL.getY() == LR.getY()) {
					throw new samePoint();
				}

				if (UL.getX() >= LR.getX()) {
					throw new misPointX();
				}
				if (UL.getY() <=LR.getY()) {
					throw new misPointY();
				}
				
				k=false;

			} catch (samePoint sP) {
				System.out.printf("%s\n\n", sP.toString());
			} catch (misPointX mP) {
				System.out.printf("%s\n\n", mP.toString());
			} catch (misPointY mY) {
				System.out.printf("%s\n\n", mY.toStirng());
			}
		}
	}

	public String toString() {
		return
		"\t¡ÜCoordinates of upper left vertex : " + UL.getX() + ", " + UL.getY() + "\n"+
		"\t¡ÜCoordinates of lower right vertex : " + LR.getX() + ", " + LR.getY() + "\n"+
		"\t¡ÜSide of a square: " + getD()+
		"\t¡ÜSurface Area: " + getArea();
		
	}

	private double getD() {
		// TODO Auto-generated method stub
		return distance;
	}

	@Override
	public double getDistance(double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		return (Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0))) / Math.sqrt(2.0);
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double s=this.distance;
		return Math.pow(s, 2.0);
	}

}

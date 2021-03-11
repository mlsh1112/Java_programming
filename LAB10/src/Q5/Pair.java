package Q5;

import java.util.Scanner;

public class Pair<F, S> {
	private F f;
	private S s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("First Field      Second Field ");
		int first;
		String second;
		Scanner scan = new Scanner(System.in);
		Pair <Integer, String> p0= new Pair<>();
		Pair <Integer, String> p1= new Pair<>();
		Pair <Integer, String> p2= new Pair<>();
		
		p0.setF(scan.nextInt());
		p0.setS(scan.nextLine());

		p1.setF(scan.nextInt());
		p1.setS(scan.nextLine());
		
		p2.setF(scan.nextInt());
		p2.setS(scan.nextLine());
		
		System.out.println();
		System.out.printf("Original pair: (%d, %s)\n", ((Pair) p0).getF(),((Pair) p0).getS());
		System.out.printf("Modified pair: (%d, %s)\n", ((Pair) p1).getF(),((Pair) p1).getS());
		System.out.printf("               (%d, %s)\n", ((Pair) p2).getF(),((Pair) p2).getS());
	}

	public void setF(F f) {
		this.f = f;
	}

	public F getF() {
		return f;
	}

	public void setS(S s) {
		this.s = s;
	}

	public S getS() {
		return s;
	}

}

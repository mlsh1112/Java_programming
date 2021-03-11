
import java.util.List;
import java.util.Scanner;


public class Pair<F, S> {
	private F f;
	private S s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("First Field      Second Field ");
		int first;
		String second;

		List<Pair>[] p = new List[3];
        Scanner scan = new Scanner(System.in);
		
        for (int i = 0; i < 3; i++) {
			((Pair) p[i]).setF(scan.nextInt());
			((Pair) p[i]).setF(scan.nextInt());

		}
		
		System.out.printf("Original pair: (%d, %s)\n", ((Pair) p[0]).getF(),((Pair) p[0]).getS());
		System.out.printf("Modified pair: (%d, %s)\n", ((Pair) p[1]).getF(),((Pair) p[1]).getS());
		System.out.printf("               (%d, %s)\n", ((Pair) p[2]).getF(),((Pair) p[2]).getS());

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

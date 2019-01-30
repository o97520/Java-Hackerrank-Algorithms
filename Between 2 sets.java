import java.util.*;
public class Solution2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		int[] b = new int[m];
		for (int b_i = 0; b_i < m; b_i++) {
			b[b_i] = in.nextInt();
		}
		int x = 0;
		int counter = 0;
		int guess1 = a[n-1];
		int multip = 1;
		while (counter != a.length) {
			counter = 0;
			x = guess1 * multip;
			for (int i : a) {
				if ((x % i) == 0) {
					counter++;
				}
			}
			multip++;
		}
		int D = x;
		counter = 0;
		multip = 1;
		x = 0;
		int J = b[m-1];
		int Finale = 0;
		while (x < (J / 2)) {
			counter = 0;
			x = D * multip;
			for (int y : b) {
				if ((y % x) == 0) {
					counter++;
				}
			}
			if (counter == b.length) {
				Finale++;
			}
			multip++;
		}
		System.out.println(Finale);
	}
}
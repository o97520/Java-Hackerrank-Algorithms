import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class soly3 {
	static int j = 0;
	static int last_counter = 0;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = migratoryBirds(n, ar);
		System.out.println(result);
	}

	static int migratoryBirds(int n, int[] ar) {
		int[] A = new int[5];
		A[0] = check(1, ar); // 0 -> 1
		A[1] = check(2, ar);
		A[2] = check(3, ar);
		A[3] = check(4, ar);
		A[4] = check(5, ar);
		return A[4];

	}

	private static int check(int i, int[] ar) {
		int counter = 0;
		for (int j : ar) {
			if (j == i) {
				counter++;
			}
		}

		if (last_counter < counter) {
			last_counter = counter;
			 j = i;
		}
		return j;
	}
}

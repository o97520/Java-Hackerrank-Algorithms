import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			int n = in.nextInt();
			solute(n);
		}

	}

	private static void solute(int n) {
		int x = 0;
		int d = (int) (n / 3);
		System.out.printf("d = %d \n", d);

		if ((n % 3) == 0) {
			for (int i = 1; i < d; i++) {
			int j = (i * 3);
				if ((j % 5) == 0) {
					x += 0;
				} else {
					x += j;
				}
			}

		} else {
			for (int i = 1; i <= d; i++) {
			int j = (i * 3);
				if ((j % 5) == 0) {
					x += 0;
				} else {
					x += j;
				}
			}
		}

		int y = 0;
		int f = (int) (n / 5);
		System.out.printf("f = %d \n", f);
		if ((n % 5) == 0) {
			for (int i = 1; i < f; i++) {
				y = y + (i * 5);
			}

		} else {
			for (int i = 1; i <= f; i++) {
				y = y + (i * 5);
			}
		}
		int Q = x + y;
		System.out.println(Q);
	}
}

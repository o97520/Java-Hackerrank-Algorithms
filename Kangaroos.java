import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x1 = in.nextInt();
		int v1 = in.nextInt();
		int x2 = in.nextInt();
		int v2 = in.nextInt();
		String result = kangaroo(x1, v1, x2, v2);
		System.out.println(result);
	}

	static String kangaroo(int x1, int v1, int x2, int v2) {
		int e = 0;
		int i = 1;
		String n = "NO";
		String y = "YES";

		boolean b1 = x1 > x2;
		while (e == 0) {
			int pos1 = x1 + (v1 * i);
			int pos2 = x2 + (v2 * i);
			boolean b2 = pos1 > pos2;

			if (pos1 == pos2) {
				e = 1;
			}
			if (b2 != b1) {
				return n;
			}
			i++;
		}
		return y;

	}
}

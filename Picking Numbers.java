import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static ArrayList<Integer> pickingNumbers(int[] a) {
		int counter = 0;
		int maximum = 0;
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			counter = 0;
			A = new ArrayList<Integer>();
			A.add(a[i]);
			for (int j = 0; j < a.length; j++) {
				if (j != i) {
					if (a[i] == a[j] || a[i] - a[j] == 1) {
						A.add(a[j]);
						counter++;
					}
				}
				if (counter > maximum) {
					maximum = counter;
					B = A;
				}
			}
		}

		return B;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		ArrayList result = pickingNumbers(a);
		System.out.println(result.size());
		in.close();
	}
}

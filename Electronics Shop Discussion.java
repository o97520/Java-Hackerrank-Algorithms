import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static int getMoneySpent(int[] keyboards, int[] drives, int s) {
		int lengthk = keyboards.length;
		int lengthd = drives.length;
		int maximum = -1;
		Arrays.sort(keyboards);
		Arrays.sort(drives);
		int[] drive1 = new int[drives.length];
		int k = 0;
		for (int i = drives.length - 1; i >= 0; i--) {
			drive1[k] = drives[i];
			k++;
		}
		for (int i = 0; i < drive1.length; i++) {
			for (int j = 0; j < keyboards.length; j++) {
				if (drive1[i] + keyboards[j] > s) {
					break;
				}
				if (drive1[i] + keyboards[j] > maximum) {
					maximum = drive1[i] + keyboards[j];
				}
			}
		}
		return maximum;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int n = in.nextInt();
		int m = in.nextInt();
		int[] keyboards = new int[n];
		for (int keyboards_i = 0; keyboards_i < n; keyboards_i++) {
			keyboards[keyboards_i] = in.nextInt();
		}
		int[] drives = new int[m];
		for (int drives_i = 0; drives_i < m; drives_i++) {
			drives[drives_i] = in.nextInt();
		}
		// The maximum amount of money she can spend on a keyboard and USB
		// drive, or -1 if she can't purchase both items
		int moneySpent = getMoneySpent(keyboards, drives, s);
		System.out.println(moneySpent);
	}
}

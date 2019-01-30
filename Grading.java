import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner x = new Scanner(System.in);
		int n = x.nextInt();
		int[] grades = new int[n];
		for (int grade = 0; grade  n; grade++) {
			grades[grade] = x.nextInt();
		}
		solve(grades);
	}

	static void solve(int[] grades) {
		for (int i = 0; i  grades.length; i++) {
			if (grades[i] = 38) {
				int d = grades[i] % 5;
				if (d = 3) {
					grades[i] = grades[i] + (5 - d);
				}
			}
		}
		for (int i = 0; i  grades.length; i++) {
			System.out.print(grades[i] + n);
		}

	}
}

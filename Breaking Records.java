import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class soly3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] score = new int[n];
		for (int score_i = 0; score_i < n; score_i++) {
			score[score_i] = in.nextInt();
		}
		breakingRecords(score);
	}

	static void breakingRecords(int[] score) {
		int holder = score[0];
		int most = 0;
		int least = 0;
		for (int i = 1; i < score.length; i++) {
			if (score[i] > holder) {
				most++;
				holder = score[i];
			}
		}
		holder = score[0];
		for (int i = 1; i < score.length; i++) {
			if (score[i] < holder) {
				least++;
				holder = score[i];
			}
		}
		System.out.print(most);
		System.out.println(" " + least);
	}

}

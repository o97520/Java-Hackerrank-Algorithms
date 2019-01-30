import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class soly3 {

	static int sockMerchant(int n, int[] ar) {
		int counter = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("i : " + i + "  ");
			if (ar[i] != -1) {
				for (int j = i + 1; j < n; j++) {
					System.out.println("j = " + j + " ");
					if (ar[i] != -1) {
						if (ar[i] == ar[j]) {
							counter++;
							ar[i] = -1;
							ar[j] = -1;
							System.out.println("counter = " + counter);
						}
					}
				}
			} else {

			}
		}
		return counter;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int result = sockMerchant(n, ar);
		System.out.println(result);
	}
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class soly3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] ar = new int[n];
		for (int ar_i = 0; ar_i < n; ar_i++) {
			ar[ar_i] = in.nextInt();
		}
		int b = in.nextInt();
		int x = 0;
		for (int i : ar) {
			x += i;
		}
		x-= ar[k];
		int sum = x / 2;
		int difference = Math.abs(b - sum);
		if (difference == 0) {
			System.out.println("Bon Appetit");
		}else{
			System.out.println(difference);
		}
	}
}

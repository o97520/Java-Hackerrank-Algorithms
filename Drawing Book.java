import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class soly3 {

	static int solve(int n, int p) {
		int[] array = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			array[i] = i;
		}

		int flips1 = p / 2; // FLIPS FROM FIRST PAGE
		int flips2;

		if (n % 2 != 0 && p % 2 == 0 && n - p == 1) {
			flips2 = 0;
		}

		
			flips2 = (int) Math.ceil((n - p) / 2);
		if ((n % 2) != 0 && (p % 2) == 0) { // FLIPS FROM THE LAST PAGE
			flips2 = (n - p) / 2;
		} else if(n % 2 == 0  && p % 2 != 0){
			flips2 = (int) Math.ceil((double)(n - p) / 2);
		}
		
		if( flips1 < flips2){
			return flips1;
		}else{
			return flips2;
		}
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		int n = in.nextInt();
		for (int i = 0; i < t; i++) {
			int p = in.nextInt();
			int result = solve(n, p);
			System.out.println(result);
		}
	}
}

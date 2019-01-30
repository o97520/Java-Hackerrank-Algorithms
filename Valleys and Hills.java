import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static int countingValleys(int n, String s) {
		int position = 0;
		int counter = 0;
		int previous_position = 0;
		for (int i = 0; i < n; i++) {
			if(s.charAt(i) == 'D'){
				position--;
			}
			if(s.charAt(i) == 'U'){
				position++;
			}
			if(position < 0 && previous_position == 0){
				counter++;
			}
			previous_position = position;

			
		}
		return counter;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = in.next();
		int result = countingValleys(n, s);
		System.out.println(result);
		in.close();
	}
}
